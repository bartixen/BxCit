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

import java.io.IOException;

public class ArmorPages implements Listener {

    static Main plugin;

    public ArmorPages(Main m) {
        plugin = m;
    }

    @EventHandler
    public void strona1(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equals("§9§lKup skin do zbroi (1/3)")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 45) {
                    p.closeInventory();
                    Skins.menu(p);
                }
                if (e.getRawSlot() == 53) {
                    p.closeInventory();
                    armorpages2(p);
                }
                if ((e.getRawSlot() == 10) || (e.getRawSlot() == 19) || (e.getRawSlot() == 28) || (e.getRawSlot() == 37)) {
                    p.closeInventory();
                    ArmorListener.guicowboy(p);
                }
                if ((e.getRawSlot() == 11) || (e.getRawSlot() == 20) || (e.getRawSlot() == 29) || (e.getRawSlot() == 38)) {
                    p.closeInventory();
                    ArmorListener.aguipache(p);
                }
                if ((e.getRawSlot() == 12) || (e.getRawSlot() == 21) || (e.getRawSlot() == 30) || (e.getRawSlot() == 39)) {
                    p.closeInventory();
                    ArmorListener.aguiaztec(p);
                }
                if ((e.getRawSlot() == 13) || (e.getRawSlot() == 22) || (e.getRawSlot() == 31) || (e.getRawSlot() == 40)) {
                    p.closeInventory();
                    ArmorListener.aguiguard(p);
                }
                if ((e.getRawSlot() == 14) || (e.getRawSlot() == 23) || (e.getRawSlot() == 32) || (e.getRawSlot() == 41)) {
                    p.closeInventory();
                    ArmorListener.aguiemperors(p);
                }
                if ((e.getRawSlot() == 15) || (e.getRawSlot() == 24) || (e.getRawSlot() == 33) || (e.getRawSlot() == 42)) {
                    p.closeInventory();
                    ArmorListener.aguikings(p);
                }
                if ((e.getRawSlot() == 16) || (e.getRawSlot() == 25) || (e.getRawSlot() == 34) || (e.getRawSlot() == 43)) {
                    p.closeInventory();
                    ArmorListener.aguiknights(p);
                }
            }
        }
    }

    @EventHandler
    public void strona2(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equals("§9§lKup skin do zbroi (2/3)")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 45) {
                    p.closeInventory();
                    armorpages1(p);
                }
                if (e.getRawSlot() == 53) {
                    p.closeInventory();
                    armorpages3(p);
                }
                if ((e.getRawSlot() == 10) || (e.getRawSlot() == 19) || (e.getRawSlot() == 28) || (e.getRawSlot() == 37)) {
                    p.closeInventory();
                    ArmorListener.aguininja(p);
                }
                if ((e.getRawSlot() == 11) || (e.getRawSlot() == 20) || (e.getRawSlot() == 29) || (e.getRawSlot() == 38)) {
                    p.closeInventory();
                    ArmorListener.aguinordic(p);
                }
                if ((e.getRawSlot() == 12) || (e.getRawSlot() == 21) || (e.getRawSlot() == 30) || (e.getRawSlot() == 39)) {
                    p.closeInventory();
                    ArmorListener.aguibone(p);
                }
                if ((e.getRawSlot() == 13) || (e.getRawSlot() == 22) || (e.getRawSlot() == 31) || (e.getRawSlot() == 40)) {
                    p.closeInventory();
                    ArmorListener.aguispace(p);
                }
                if ((e.getRawSlot() == 14) || (e.getRawSlot() == 23) || (e.getRawSlot() == 32) || (e.getRawSlot() == 41)) {
                    p.closeInventory();
                    ArmorListener.aguispartan(p);
                }
                if ((e.getRawSlot() == 15) || (e.getRawSlot() == 24) || (e.getRawSlot() == 33) || (e.getRawSlot() == 42)) {
                    p.closeInventory();
                    ArmorListener.aguidragon(p);
                }
                if ((e.getRawSlot() == 16) || (e.getRawSlot() == 25) || (e.getRawSlot() == 34) || (e.getRawSlot() == 43)) {
                    p.closeInventory();
                    ArmorListener.aguisteel(p);
                }
            }
        }
    }

    @EventHandler
    public void strona3(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equals("§9§lKup skin do zbroi (3/3)")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 45) {
                    p.closeInventory();
                    armorpages2(p);
                }
                if ((e.getRawSlot() == 12) || (e.getRawSlot() == 21) || (e.getRawSlot() == 30) || (e.getRawSlot() == 39)) {
                    p.closeInventory();
                    ArmorListener.aguielven(p);
                }
                if ((e.getRawSlot() == 13) || (e.getRawSlot() == 22) || (e.getRawSlot() == 31) || (e.getRawSlot() == 40)) {
                    p.closeInventory();
                    ArmorListener.aguisamurai(p);
                }
                if ((e.getRawSlot() == 14) || (e.getRawSlot() == 23) || (e.getRawSlot() == 32) || (e.getRawSlot() == 41)) {
                    p.closeInventory();
                    ArmorListener.aguisteampunk(p);
                }
            }
        }
    }

    public static InventoryView armorpages1(Player p) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 54, ("§9§lKup skin do zbroi (1/3)"));
        ItemBuilder slot10 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lCowboy Hat").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(10, slot10.build());
        ItemBuilder slot19 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lCowboy Jacket").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(19, slot19.build());
        ItemBuilder slot28 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lCowboy Pants").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(28, slot28.build());
        ItemBuilder slot37 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lCowboy Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(37, slot37.build());

        ItemBuilder slot11 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lApache Hood").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(11, slot11.build());
        ItemBuilder slot20 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lApache Cloak").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(20, slot20.build());
        ItemBuilder slot29 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lApache Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot38 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lApache Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(38, slot38.build());

        ItemBuilder slot12 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lAztec Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(12, slot12.build());
        ItemBuilder slot21 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lAztec Cloak").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(21, slot21.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lAztec Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot39 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lAztec Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(39, slot39.build());

        ItemBuilder slot13 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lGuard Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(13, slot13.build());
        ItemBuilder slot22 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lGuard Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(22, slot22.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lGuard Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot40 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lGuard Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(40, slot40.build());

        ItemBuilder slot14 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lEmperors Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(14, slot14.build());
        ItemBuilder slot23 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lEmperors Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(23, slot23.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lEmperors Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot41 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lEmperors Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(41, slot41.build());

        ItemBuilder slot15 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lKings Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(15, slot15.build());
        ItemBuilder slot24 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lKings Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(24, slot24.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lKings Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot42 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lKings Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(42, slot42.build());

        ItemBuilder slot16 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lKnights Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(16, slot16.build());
        ItemBuilder slot25 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lKnights Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(25, slot25.build());
        ItemBuilder slot34 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lKnights Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(34, slot34.build());
        ItemBuilder slot43 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lKnights Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(43, slot43.build());

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
        inventory.setItem(26, backguard.build());
        inventory.setItem(27, backguard.build());
        inventory.setItem(35, backguard.build());
        inventory.setItem(36, backguard.build());
        inventory.setItem(44, backguard.build());
        inventory.setItem(46, backguard.build());
        inventory.setItem(47, backguard.build());
        inventory.setItem(48, backguard.build());
        inventory.setItem(49, backguard.build());
        inventory.setItem(50, backguard.build());
        inventory.setItem(51, backguard.build());
        inventory.setItem(52, backguard.build());

        ItemBuilder slot45 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lAnuluj");
        inventory.setItem(45, slot45.build());
        ItemBuilder slot53 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lStrona 2");
        inventory.setItem(53, slot53.build());
        return p.openInventory(inventory);
    }

    public static InventoryView armorpages2(Player p) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 54, ("§9§lKup skin do zbroi (2/3)"));
        ItemBuilder slot10 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lNinja Mask").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(10, slot10.build());
        ItemBuilder slot19 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lNinja Tunic").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(19, slot19.build());
        ItemBuilder slot28 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lNinja Pants").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(28, slot28.build());
        ItemBuilder slot37 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lNinja Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(37, slot37.build());

        ItemBuilder slot11 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lNordic Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(11, slot11.build());
        ItemBuilder slot20 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lNordic Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(20, slot20.build());
        ItemBuilder slot29 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lNordic Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot38 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lNordic Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(38, slot38.build());

        ItemBuilder slot12 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lBone Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(12, slot12.build());
        ItemBuilder slot21 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lBone Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(21, slot21.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lBone Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot39 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lBone Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(39, slot39.build());

        ItemBuilder slot13 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lSpace Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(13, slot13.build());
        ItemBuilder slot22 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lSpace Jacket").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(22, slot22.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lSpace Pants").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot40 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lSpace Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(40, slot40.build());

        ItemBuilder slot14 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lSpartan Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(14, slot14.build());
        ItemBuilder slot23 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lSpartan Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(23, slot23.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lSpartan Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot41 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lSpartan Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(41, slot41.build());

        ItemBuilder slot15 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lDragon Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(15, slot15.build());
        ItemBuilder slot24 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lDragon Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(24, slot24.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lDragon Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot42 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lDragon Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(42, slot42.build());

        ItemBuilder slot16 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lSteel Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(16, slot16.build());
        ItemBuilder slot25 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lSteel Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(25, slot25.build());
        ItemBuilder slot34 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lSteel Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(34, slot34.build());
        ItemBuilder slot43 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lSteel Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(43, slot43.build());

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
        inventory.setItem(26, backguard.build());
        inventory.setItem(27, backguard.build());
        inventory.setItem(35, backguard.build());
        inventory.setItem(36, backguard.build());
        inventory.setItem(44, backguard.build());
        inventory.setItem(46, backguard.build());
        inventory.setItem(47, backguard.build());
        inventory.setItem(48, backguard.build());
        inventory.setItem(49, backguard.build());
        inventory.setItem(50, backguard.build());
        inventory.setItem(51, backguard.build());
        inventory.setItem(52, backguard.build());

        ItemBuilder slot45 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lStrona 1");
        inventory.setItem(45, slot45.build());
        ItemBuilder slot53 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lStrona 3");
        inventory.setItem(53, slot53.build());
        return p.openInventory(inventory);
    }

    public static InventoryView armorpages3(Player p) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 54, ("§9§lKup skin do zbroi (3/3)"));
        ItemBuilder slot12 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lElven Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(12, slot12.build());
        ItemBuilder slot21 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lElven Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(21, slot21.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lElven Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot39 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lElven Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(39, slot39.build());

        ItemBuilder slot13 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lSamurai Helmet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(13, slot13.build());
        ItemBuilder slot22 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lSamurai Chestplate").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(22, slot22.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lSamurai Leggings").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot40 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lSamurai Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(40, slot40.build());

        ItemBuilder slot14 = (new ItemBuilder(Material.DIAMOND_HELMET, 1)).setTitle("§e§lSteampunk Cap").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(14, slot14.build());
        ItemBuilder slot23 = (new ItemBuilder(Material.DIAMOND_CHESTPLATE, 1)).setTitle("§e§lSteampunk Tunic").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(23, slot23.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_LEGGINGS, 1)).setTitle("§e§lSteampunk Pants").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot41 = (new ItemBuilder(Material.DIAMOND_BOOTS, 1)).setTitle("§e§lSteampunk Boots").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(41, slot41.build());

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
        inventory.setItem(15, backguard.build());
        inventory.setItem(16, backguard.build());
        inventory.setItem(17, backguard.build());
        inventory.setItem(18, backguard.build());
        inventory.setItem(19, backguard.build());
        inventory.setItem(20, backguard.build());
        inventory.setItem(24, backguard.build());
        inventory.setItem(25, backguard.build());
        inventory.setItem(26, backguard.build());
        inventory.setItem(27, backguard.build());
        inventory.setItem(28, backguard.build());
        inventory.setItem(29, backguard.build());
        inventory.setItem(33, backguard.build());
        inventory.setItem(34, backguard.build());
        inventory.setItem(35, backguard.build());
        inventory.setItem(36, backguard.build());
        inventory.setItem(37, backguard.build());
        inventory.setItem(38, backguard.build());
        inventory.setItem(42, backguard.build());
        inventory.setItem(43, backguard.build());
        inventory.setItem(44, backguard.build());
        inventory.setItem(46, backguard.build());
        inventory.setItem(47, backguard.build());
        inventory.setItem(48, backguard.build());
        inventory.setItem(49, backguard.build());
        inventory.setItem(50, backguard.build());
        inventory.setItem(51, backguard.build());
        inventory.setItem(52, backguard.build());
        inventory.setItem(53, backguard.build());

        ItemBuilder slot45 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lStrona 2");
        inventory.setItem(45, slot45.build());
        return p.openInventory(inventory);
    }

}
