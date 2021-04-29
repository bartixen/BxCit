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

public class SwordListener implements Listener {

    static Main plugin;

    public SwordListener(Main m) {
        plugin = m;
    }

    @EventHandler
    public void guiironscabbard(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        if (e.getView().getTitle().equals("§9§lKup skin Iron Scabbard")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.iron_scabbard.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.iron_scabbard.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.iron_scabbard.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.iron_scabbard.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.iron_scabbard.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Iron Scabbard", "wooden iron scabbard");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Iron Scabbard", "stone iron scabbard");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Iron Scabbard", "iron iron scabbard");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Iron Scabbard", "diamond iron scabbard");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Iron Scabbard", "netherite iron scabbard");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Charged Sword")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.charged_sword.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.charged_sword.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.charged_sword.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.charged_sword.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.charged_sword.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Charged Sword", "wooden charged sword");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Charged Sword", "stone charged sword");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Charged Sword", "iron charged sword");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Charged Sword", "diamond charged sword");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Charged Sword", "netherite charged sword");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Golden Javelin")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.golden_javelin.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.golden_javelin.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.golden_javelin.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.golden_javelin.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.golden_javelin.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Golden Javelin", "wooden golden javelin");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Golden Javelin", "stone golden javelin");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Golden Javelin", "iron golden javelin");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Golden Javelin", "diamond golden javelin");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Golden Javelin", "netherite golden javelin");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Dwarven Sword")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.dwarven_sword.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.dwarven_sword.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.dwarven_sword.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.dwarven_sword.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.dwarven_sword.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Dwarven Swor", "wooden dwarven sword");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Dwarven Swor", "stone dwarven sword");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Dwarven Swor", "iron dwarven sword");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Dwarven Swor", "diamond dwarven sword");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Dwarven Swor", "netherite dwarven sword");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Eastern Glaive")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.eastern_glaive.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.eastern_glaive.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.eastern_glaive.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.eastern_glaive.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.eastern_glaive.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Eastern Glaive", "wooden eastern glaive");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Eastern Glaive", "stone eastern glaive");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Eastern Glaive", "iron eastern glaive");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Eastern Glaive", "diamond eastern glaive");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Eastern Glaive", "netherite eastern glaive");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Elven Sword")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.elven_sword.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.elven_sword.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.elven_sword.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.elven_sword.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.elven_sword.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Elven Sword", "wooden elven sword");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Elven Sword", "stone elven sword");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Elven Sword", "iron elven sword");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Elven Sword", "diamond elven sword");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Elven Sword", "netherite elven sword");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Dimensional Sword")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.dimensional_sword.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.dimensional_sword.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.dimensional_sword.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.dimensional_sword.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.dimensional_sword.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Dimensional Sword", "wooden dimensional sword");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Dimensional Sword", "stone dimensional sword");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Dimensional Sword", "iron dimensional sword");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Dimensional Sword", "diamond dimensional sword");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Dimensional Sword", "netherite dimensional sword");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Spiked Baseball Bat")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Spiked Baseball Bat", "wooden spiked baseball bat");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Spiked Baseball Bat", "stone spiked baseball bat");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Spiked Baseball Bat", "iron spiked baseball bat");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Spiked Baseball Bat", "diamond spiked baseball bat");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Spiked Baseball Bat", "netherite spiked baseball bat");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Skull Cutlass")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.skull_cutlass.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.skull_culass.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.skull_cutlass.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.skull_cutlass.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.skull_cutlass.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Skull Cutlass", "wooden skull cutlass");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Skull Cutlass", "stone skull cutlass");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Skull Cutlass", "iron skull cutlass");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Skull Cutlass", "diamond skull cutlass");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Skull Cutlass", "netherite skull cutlass");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Falchion Longsword")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.falchion_longsword.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.falchion_longsword.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.falchion_longsword.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.falchion_longsword.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.falchion_longsword.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Falchion Longsword", "wooden falchion longsword");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Falchion Longsword", "stone falchion longsword");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Falchion Longsword", "iron falchion longsword");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Falchion Longsword", "diamond falchion longsword");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Falchion Longsword", "netherite falchion longsword");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Western Glaive")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.western_glaive.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.western_glaive.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.western_glaive.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.western_glaive.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.western_glaive.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Western Glaive", "wooden western glaive");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Western Glaive", "stone western glaive");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Western Glaive", "iron western glaive");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Western Glaive", "diamond western glaive");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Western Glaive", "netherite western glaive");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Wooden Staff")) {
            int pkt_wooden = plugin.getConfig().getInt("skin.sword.wooden_staff.wooden");
            int pkt_stone = plugin.getConfig().getInt("skin.sword.wooden_staff.stone");
            int pkt_iron = plugin.getConfig().getInt("skin.sword.wooden_staffe.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.sword.wooden_staff.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.sword.wooden_staff.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    sword(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.WOODEN_SWORD, pkt_wooden, "Wooden Staff", "wooden wooden staff");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.STONE_SWORD, pkt_stone, "Wooden Staff", "stone wooden staff");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.IRON_SWORD, pkt_iron, "Wooden Staff", "iron wooden staff");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.DIAMOND_SWORD, pkt_diamond, "Wooden Staff", "diamond wooden staff");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ItemShop(p, Material.NETHERITE_SWORD, pkt_netherite, "Wooden Staff", "netherite wooden staff");
                }
            }
        }
    }

    public static InventoryView guiironscabbard(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.iron_scabbard.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.iron_scabbard.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.iron_scabbard.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.iron_scabbard.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.iron_scabbard.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Iron Scabbard"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lIron Scabbard z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lIron Scabbard z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lIron Scabbard z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lIron Scabbard z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lIron Scabbard z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lIron Scabbard");
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

    public static InventoryView guichargedsword(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.charged_sword.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.charged_sword.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.charged_sword.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.charged_sword.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.charged_sword.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Charged Sword"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lCharged Sword z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lCharged Sword z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lCharged Sword z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lCharged Sword z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lCharged Sword z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lCharged Sword");
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

    public static InventoryView guigoldenjavelin(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.golden_javelin.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.golden_javelin.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.golden_javelin.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.golden_javelin.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.golden_javelin.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Golden Javelin"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lGolden Javelin z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lGolden Javelin z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lGolden Javelin z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lGolden Javelin z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lGolden Javelin z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lGolden Javelin");
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

    public static InventoryView guidarvensword(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.dwarven_sword.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.dwarven_sword.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.dwarven_sword.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.dwarven_sword.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.dwarven_sword.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Dwarven Sword"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lDwarven Sword z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lDwarven Sword z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lDwarven Sword z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lDwarven Sword z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lDwarven Sword z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lDwarven Sword");
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

    public static InventoryView guieasternglaive(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.eastern_glaive.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.eastern_glaive.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.eastern_glaive.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.eastern_glaive.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.eastern_glaive.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Eastern Glaive"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lEastern Glaive z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lEastern Glaive z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lEastern Glaive z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lEastern Glaive z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lEastern Glaive z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lEastern Glaive");
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

    public static InventoryView guielevensword(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.elven_sword.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.elven_sword.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.elven_sword.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.elven_sword.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.elven_sword.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Elven Sword"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lElven Sword z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lElven Sword z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lElven Sword z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lElven Sword z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lElven Sword z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lElven Sword");
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

    public static InventoryView guidimensionalsword(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.dimensional_sword.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.dimensional_sword.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.dimensional_sword.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.dimensional_sword.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.dimensional_sword.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Dimensional Sword"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lDimensional Sword z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lDimensional Sword z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lDimensional Sword z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lDimensional Sword z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lDimensional Sword z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lDimensional Sword");
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

    public static InventoryView guispikdedbaseballbat(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.spiked_baseball_bat.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Spiked Baseball Bat"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lSpiked Baseball Bat z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lSpiked Baseball Bat z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lSpiked Baseball Bat z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lSpiked Baseball Bat z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lSpiked Baseball Bat z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lSpiked Baseball Bat");
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

    public static InventoryView guiskullcutlass(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.skull_cutlass.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.skull_cuulass.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.skull_cuulass.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.skull_cutlass.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.skull_cutlass.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Skull Cutlass"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lSkull Cutlass z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lSkull Cutlass z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lSkull Cutlass z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lSkull Cutlass z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lSkull Cutlass z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lSkull Cutlass");
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

    public static InventoryView guifalchionlongsword(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.falchion_longsword.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.falchion_longsword.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.falchion_longsword.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.falchion_longsword.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.falchion_longsword.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Falchion Longsword"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lFalchion Longsword z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lFalchion Longsword z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lFalchion Longsword z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lFalchion Longsword z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lFalchion Longsword z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lFalchion Longsword");
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

    public static InventoryView guiwesternglaive(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.western_glaive.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.western_glaive.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.western_glaive.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.western_glaive.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.western_glaive.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Western Glaive"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lWestern Glaive z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lWestern Glaive z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lWestern Glaive z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lWestern Glaive z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lWestern Glaive z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lWestern Glaive");
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

    public static InventoryView guiwoodenstaff(Player p) {
        int pkt_wooden = plugin.getConfig().getInt("skin.sword.wooden_staff.wooden");
        int pkt_stone = plugin.getConfig().getInt("skin.sword.wooden_staff.stone");
        int pkt_iron = plugin.getConfig().getInt("skin.sword.wooden_staff.iron");
        int pkt_diamond = plugin.getConfig().getInt("skin.sword.wooden_staff.diamond");
        int pkt_netherite = plugin.getConfig().getInt("skin.sword.wooden_staff.netherite");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lKup skin Wooden Staff"));
        ItemBuilder slot29 = (new ItemBuilder(Material.WOODEN_SWORD, 1)).setTitle("§e§lWooden Staff z drewna").addLore("§7").addLore("§fCena §9" + pkt_wooden + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(29, slot29.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.STONE_SWORD, 1)).setTitle("§e§lWooden Staff z kamienia").addLore("§7").addLore("§fCena §9" + pkt_stone + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot31 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§e§lWooden Staff z żelaza").addLore("§7").addLore("§fCena §9" + pkt_iron + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(31, slot31.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lWooden Staff z diamentu").addLore("§7").addLore("§fCena §9" + pkt_diamond + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot33 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lWooden Staff z netheraitu").addLore("§7").addLore("§fCena §9" + pkt_netherite + " pkt.").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij");
        inventory.setItem(33, slot33.build());
        ItemBuilder slot13 = (new ItemBuilder(Material.NETHERITE_SWORD, 1)).setTitle("§e§lWooden Staff");
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
        if (e.getView().getTitle().equals("§9§lKup skin do miecza")) {
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 53) {
                    p.closeInventory();
                    Skiny.menu(p);
                }
                if (e.getRawSlot() == 10) {
                    p.closeInventory();
                    guiironscabbard(p);
                }
                if (e.getRawSlot() == 12) {
                    p.closeInventory();
                    guichargedsword(p);
                }
                if (e.getRawSlot() == 14) {
                    p.closeInventory();
                    guigoldenjavelin(p);
                }
                if (e.getRawSlot() == 16) {
                    p.closeInventory();
                    guidarvensword(p);
                }
                if (e.getRawSlot() == 28) {
                    p.closeInventory();
                    guieasternglaive(p);
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    guielevensword(p);
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    guidimensionalsword(p);
                }
                if (e.getRawSlot() == 34) {
                    p.closeInventory();
                    guispikdedbaseballbat(p);
                }
                if (e.getRawSlot() == 46) {
                    p.closeInventory();
                    guiskullcutlass(p);
                }
                if (e.getRawSlot() == 48) {
                    p.closeInventory();
                    guifalchionlongsword(p);
                }
                if (e.getRawSlot() == 50) {
                    p.closeInventory();
                    guiwesternglaive(p);
                }
                if (e.getRawSlot() == 52) {
                    p.closeInventory();
                    guiwoodenstaff(p);
                }
            }
        }
    }

    public static InventoryView sword(Player p) {
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 54, ("§9§lKup skin do miecza"));
        ItemBuilder slot10 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lIron Scabbard").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(10, slot10.build());
        ItemBuilder slot12 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lCharged Sword").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(12, slot12.build());
        ItemBuilder slot14 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lGolden Javelin").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(14, slot14.build());
        ItemBuilder slot16 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lDwarven Sword").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(16, slot16.build());
        ItemBuilder slot28 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lEastern Glaive").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(28, slot28.build());
        ItemBuilder slot30 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lElven Sword").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(30, slot30.build());
        ItemBuilder slot32 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lDimensional Sword").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(32, slot32.build());
        ItemBuilder slot34 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lSpiked Baseball Bat").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(34, slot34.build());
        ItemBuilder slot46 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lSkull Cutlass").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(46, slot46.build());
        ItemBuilder slot48 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lFalchion Longsword").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(48, slot48.build());
        ItemBuilder slot50 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lWestern Glaive").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
        inventory.setItem(50, slot50.build());
        ItemBuilder slot52 = (new ItemBuilder(Material.DIAMOND_SWORD, 1)).setTitle("§e§lWooden Staff").addLore("§7").addLore("§fCena §9zależy od wyboru surowca").addLore("§7").addLore("§7Jeżeli chcesz kupić to kliknij skin");
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