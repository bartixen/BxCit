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
import pl.bartixen.bxcit.Commands.Skiny;
import pl.bartixen.bxcit.Data.ItemBuilder;
import pl.bartixen.bxcit.Main;
import pl.bartixen.bxcit.Shop.ItemsShop;

import java.io.IOException;

public class ShieldListener implements Listener {

    static Main plugin;

    public ShieldListener(Main m) {
        plugin = m;
    }

    @EventHandler
    public void Menu(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        int pkt_stone_shield = plugin.getConfig().getInt("skin.shield.stone_shield");
        int pkt_iron_shield = plugin.getConfig().getInt("skin.shield.iron_shield");
        int pkt_fell_barrier = plugin.getConfig().getInt("skin.shield.fell_barrier");
        int pkt_steel_shield = plugin.getConfig().getInt("skin.shield.steel_shield");
        int pkt_netherite_plated_shield = plugin.getConfig().getInt("skin.shield.netherite_plated_shield");
        int pkt_shield_of_undying = plugin.getConfig().getInt("skin.shield.shield_of_undying");
        int pkt_gold_plated_shield = plugin.getConfig().getInt("skin.shield.gold_plated_shield");
        int pkt_northern_shield = plugin.getConfig().getInt("skin.shield.northern_shield");
        int pkt_skull_shield = plugin.getConfig().getInt("skin.shield.skull_shield");
        int pkt_glass_shield = plugin.getConfig().getInt("skin.shield.glass_shield");
        int pkt_leather_shield = plugin.getConfig().getInt("skin.shield.leather_shield");
        if (e.getView().getTitle().equals("§9§lKup skin do tarczy")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 35) {
                    p.closeInventory();
                    Skiny.menu(p);
                }
                if (e.getRawSlot() == 10) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_stone_shield, "Stone Shield", "stone shield");
                }
                if (e.getRawSlot() == 11) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_iron_shield, "Iron Shield", "iron shield");
                }
                if (e.getRawSlot() == 12) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_fell_barrier, "Fell Barrier", "fell barrier");
                }
                if (e.getRawSlot() == 13) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_steel_shield, "Steel Shield", "steel shield");
                }
                if (e.getRawSlot() == 14) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_netherite_plated_shield, "Netherite Plated Shield", "netherite plated shield");
                }
                if (e.getRawSlot() == 15) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_shield_of_undying, "Shield of Undying", "shield of undying");
                }
                if (e.getRawSlot() == 16) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_gold_plated_shield, "Gold Plated Shield", "gold plated shield");
                }
                if (e.getRawSlot() == 19) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_northern_shield, "Northern Shield", "northern shield");
                }
                if (e.getRawSlot() == 20) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_skull_shield, "Skull Shield", "skull shield");
                }
                if (e.getRawSlot() == 21) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_glass_shield, "Glass Shield", "glass shield");
                }
                if (e.getRawSlot() == 22) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.SHIELD, pkt_leather_shield, "Leather Shield", "leather shield");
                }
            }
        }
    }

    public static InventoryView shield(Player p) {
        int pkt_stone_shield = plugin.getConfig().getInt("skin.shield.stone_shield");
        int pkt_iron_shield = plugin.getConfig().getInt("skin.shield.iron_shield");
        int pkt_fell_barrier = plugin.getConfig().getInt("skin.shield.fell_barrier");
        int pkt_steel_shield = plugin.getConfig().getInt("skin.shield.steel_shield");
        int pkt_netherite_plated_shield = plugin.getConfig().getInt("skin.shield.netherite_plated_shield");
        int pkt_shield_of_undying = plugin.getConfig().getInt("skin.shield.shield_of_undying");
        int pkt_gold_plated_shield = plugin.getConfig().getInt("skin.shield.gold_plated_shield");
        int pkt_northern_shield = plugin.getConfig().getInt("skin.shield.northern_shield");
        int pkt_skull_shield = plugin.getConfig().getInt("skin.shield.skull_shield");
        int pkt_glass_shield = plugin.getConfig().getInt("skin.shield.glass_shield");
        int pkt_leather_shield = plugin.getConfig().getInt("skin.shield.leather_shield");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 36, ("§9§lKup skin do tarczy"));
        ItemBuilder slot10 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lStone Shield").addLore("§7").addLore("§fCena §9" + pkt_stone_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(10, slot10.build());
        ItemBuilder slot11 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lIron Shield").addLore("§7").addLore("§fCena §9" + pkt_iron_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(11, slot11.build());
        ItemBuilder slot12 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lFell Barrier").addLore("§7").addLore("§fCena §9" + pkt_fell_barrier + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(12, slot12.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lSteel Shield").addLore("§7").addLore("§fCena §9" + pkt_steel_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(13, slot13.build());
        ItemBuilder slot14 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lNetherite Plated Shield").addLore("§7").addLore("§fCena §9" + pkt_netherite_plated_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(14, slot14.build());
        ItemBuilder slot15 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lShield of Undying").addLore("§7").addLore("§fCena §9" + pkt_shield_of_undying + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(15, slot15.build());
        ItemBuilder slot16 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lGold Plated Shield").addLore("§7").addLore("§fCena §9" + pkt_gold_plated_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(16, slot16.build());
        ItemBuilder slot19 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lNorthern Shield").addLore("§7").addLore("§fCena §9" + pkt_northern_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(19, slot19.build());
        ItemBuilder slot20 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lSkull Shield").addLore("§7").addLore("§fCena §9" + pkt_skull_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(20, slot20.build());
        ItemBuilder slot21 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lGlass Shield").addLore("§7").addLore("§fCena §9" + pkt_glass_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(21, slot21.build());
        ItemBuilder slot22 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§e§lLeather Shield").addLore("§7").addLore("§fCena §9" + pkt_leather_shield + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(22, slot22.build());
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
        inventory.setItem(17, backguard.build());
        inventory.setItem(18, backguard.build());
        inventory.setItem(23, backguard.build());
        inventory.setItem(24, backguard.build());
        inventory.setItem(25, backguard.build());
        inventory.setItem(26, backguard.build());
        inventory.setItem(27, backguard.build());
        inventory.setItem(28, backguard.build());
        inventory.setItem(29, backguard.build());
        inventory.setItem(30, backguard.build());
        inventory.setItem(31, backguard.build());
        inventory.setItem(32, backguard.build());
        inventory.setItem(33, backguard.build());
        inventory.setItem(34, backguard.build());
        ItemBuilder slot35 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lAnuluj");
        inventory.setItem(35, slot35.build());
        return p.openInventory(inventory);
    }
}
