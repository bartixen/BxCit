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

public class AxeListener implements Listener {

    static Main plugin;

    public AxeListener(Main m) {
        plugin = m;
    }

    @EventHandler
    public void clickinventory(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equals("§9§lKup skin Hatchet")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.hatchet.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.hatchet.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.hatchet.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.hatchet.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.hatchet.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Hatchet", "wooden hatchet");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Hatchet", "stone hatchet");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Hatchet", "iron hatchet");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Hatchet", "diamond hatchet");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Hatchet", "netherite hatchet");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Diamond Battleaxe")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Diamond Battleaxe", "wooden diamond battleaxe");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Diamond Battleaxe", "stone diamond battleaxe");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Diamond Battleaxe", "iron diamond battleaxe");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Diamond Battleaxe", "diamond diamond battleaxe");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Diamond Battleaxe", "netherite diamond battleaxe");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Nordic Axe")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.nordic_axe.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.nordic_axe.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.nordic_axe.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.nordic_axe.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.nordic_axe.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Nordic Axe", "wooden nordic axe");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Nordic Axe", "stone nordic axe");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Nordic Axe", "iron nordic axe");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Nordic Axe", "diamond nordic axe");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Nordic Axe", "netherite nordic axe");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Wooden Mace")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.wooden_mace.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.wooden_mace.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.wooden_mace.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.wooden_mace.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.wooden_mace.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Wooden Mace", "wooden wooden mace");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Wooden Mace", "stone wooden mace");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Wooden Mace", "iron wooden mace");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Wooden Mace", "diamond wooden mace");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Wooden Mace", "netherite wooden mace");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Wand")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.wand.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.wand.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.wand.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.wand.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.wand.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Wand", "wooden wand");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Wand", "stone wand");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Wand", "iron wand");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Wand", "diamond wand");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Wand", "netherite wand");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Iron War Axe")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.iron_war_axe.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.iron_war_axe.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.iron_war_axe.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.iron_war_axe.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.iron_war_axe.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Iron War Axe", "wooden iron war axe");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Iron War Axe", "stone iron war axe");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Iron War Axe", "iron iron war axe");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Iron War Axe", "diamond iron war axe");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Iron War Axe", "netherite iron war axe");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Volcano Staff")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.volcano_staff.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.volcano_staff.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.volcano_staff.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.volcano_staff.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.volcano_staff.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Volcano Staff", "wooden volcano staff");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Volcano Staff", "stone volcano staff");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Volcano Staff", "iron volcano staff");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Volcano Staff", "diamond volcano staff");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Volcano Staff", "netherite volcano staff");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin War Hammer")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.war_hammer.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.war_hammer.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.war_hammer.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.war_hammer.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.war_hammer.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "War Hammer", "wooden war hammer");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "War Hammer", "stone war hammer");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "War Hammer", "iron war hammer");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "War Hammer", "diamond war hammer");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "War Hammer", "netherite war hammer");
                }
            }
        }

        if (e.getView().getTitle().equals("§9§lKup skin Golden Battleaxe")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.golden_battleaxe.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.golden_battleaxe.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.golden_battleaxe.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.golden_battleaxe.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.golden_battleaxe.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Golden Battleaxe", "wooden golden battleaxe");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Golden Battleaxe", "stone golden battleaxe");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Golden Battleaxe", "iron golden battleaxe");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Golden Battleaxe", "diamond golden battleaxe");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Golden Battleaxe", "netherite golden battleaxe");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Golden War Axe")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.golden_war_axe.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.golden_war_axe.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.golden_war_axe.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.golden_war_axe.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.golden_war_axe.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Golden War Axe", "wooden golden war axe");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Golden War Axe", "stone golden war axe");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Golden War Axe", "iron golden war axe");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Golden War Axe", "diamond golden war axe");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Golden War Axe", "netherite golden war axe");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Golden Mace")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.golden_mace.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.golden_mace.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.golden_mace.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.golden_mace.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.golden_mace.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Golden Mace", "wooden golden mace");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Golden Mace", "stone golden mace");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Golden Mace", "iron golden mace");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Golden Mace", "diamond golden mace");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Golden Mace", "netherite golden mace");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Iron Mace")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.axe.iron_mace.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.axe.iron_mace.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.axe.iron_mace.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.axe.iron_mace.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.axe.iron_mace.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    axe(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_AXE, pkt_wooden, "Iron Mace", "wooden iron mace");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_AXE, pkt_stone, "Iron Mace", "stone iron mace");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_AXE, pkt_iron, "Iron Mace", "iron iron mace");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_AXE, pkt_diamond, "Iron Mace", "diamond iron mace");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_AXE, pkt_netherite, "Iron Mace", "netherite iron mace");
                }
            }
        }
    }

    public static InventoryView guihatchet(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.hatchet.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.hatchet.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.hatchet.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.hatchet.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.hatchet.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Hatchet"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lHatchet z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lHatchet z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lHatchet z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lHatchet z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lHatchet z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lHatchet");
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

    public static InventoryView guidiamondbattleaxe(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.diamond_battleaxe.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Diamond Battleaxe"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lDiamond Battleaxe z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lDiamond Battleaxe z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lDiamond Battleaxe z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lDiamond Battleaxe z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lDiamond Battleaxe z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lDiamond Battleaxe");
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

    public static InventoryView guinordicaxe(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.nordic_axe.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.nordic_axe.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.nordic_axe.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.nordic_axe.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.nordic_axe.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Nordic Axe"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lNordic Axe z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lNordic Axe z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lNordic Axe z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lNordic Axe z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lNordic Axe z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lNordic Axe");
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

    public static InventoryView guiwoodenmace(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.wooden_mace.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.wooden_mace.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.wooden_mace.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.wooden_mace.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.wooden_mace.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Wooden Mace"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lWooden Mace z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lWooden Mace z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lWooden Mace z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lWooden Mace z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lWooden Mace z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lWooden Mace");
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

    public static InventoryView guiwand(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.wand.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.wand.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.wand.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.wand.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.wand.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Wand"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lWand z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lWand z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lWand z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lWand z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lWand z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lWand");
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

    public static InventoryView guiironwaraxe(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.iron_war_axe.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.iron_war_axe.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.iron_war_axe.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.iron_war_axe.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.iron_war_axe.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Iron War Axe"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lIron War Axe z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lIron War Axe z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lIron War Axe z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lIron War Axe z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lIron War Axe z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lIron War Axe");
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

    public static InventoryView guivolcanostaff(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.volcano_staff.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.volcano_staff.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.volcano_staff.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.volcano_staff.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.volcano_staff.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Volcano Staff"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lVolcano Staff z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lVolcano Staff z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lVolcano Staff z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lVolcano Staff z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lVolcano Staff z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lVolcano Staff");
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

    public static InventoryView guiwarhammer(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.war_hammer.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.war_hammer.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.war_hammer.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.war_hammer.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.war_hammer.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin War Hammer"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lWar Hammer z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lWar Hammer z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lWar Hammer z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lWar Hammer z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lWar Hammer z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lWar Hammer");
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

    public static InventoryView guigoldenbattleaxe(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.golden_battleaxe.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.golden_battleaxe.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.golden_battleaxe.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.golden_battleaxe.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.golden_battleaxe.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Golden Battleaxe"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lGolden Battleaxe z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lGolden Battleaxe z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lGolden Battleaxe z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lGolden Battleaxe z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lGolden Battleaxe z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lGolden Battleaxe");
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

    public static InventoryView guigoldenwaraxe(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.golden_war_axe.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.golden_war_axe.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.golden_war_axe.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.golden_war_axe.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.golden_war_axe.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Golden War Axe"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lGolden War Axe z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lGolden War Axe z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lGolden War Axe z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lGolden War Axe z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lGolden War Axe z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lGolden War Axe");
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

    public static InventoryView guigoldenmace(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.golden_mace.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.golden_mace.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.golden_mace.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.golden_mace.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.golden_mace.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Golden Mace"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lGolden Mace z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lGolden Mace z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lGolden Mace z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lGolden Mace z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lGolden Mace z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lGolden Mace");
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

    public static InventoryView guiironmace(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.axe.iron_mace.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.axe.iron_mace.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.axe.iron_mace.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.axe.iron_mace.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.axe.iron_mace.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Iron Mace"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_AXE, 1)).setTitle("§e§lIron Mace z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_AXE, 1)).setTitle("§e§lIron Mace z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§e§lIron Mace z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lIron Mace z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lIron Mace z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_AXE, 1)).setTitle("§e§lIron Mace");
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
        if (e.getView().getTitle().equals("§9§lKup skin do siekiery")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    Skins.menu(p);
                }
                if (e.getRawSlot() == 53) {
                    p.closeInventory();
                    Skins.menu(p);
                }
                if (e.getRawSlot() == 10) {
                    p.closeInventory();
                    guihatchet(p);
                }
                if (e.getRawSlot() == 12) {
                    p.closeInventory();
                    guidiamondbattleaxe(p);
                }
                if (e.getRawSlot() == 14) {
                    p.closeInventory();
                    guinordicaxe(p);
                }
                if (e.getRawSlot() == 16) {
                    p.closeInventory();
                    guiwoodenmace(p);
                }
                if (e.getRawSlot() == 28) {
                    p.closeInventory();
                    guiwand(p);
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    guiironwaraxe(p);
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    guivolcanostaff(p);
                }
                if (e.getRawSlot() == 34) {
                    p.closeInventory();
                    guiwarhammer(p);
                }
                if (e.getRawSlot() == 46) {
                    p.closeInventory();
                    guigoldenbattleaxe(p);
                }
                if (e.getRawSlot() == 48) {
                    p.closeInventory();
                    guigoldenwaraxe(p);
                }
                if (e.getRawSlot() == 50) {
                    p.closeInventory();
                    guigoldenmace(p);
                }
                if (e.getRawSlot() == 52) {
                    p.closeInventory();
                    guiironmace(p);
                }
            }
        }
    }

    public static InventoryView axe(Player p) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 54, ("§9§lKup skin do siekiery"));
        ItemBuilder slot10 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lHatchet").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(10, slot10.build());
        ItemBuilder slot12 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lDiamond Battleaxe").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(12, slot12.build());
        ItemBuilder slot14 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lNordic Axe").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(14, slot14.build());
        ItemBuilder slot16 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lWooden Mace").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(16, slot16.build());
        ItemBuilder slot28 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lWand").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(28, slot28.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lIron War Axe").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lVolcano Staff").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot34 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lWar Hammer").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(34, slot34.build());
        ItemBuilder slot46 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lGolden Battleaxe").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(46, slot46.build());
        ItemBuilder slot48 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lGolden War Axe").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(48, slot48.build());
        ItemBuilder slot50 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lGolden Mace").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(50, slot50.build());
        ItemBuilder slot52 = (new ItemBuilder(Material.DIAMOND_AXE, 1)).setTitle("§e§lIron Mace").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(52, slot52.build());
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
        ItemBuilder slot53 = (new ItemBuilder(Material.RED_CONCRETE, 1)).setTitle("§c§lAnuluj");
        inventory.setItem(53, slot53.build());
        return p.openInventory(inventory);
    }
}
