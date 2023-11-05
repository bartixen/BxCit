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

public class ArmListener implements Listener {

    static Main plugin;

    public ArmListener(Main m) {
        plugin = m;
    }

    @EventHandler
    public void clickinventory(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        int pkt_wooden = plugin.getConfig().getInt("skin.arm.nightstick.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.arm.nightstick.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.arm.nightstick.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.arm.nightstick.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.arm.nightstick.netherite");
        if (e.getView().getTitle().equals("§9§lKup skin Nightstick")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    arm(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Nightstick", "wooden nightstick");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Nightstick", "stone nightstick");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Nightstick", "iron nightstick");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Nightstick", "diamond nightstick");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Nightstick", "netherite nightstick");
                }
            }
        }
    }

    public static InventoryView guinightstick(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.arm.nightstick.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.arm.nightstick.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.arm.nightstick.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.arm.nightstick.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.arm.nightstick.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Nightstick"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lNightstick z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lNightstick z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lNightstick z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lNightstick z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lNightstick z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lNightstick");
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
        inventory.setItem(26, backguard.build());
        inventory.setItem(27, backguard.build());
        inventory.setItem(28, backguard.build());
        inventory.setItem(34, backguard.build());
        inventory.setItem(35, backguard.build());
        inventory.setItem(36, backguard.build());
        inventory.setItem(37, backguard.build());
        inventory.setItem(38, backguard.build());
        inventory.setItem(39, backguard.build());
        inventory.setItem(40, backguard.build());
        inventory.setItem(41, backguard.build());
        inventory.setItem(42, backguard.build());
        inventory.setItem(43, backguard.build());
        ItemBuilder slot44 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lAnuluj");
        inventory.setItem(44, slot44.build());
        return p.openInventory(inventory);
    }

    @EventHandler
    public void Menu(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        int pkt_imperial_blaster = plugin.getConfig().getInt("skin.arm.imperial_blaster");
        int pkt_light_assault_rifle = plugin.getConfig().getInt("skin.arm.light_assault_rifle");
        int pkt_heavy_assault_rifle = plugin.getConfig().getInt("skin.arm.heavy_assault_rifle");
        int pkt_sniper_rifle = plugin.getConfig().getInt("skin.arm.sniper_rifle");
        int pkt_ak_47 = plugin.getConfig().getInt("skin.arm.ak-47");
        int pkt_pump_action_shotgun = plugin.getConfig().getInt("skin.arm.pump_action_shotgun");
        if (e.getView().getTitle().equals("§9§lKup skin do broni")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    Skins.menu(p);
                }
                if (e.getRawSlot() == 11) {
                    p.closeInventory();
                    guinightstick(p);
                }
                if (e.getRawSlot() == 13) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_imperial_blaster, "Imperial Blaster", "imperial blaster");
                }
                if (e.getRawSlot() == 15) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_light_assault_rifle, "Light Assault Rifle", "light_assault_rifle");
                }
                if (e.getRawSlot() == 28) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_heavy_assault_rifle, "Heavy Assault Rifle", "heavy assault rifle");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_sniper_rifle, "Sniper Rifle", "sniper rifle");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_ak_47, "AK-47", "ak-47");
                }
                if (e.getRawSlot() == 34) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.BOW, pkt_pump_action_shotgun, "Pump Action Shotgun", "pump action shotgun");
                }
            }
        }
    }

    public static InventoryView arm(Player p) {
        int pkt_imperial_blaster = plugin.getConfig().getInt("skin.arm.imperial_blaster");
        int pkt_light_assault_rifle = plugin.getConfig().getInt("skin.arm.light_assault_rifle");
        int pkt_heavy_assault_rifle = plugin.getConfig().getInt("skin.arm.heavy_assault_rifle");
        int pkt_sniper_rifle = plugin.getConfig().getInt("skin.arm.sniper_rifle");
        int pkt_ak_47 = plugin.getConfig().getInt("skin.arm.ak-47");
        int pkt_pump_action_shotgun = plugin.getConfig().getInt("skin.arm.pump_action_shotgun");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin do broni"));
        ItemBuilder slot11 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lNightstick").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(11, slot11.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lImperial Blaster").addLore("§7").addLore("§fCena §9" + pkt_imperial_blaster + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(13, slot13.build());
        ItemBuilder slot15 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lLight Assault Rifle").addLore("§7").addLore("§fCena §9" + pkt_light_assault_rifle + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(15, slot15.build());
        ItemBuilder slot28 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lHeavy Assault Rifle").addLore("§7").addLore("§fCena §9" + pkt_heavy_assault_rifle + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(28, slot28.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lSniper Rifle").addLore("§7").addLore("§fCena §9" + pkt_sniper_rifle + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lAK-47").addLore("§7").addLore("§fCena §9" + pkt_ak_47 + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot34 = (new ItemBuilder(Material.BOW, 1)).setTitle("§e§lPump Action Shotgun").addLore("§7").addLore("§fCena §9" + pkt_pump_action_shotgun + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin").addLore("§7");
        inventory.setItem(34, slot34.build());
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
        inventory.setItem(12, backguard.build());
        inventory.setItem(14, backguard.build());
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
        ItemBuilder slot44 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lAnuluj");
        inventory.setItem(44, slot44.build());
        return p.openInventory(inventory);
    }
}
