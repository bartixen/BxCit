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
import pl.bartixen.bxcit.Main;
import pl.bartixen.bxcit.Shop.ItemsShop;

import java.io.IOException;

public class BowListener implements Listener {

    static Main plugin;

    public BowListener(Main m) {
        plugin = m;
    }

    @EventHandler
    public void Menu(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        int pkt_gold_bow = plugin.getConfig().getInt("skin.bow.gold_bow");
        int pkt_obsidian_bow = plugin.getConfig().getInt("skin.bow.obsidian_bow");
        int pkt_shortbow = plugin.getConfig().getInt("skin.bow.shortbow");
        int pkt_compound_bow = plugin.getConfig().getInt("skin.bow.compound_bow");
        int pkt_dark_bow = plugin.getConfig().getInt("skin.bow.dark_bow");
        int pkt_diamond_bow = plugin.getConfig().getInt("skin.bow.diamond_bow");
        int pkt_flame_bow = plugin.getConfig().getInt("skin.bow.flame_bow");
        int pkt_frost_bow = plugin.getConfig().getInt("skin.bow.frost_bow");
        int pkt_hunting_bow = plugin.getConfig().getInt("skin.bow.hunting_bow");
        int pkt_long_bow = plugin.getConfig().getInt("skin.bow.long_bow");
        int pkt_iron_bow = plugin.getConfig().getInt("skin.bow.iron_bow");
        if (e.getView().getTitle().equals("§9§lKup skin do łuku")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 53) {
                    p.closeInventory();
                    Skins.menu(p);
                }
                if (e.getRawSlot() == 10) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_gold_bow, "Gold Bow", "gold bow");
                }
                if (e.getRawSlot() == 12) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_obsidian_bow, "Obsidian Bow", "obsidian bow");
                }
                if (e.getRawSlot() == 14) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_shortbow, "Shortbow", "shortbow");
                }
                if (e.getRawSlot() == 16) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_compound_bow, "Compound Bow", "compound bow");
                }
                if (e.getRawSlot() == 28) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_dark_bow, "Dark Bow", "dark bow");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_diamond_bow, "Diamond Bow", "diamond bow");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_flame_bow, "Flame Bow", "flame bow");
                }
                if (e.getRawSlot() == 34) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_frost_bow, "Frost Bow", "frost bow");
                }
                if (e.getRawSlot() == 46) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_hunting_bow, "Hunting Bow", "hunting bow");
                }
                if (e.getRawSlot() == 48) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_long_bow, "Longbow", "longbow");
                }
                if (e.getRawSlot() == 50) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_iron_bow, "Iron Bow", "iron bow");
                }
            }
        }
    }

    public static InventoryView bow(Player p) {
        int pkt_gold_bow = plugin.getConfig().getInt("skin.bow.gold_bow");
        int pkt_obsidian_bow = plugin.getConfig().getInt("skin.bow.obsidian_bow");
        int pkt_shortbow = plugin.getConfig().getInt("skin.bow.shortbow");
        int pkt_compound_bow = plugin.getConfig().getInt("skin.bow.compound_bow");
        int pkt_dark_bow = plugin.getConfig().getInt("skin.bow.dark_bow");
        int pkt_diamond_bow = plugin.getConfig().getInt("skin.bow.diamond_bow");
        int pkt_flame_bow = plugin.getConfig().getInt("skin.bow.flame_bow");
        int pkt_frost_bow = plugin.getConfig().getInt("skin.bow.frost_bow");
        int pkt_hunting_bow = plugin.getConfig().getInt("skin.bow.hunting_bow");
        int pkt_long_bow = plugin.getConfig().getInt("skin.bow.long_bow");
        int pkt_iron_bow = plugin.getConfig().getInt("skin.bow.iron_bow");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 54, ("§9§lKup skin do łuku"));
        ItemBuilder slot10 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lGold Bow").addLore("§7").addLore("§fCena §9" + pkt_gold_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(10, slot10.build());
        ItemBuilder slot12 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lObsidian Bow").addLore("§7").addLore("§fCena §9" + pkt_obsidian_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(12, slot12.build());
        ItemBuilder slot14 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lShortbow").addLore("§7").addLore("§fCena §9" + pkt_shortbow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(14, slot14.build());
        ItemBuilder slot15 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lCompound Bow").addLore("§7").addLore("§fCena §9" + pkt_compound_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(16, slot15.build());
        ItemBuilder slot28 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lDark Bow").addLore("§7").addLore("§fCena §9" + pkt_dark_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(28, slot28.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lDiamond Bow").addLore("§7").addLore("§fCena §9" + pkt_diamond_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lFlame Bow").addLore("§7").addLore("§fCena §9" + pkt_flame_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot34 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lFrost Bow").addLore("§7").addLore("§fCena §9" + pkt_frost_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(34, slot34.build());
        ItemBuilder slot45 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lHunting Bow").addLore("§7").addLore("§fCena §9" + pkt_hunting_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(46, slot45.build());
        ItemBuilder slot47 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lLongbow").addLore("§7").addLore("§fCena §9" + pkt_long_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(48, slot47.build());
        ItemBuilder slot49 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lIron Bow").addLore("§7").addLore("§fCena §9" + pkt_iron_bow + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(50, slot49.build());
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
        inventory.setItem(11, backguard.build());
        inventory.setItem(13, backguard.build());
        inventory.setItem(15, backguard.build());
        inventory.setItem(17, backguard.build());
        inventory.setItem(18, backguard.build());
        inventory.setItem(19, backguard.build());
        inventory.setItem(20, backguard.build());
        inventory.setItem(21, backguard.build());
        inventory.setItem(22, backguard.build());
        inventory.setItem(23, backguard.build());
        inventory.setItem(24, backguard.build());
        inventory.setItem(25, backguard.build());
        inventory.setItem(26, backguard.build());
        inventory.setItem(27, backguard.build());
        inventory.setItem(29, backguard.build());
        inventory.setItem(31, backguard.build());
        inventory.setItem(33, backguard.build());
        inventory.setItem(35, backguard.build());
        inventory.setItem(36, backguard.build());
        inventory.setItem(37, backguard.build());
        inventory.setItem(38, backguard.build());
        inventory.setItem(39, backguard.build());
        inventory.setItem(40, backguard.build());
        inventory.setItem(41, backguard.build());
        inventory.setItem(42, backguard.build());
        inventory.setItem(43, backguard.build());
        inventory.setItem(44, backguard.build());
        inventory.setItem(45, backguard.build());
        inventory.setItem(47, backguard.build());
        inventory.setItem(49, backguard.build());
        inventory.setItem(51, backguard.build());
        inventory.setItem(52, backguard.build());
        ItemBuilder slot53 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lAnuluj");
        inventory.setItem(53, slot53.build());
        return p.openInventory(inventory);
    }
}
