package pl.bartixen.bxcit.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import pl.bartixen.bxcit.Commands.Skins;
import pl.bartixen.bxcit.Data.ItemBuilder;
import pl.bartixen.bxcit.Data.SkinsDataManager;
import pl.bartixen.bxcit.Main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.UUID;

public class MenuListener implements Listener {

    static Main plugin;

    static SkinsDataManager data;

    public MenuListener(Main m) {
        plugin = m;
        data = SkinsDataManager.getInstance();
    }

    @EventHandler
    public void Menu(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equals("§9§lMenu skinów")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 10) {
                    p.closeInventory();
                    ArmListener.arm(p);
                }
                if (e.getRawSlot() == 12) {
                    p.closeInventory();
                    BowListener.bow(p);
                }
                if (e.getRawSlot() == 14) {
                    p.closeInventory();
                    SwordListener.sword(p);
                }
                if (e.getRawSlot() == 16) {
                    p.closeInventory();
                    ElytraListener.elytra(p);
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    AxeListener.axe(p);
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ArmorPages.armorpages1(p);
                }
                if (e.getRawSlot() == 36) {
                    p.closeInventory();
                    pkt(p);
                }
            }
        }
    }

    public static String losowanie(int n)
    {
        char[] base = new char[n];

        for (int i = 0; i <n; i++)
        {
            base[i] = (char) (((int)(Math.random() * 26)) + (int)'a');
        }

        return (new String(base, 0, n));
    }

    static ArrayList<String> listpkt = new ArrayList<>();

    @EventHandler
    public void Pkt(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        UUID uuid = p.getUniqueId();
        if (e.getView().getTitle().equals("§9§lDodaj punkty do konta")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 13) {
                    p.closeInventory();
                    int pkt_diamend = plugin.getConfig().getInt("pkt.diamond");
                    int pkt_netherite = plugin.getConfig().getInt("pkt.netherite");
                    int pkt_gracza = data.getData().getInt(uuid + ".pkt");
                    int diamonds = 0;
                    for(int n = 0; n <= 64; n++) {
                        if (p.getInventory().contains(Material.DIAMOND, n)) {
                            diamonds = n;
                        }
                    }
                    int netherite = 0;
                    for(int n = 0; n <= 64; n++) {
                        if (p.getInventory().contains(Material.NETHERITE_INGOT, n)) {
                            netherite = n;
                        }
                    }
                    if (diamonds > 0 || netherite > 0) {
                        removeItems(p.getInventory(), Material.DIAMOND, diamonds);
                        removeItems(p.getInventory(), Material.NETHERITE_INGOT, netherite);
                        int pkt = diamonds * pkt_diamend + netherite * pkt_netherite;
                        int wszystkie_pkt = pkt_gracza + pkt;
                        Date now = new Date();
                        listpkt = (ArrayList<String>) data.getData().getStringList(uuid + ".lista_pkt");
                        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
                        String wplacenie = losowanie(6);
                        data.getData().set(uuid + ".pkt", wszystkie_pkt);
                        data.getData().set(uuid + ".nick", p.getName());
                        data.getData().set(uuid + ".doladowania." + wplacenie + ".ilosc", pkt);
                        data.getData().set(uuid + ".doladowania." + wplacenie + ".data", format.format(now));
                        data.getData().set(uuid + ".doladowania." + wplacenie + ".diamond", diamonds);
                        data.getData().set(uuid + ".doladowania." + wplacenie + ".netherite", netherite);
                        listpkt.add(wplacenie);
                        data.getData().set(uuid + ".lista_pkt", listpkt);
                        data.saveData();
                        p.sendMessage("§fPomyślnie dodano §9" + pkt + " pkt. §fdo twojego konta §7(Diamond - " + diamonds + ", Netherite Ingot - " + netherite + ") [ID:" + wplacenie + "]");
                        PlayMusic.PlayMusicYes(p);
                    } else {
                        p.sendMessage("§7Brak przedmiotów w ekwipunku");
                        PlayMusic.PlayMusicError(p);
                    }
                }
                if (e.getRawSlot() == 26) {
                    p.closeInventory();
                    Skins.menu(p);
                }
            }
        }
    }

    public static int removeItems(Inventory inventory, Material type, int amount) {
        if(type == null || inventory == null)
            return -1;
        if (amount <= 0)
            return -1;
        if (amount == Integer.MAX_VALUE) {
            inventory.remove(type);
            return 0;
        }
        HashMap<Integer, ItemStack> retVal = inventory.removeItem(new ItemStack(type,amount));

        int notRemoved = 0;
        for(ItemStack item: retVal.values()) {
            notRemoved+=item.getAmount();
        }
        return notRemoved;
    }

    public static InventoryView pkt(Player p) {
        UUID uuid = p.getUniqueId();
        int pkt = data.getData().getInt(uuid + ".pkt");
        int diamend = plugin.getConfig().getInt("pkt.diamond");
        int netherite = plugin.getConfig().getInt("pkt.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 27, ("§9§lDodaj punkty do konta"));
        ItemBuilder slot13 = (new ItemBuilder(Material.CHEST, 1)).setTitle("§f§lPosiadasz §9§l" + pkt + " pkt.").addLore("§7").addLore("§e§lJEŻELI KLIKNIESZ SKRZYNKE TO ZOSTANA §e§l§nPOBRANE").addLore("§e§l§nWSZYSTKIE PRZEDMIOTY §e§lZA KTORE MOŻNA DODAC PUNKTY").addLore("§cJak chcesz wpłacić np. 5 diamentów to należy").addLore("§czostawić w ekwipunku tylko 5 diamendtów").addLore("§7").addLore("§fNetherite Ingot dodaje §9" + netherite + " pkt.").addLore("§fDiamond dodaje §9" + diamend + " pkt.").addLore("§7").addLore("§fLimit jednorazowej wpłaty to §964 przedmiotów").addLore("§7");
        inventory.setItem(13, slot13.build());
        ItemBuilder backguard = (new ItemBuilder(Material.BLACK_STAINED_GLASS_PANE, 1)).setTitle("§7");
        inventory.setItem(0, backguard.build());
        inventory.setItem(1, backguard.build());
        inventory.setItem(2, backguard.build());
        inventory.setItem(3, backguard.build());
        inventory.setItem(4, backguard.build());
        inventory.setItem(5, backguard.build());
        inventory.setItem(6, backguard.build());
        inventory.setItem(7, backguard.build());
        inventory.setItem(8, backguard.build());
        inventory.setItem(9, backguard.build());
        inventory.setItem(10, backguard.build());
        inventory.setItem(11, backguard.build());
        inventory.setItem(12, backguard.build());
        inventory.setItem(14, backguard.build());
        inventory.setItem(15, backguard.build());
        inventory.setItem(16, backguard.build());
        inventory.setItem(17, backguard.build());
        inventory.setItem(18, backguard.build());
        inventory.setItem(19, backguard.build());
        inventory.setItem(20, backguard.build());
        inventory.setItem(21, backguard.build());
        inventory.setItem(22, backguard.build());
        inventory.setItem(23, backguard.build());
        inventory.setItem(24, backguard.build());
        inventory.setItem(25, backguard.build());
        ItemBuilder slot26 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lAnuluj");
        inventory.setItem(26, slot26.build());
        return p.openInventory(inventory);
    }
}
