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
import pl.bartixen.bxcit.Commands.Skins;
import pl.bartixen.bxcit.Data.ItemBuilder;
import pl.bartixen.bxcit.Data.SkinsDataManager;
import pl.bartixen.bxcit.Main;
import pl.bartixen.bxcit.Shop.ItemsShop;

import java.io.IOException;
import java.util.UUID;

public class ElytraListener implements Listener {

    static Main plugin;

    static SkinsDataManager data;

    public ElytraListener(Main m) {
        plugin = m;
        data = SkinsDataManager.getInstance();
    }

    @EventHandler
    public void Menu(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        UUID uuid = p.getUniqueId();
        int pkt_purple_beetle_wings = plugin.getConfig().getInt("skin.elytra.purple_beetle_wings");
        int pkt_steampunk_glider = plugin.getConfig().getInt("skin.elytra.steampunk_glider");
        int pkt_creeper_minecon = plugin.getConfig().getInt("skin.elytra.creeper_minecon");
        int pkt_enderman_minecon = plugin.getConfig().getInt("skin.elytra.enderman_minecon");
        int pkt_pickaxe_minecon = plugin.getConfig().getInt("skin.elytra.pickaxe_minecon");
        if (e.getView().getTitle().equals("§9§lKup skin do elytry")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 26) {
                    p.closeInventory();
                    Skins.menu(p);
                }
                if (e.getRawSlot() == 11) {
                    p.closeInventory();
                    if (((data.getData().getInt(uuid + ".pkt")) >= pkt_purple_beetle_wings) && p.getInventory().contains(Material.ELYTRA)) {
                        p.getInventory().remove(Material.ELYTRA);
                        p.updateInventory();
                        ItemsShop.ItemShop(p, Material.ELYTRA, pkt_purple_beetle_wings, "Purple Beetle Wings", "purple beetle wings");
                    } else {
                        p.sendMessage("§7Nie masz wystarczająco punktów lub przedmiotów, aby kupić ten skin.");
                        PlayMusic.PlayMusicError(p);
                    }
                }
                if (e.getRawSlot() == 12) {
                    p.closeInventory();
                    if (((data.getData().getInt(uuid + ".pkt")) >= pkt_steampunk_glider) && p.getInventory().contains(Material.ELYTRA)) {
                        p.getInventory().remove(Material.ELYTRA);
                        p.updateInventory();
                        ItemsShop.ItemShop(p, Material.ELYTRA, pkt_steampunk_glider, "Steampunk Glider", "streampunk glider");
                    } else {
                        p.sendMessage("§7Nie masz wystarczająco punktów lub przedmiotów, aby kupić ten skin.");
                        PlayMusic.PlayMusicError(p);
                    }
                }
                if (e.getRawSlot() == 13) {
                    p.closeInventory();
                    if (((data.getData().getInt(uuid + ".pkt")) >= pkt_creeper_minecon) && p.getInventory().contains(Material.ELYTRA)) {
                        p.getInventory().remove(Material.ELYTRA);
                        p.updateInventory();
                        ItemsShop.ItemShop(p, Material.ELYTRA, pkt_creeper_minecon, "Creeper Minecon", "creeper minecon");
                    } else {
                        p.sendMessage("§7Nie masz wystarczająco punktów lub przedmiotów, aby kupić ten skin.");
                        PlayMusic.PlayMusicError(p);
                    }
                }
                if (e.getRawSlot() == 14) {
                    p.closeInventory();
                    if (((data.getData().getInt(uuid + ".pkt")) >= pkt_enderman_minecon) && p.getInventory().contains(Material.ELYTRA)) {
                        p.getInventory().remove(Material.ELYTRA);
                        p.updateInventory();
                        ItemsShop.ItemShop(p, Material.ELYTRA, pkt_enderman_minecon, "Enderman Minecon", "enderman minecon");
                    } else {
                        p.sendMessage("§7Nie masz wystarczająco punktów lub przedmiotów, aby kupić ten skin.");
                        PlayMusic.PlayMusicError(p);
                    }
                }
                if (e.getRawSlot() == 15) {
                    p.closeInventory();
                    if (((data.getData().getInt(uuid + ".pkt")) >= pkt_pickaxe_minecon) && p.getInventory().contains(Material.ELYTRA)) {
                        p.getInventory().remove(Material.ELYTRA);
                        p.updateInventory();
                        ItemsShop.ItemShop(p, Material.ELYTRA, pkt_pickaxe_minecon, "Pickaxe Minecon", "pickaxe minecon");
                    } else {
                        p.sendMessage("§7Nie masz wystarczająco punktów lub przedmiotów, aby kupić ten skin.");
                        PlayMusic.PlayMusicError(p);
                    }
                }
            }
        }
    }

    public static InventoryView elytra(Player p) {
        int pkt_purple_beetle_wings = plugin.getConfig().getInt("skin.elytra.purple_beetle_wings");
        int pkt_steampunk_glider = plugin.getConfig().getInt("skin.elytra.steampunk_glider");
        int pkt_creeper_minecon = plugin.getConfig().getInt("skin.elytra.creeper_minecon");
        int pkt_enderman_minecon = plugin.getConfig().getInt("skin.elytra.enderman_minecon");
        int pkt_pickaxe_minecon = plugin.getConfig().getInt("skin.elytra.pickaxe_minecon");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 27, ("§9§lKup skin do elytry"));
        ItemBuilder slot11 = (new ItemBuilder(Material.ELYTRA, 1)).setTitle("§e§lPurple Beetle Wings").addLore("§7").addLore("§fCena §9" + pkt_purple_beetle_wings + " pkt. + elytra").addLore("§7").addLore("§c§lPamiętaj aby mieć tylko 1 elytre w ekwipunku.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(11, slot11.build());
        ItemBuilder slot12 = (new ItemBuilder(Material.ELYTRA, 1)).setTitle("§e§lSteampunk Glider").addLore("§7").addLore("§fCena §9" + pkt_steampunk_glider + " pkt. + elytra").addLore("§7").addLore("§c§lPamiętaj aby mieć tylko 1 elytre w ekwipunku.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(12, slot12.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.ELYTRA, 1)).setTitle("§e§lCreeper Minecon").addLore("§7").addLore("§fCena §9" + pkt_creeper_minecon + " pkt. + elytra").addLore("§7").addLore("§c§lPamiętaj aby mieć tylko 1 elytre w ekwipunku.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(13, slot13.build());
        ItemBuilder slot14 = (new ItemBuilder(Material.ELYTRA, 1)).setTitle("§e§lEnderman Minecon").addLore("§7").addLore("§fCena §9" + pkt_enderman_minecon + " pkt. + elytra").addLore("§7").addLore("§c§lPamiętaj aby mieć tylko 1 elytre w ekwipunku.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(14, slot14.build());
        ItemBuilder slot15 = (new ItemBuilder(Material.ELYTRA, 1)).setTitle("§e§lPickaxe Minecon").addLore("§7").addLore("§fCena §9" + pkt_pickaxe_minecon + " pkt. + elytra").addLore("§7").addLore("§c§lPamiętaj aby mieć tylko 1 elytre w ekwipunku.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(15, slot15.build());
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
