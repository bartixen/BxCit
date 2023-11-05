package pl.bartixen.bxcit.Listeners;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import pl.bartixen.bxcit.Main;
import pl.bartixen.bxcit.Shop.ItemsShop;

import java.io.IOException;
import java.util.UUID;

public class ArmorsShop implements Listener {

    static Main plugin;

    public ArmorsShop(Main m) {
        plugin = m;
    }

    @EventHandler
    public void shoparmor1(InventoryClickEvent e) throws IOException {
        Player p = (Player) e.getWhoClicked();
        UUID uuid = p.getUniqueId();
        if (e.getView().getTitle().equals("§9§lKup skin Cowboy")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.cowboy.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.cowboy.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.cowboy.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.cowboy.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.cowboy.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages1(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Cowboy", pkt_chainmail, "Cowboy Hat", Material.CHAINMAIL_HELMET, "Cowboy Jacket", Material.CHAINMAIL_CHESTPLATE, "Cowboy Pants", Material.CHAINMAIL_LEGGINGS, "Cowboy Boots", Material.CHAINMAIL_BOOTS, "chainmail cowboy");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Cowboy", pkt_golden, "Cowboy Hat", Material.GOLDEN_HELMET, "Cowboy Jacket", Material.GOLDEN_CHESTPLATE, "Cowboy Pants", Material.GOLDEN_LEGGINGS, "Cowboy Boots", Material.GOLDEN_BOOTS, "golden cowboy");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Cowboy", pkt_iron, "Cowboy Hat", Material.IRON_HELMET, "Cowboy Jacket", Material.IRON_CHESTPLATE, "Cowboy Pants", Material.IRON_LEGGINGS, "Cowboy Boots", Material.IRON_BOOTS, "iron cowboy");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Cowboy", pkt_diamond, "Cowboy Hat", Material.DIAMOND_HELMET, "Cowboy Jacket", Material.DIAMOND_CHESTPLATE, "Cowboy Pants", Material.DIAMOND_LEGGINGS, "Cowboy Boots", Material.DIAMOND_BOOTS, "diamond cowboy");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Cowboy", pkt_netherite, "Cowboy Hat", Material.NETHERITE_HELMET, "Cowboy Jacket", Material.NETHERITE_CHESTPLATE, "Cowboy Pants", Material.NETHERITE_LEGGINGS, "Cowboy Boots", Material.NETHERITE_BOOTS, "netherite cowboy");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Apache")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.apache.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.apache.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.apache.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.apache.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.apache.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages1(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Apache", pkt_chainmail, "Apache Hood", Material.CHAINMAIL_HELMET, "Apache Cloak", Material.CHAINMAIL_CHESTPLATE, "Apache Leggings", Material.CHAINMAIL_LEGGINGS, "Apache Boots", Material.CHAINMAIL_BOOTS, "chainmail apache");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Apache", pkt_golden, "Apache Hood", Material.GOLDEN_HELMET, "Apache Cloak", Material.GOLDEN_CHESTPLATE, "Apache Leggings", Material.GOLDEN_LEGGINGS, "Apache Boots", Material.GOLDEN_BOOTS, "golden apache");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Apache", pkt_iron, "Apache Hood", Material.IRON_HELMET, "Apache Cloak", Material.IRON_CHESTPLATE, "Apache Leggings", Material.IRON_LEGGINGS, "Apache Boots", Material.IRON_BOOTS, "iron apache");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Apache", pkt_diamond, "Apache Hood", Material.DIAMOND_HELMET, "Apache Cloak", Material.DIAMOND_CHESTPLATE, "Apache Leggings", Material.DIAMOND_LEGGINGS, "Apache Boots", Material.DIAMOND_BOOTS, "diamond apache");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Apache", pkt_netherite, "Apache Hood", Material.NETHERITE_HELMET, "Apache Cloak", Material.NETHERITE_CHESTPLATE, "Apache Leggings", Material.NETHERITE_LEGGINGS, "Apache Boots", Material.NETHERITE_BOOTS, "netherite apache");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Aztec")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.aztec.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.aztec.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.aztec.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.aztec.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.aztec.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages1(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Aztec", pkt_chainmail, "Aztec Helmet", Material.CHAINMAIL_HELMET, "Aztec Cloak", Material.CHAINMAIL_CHESTPLATE, "Aztec Leggings", Material.CHAINMAIL_LEGGINGS, "Aztec Boots", Material.CHAINMAIL_BOOTS, "chainmail aztec");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Aztec", pkt_golden, "Aztec Helmet", Material.GOLDEN_HELMET, "Aztec Cloak", Material.GOLDEN_CHESTPLATE, "Aztec Leggings", Material.GOLDEN_LEGGINGS, "Aztec Boots", Material.GOLDEN_BOOTS, "golden aztec");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Aztec", pkt_iron, "Aztec Helmet", Material.IRON_HELMET, "Aztec Cloak", Material.IRON_CHESTPLATE, "Aztec Leggings", Material.IRON_LEGGINGS, "Aztec Boots", Material.IRON_BOOTS, "iron aztec");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Aztec", pkt_diamond, "Aztec Helmet", Material.DIAMOND_HELMET, "Aztec Cloak", Material.DIAMOND_CHESTPLATE, "Aztec Leggings", Material.DIAMOND_LEGGINGS, "Aztec Boots", Material.DIAMOND_BOOTS, "diamond aztec");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Aztec", pkt_netherite, "Aztec Helmet", Material.NETHERITE_HELMET, "Aztec Cloak", Material.NETHERITE_CHESTPLATE, "Aztec Leggings", Material.NETHERITE_LEGGINGS, "Aztec Boots", Material.NETHERITE_BOOTS, "netherite aztec");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Guard")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.guard.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.guard.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.guard.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.guard.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.guard.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages1(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Guard", pkt_chainmail, "Guard Helmet", Material.CHAINMAIL_HELMET, "Guard Chestplate", Material.CHAINMAIL_CHESTPLATE, "Guard Leggings", Material.CHAINMAIL_LEGGINGS, "Guard Boots", Material.CHAINMAIL_BOOTS, "chainmail guard");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Guard", pkt_golden, "Guard Helmet", Material.GOLDEN_HELMET, "Guard Chestplate", Material.GOLDEN_CHESTPLATE, "Guard Leggings", Material.GOLDEN_LEGGINGS, "Guard Boots", Material.GOLDEN_BOOTS, "golden guard");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Guard", pkt_iron, "Guard Helmet", Material.IRON_HELMET, "Guard Chestplate", Material.IRON_CHESTPLATE, "Guard Leggings", Material.IRON_LEGGINGS, "Guard Boots", Material.IRON_BOOTS, "iron guard");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Guard", pkt_diamond, "Guard Helmet", Material.DIAMOND_HELMET, "Guard Chestplate", Material.DIAMOND_CHESTPLATE, "Guard Leggings", Material.DIAMOND_LEGGINGS, "Guard Boots", Material.DIAMOND_BOOTS, "diamond guard");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Guard", pkt_netherite, "Guard Helmet", Material.NETHERITE_HELMET, "Guard Chestplate", Material.NETHERITE_CHESTPLATE, "Guard Leggings", Material.NETHERITE_LEGGINGS, "Guard Boots", Material.NETHERITE_BOOTS, "netherite guard");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Emperors")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.emperors.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.emperors.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.emperors.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.emperors.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.emperors.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages1(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Emperors", pkt_chainmail, "Emperors Helmet", Material.CHAINMAIL_HELMET, "Emperors Chestplate", Material.CHAINMAIL_CHESTPLATE, "Emperors Leggings", Material.CHAINMAIL_LEGGINGS, "Emperors Boots", Material.CHAINMAIL_BOOTS, "chainmail emperors");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Emperors", pkt_golden, "Emperors Helmet", Material.GOLDEN_HELMET, "Emperors Chestplate", Material.GOLDEN_CHESTPLATE, "Emperors Leggings", Material.GOLDEN_LEGGINGS, "Emperors Boots", Material.GOLDEN_BOOTS, "golden emperors");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Emperors", pkt_iron, "Emperors Helmet", Material.IRON_HELMET, "Emperors Chestplate", Material.IRON_CHESTPLATE, "Emperors Leggings", Material.IRON_LEGGINGS, "Emperors Boots", Material.IRON_BOOTS, "iron emperors");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Emperors", pkt_diamond, "Emperors Helmet", Material.DIAMOND_HELMET, "Emperors Chestplate", Material.DIAMOND_CHESTPLATE, "Emperors Leggings", Material.DIAMOND_LEGGINGS, "Emperors Boots", Material.DIAMOND_BOOTS, "diamond emperors");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Emperors", pkt_netherite, "Emperors Helmet", Material.NETHERITE_HELMET, "Emperors Chestplate", Material.NETHERITE_CHESTPLATE, "Emperors Leggings", Material.NETHERITE_LEGGINGS, "Emperors Boots", Material.NETHERITE_BOOTS, "netherite emperors");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Kings")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.kings.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.kings.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.kings.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.kings.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.kings.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages1(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Kings", pkt_chainmail, "Kings Helmet", Material.CHAINMAIL_HELMET, "Kings Chestplate", Material.CHAINMAIL_CHESTPLATE, "Kings Leggings", Material.CHAINMAIL_LEGGINGS, "Kings Boots", Material.CHAINMAIL_BOOTS, "chainmail kings");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Kings", pkt_golden, "Kings Helmet", Material.GOLDEN_HELMET, "Kings Chestplate", Material.GOLDEN_CHESTPLATE, "Kings Leggings", Material.GOLDEN_LEGGINGS, "Kings Boots", Material.GOLDEN_BOOTS, "golden kings");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Kings", pkt_iron, "Kings Helmet", Material.IRON_HELMET, "Kings Chestplate", Material.IRON_CHESTPLATE, "Kings Leggings", Material.IRON_LEGGINGS, "Kings Boots", Material.IRON_BOOTS, "iron kings");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Kings", pkt_diamond, "Kings Helmet", Material.DIAMOND_HELMET, "Kings Chestplate", Material.DIAMOND_CHESTPLATE, "Kings Leggings", Material.DIAMOND_LEGGINGS, "Kings Boots", Material.DIAMOND_BOOTS, "diamond kings");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Kings", pkt_netherite, "Kings Helmet", Material.NETHERITE_HELMET, "Kings Chestplate", Material.NETHERITE_CHESTPLATE, "Kings Leggings", Material.NETHERITE_LEGGINGS, "Kings Boots", Material.NETHERITE_BOOTS, "netherite kings");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Knights")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.kinghts.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.kinghts.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.kinghts.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.kinghts.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.kinghts.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages1(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Knights", pkt_chainmail, "Knights Helmet", Material.CHAINMAIL_HELMET, "Knights Chestplate", Material.CHAINMAIL_CHESTPLATE, "Knights Leggings", Material.CHAINMAIL_LEGGINGS, "Knights Boots", Material.CHAINMAIL_BOOTS, "chainmail kinghts");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Knights", pkt_golden, "Knights Helmet", Material.GOLDEN_HELMET, "Knights Chestplate", Material.GOLDEN_CHESTPLATE, "Knights Leggings", Material.GOLDEN_LEGGINGS, "Knights Boots", Material.GOLDEN_BOOTS, "golden kinghts");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Knights", pkt_iron, "Knights Helmet", Material.IRON_HELMET, "Knights Chestplate", Material.IRON_CHESTPLATE, "Knights Leggings", Material.IRON_LEGGINGS, "Knights Boots", Material.IRON_BOOTS, "iron kinghts");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Knights", pkt_diamond, "Knights Helmet", Material.DIAMOND_HELMET, "Knights Chestplate", Material.DIAMOND_CHESTPLATE, "Knights Leggings", Material.DIAMOND_LEGGINGS, "Knights Boots", Material.DIAMOND_BOOTS, "diamond kinghts");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Knights", pkt_netherite, "Knights Helmet", Material.NETHERITE_HELMET, "Knights Chestplate", Material.NETHERITE_CHESTPLATE, "Knights Leggings", Material.NETHERITE_LEGGINGS, "Knights Boots", Material.NETHERITE_BOOTS, "netherite kinghts");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Ninja")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.ninja.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.ninja.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.ninja.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.ninja.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.ninja.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages2(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Ninja", pkt_chainmail, "Ninja Mask", Material.CHAINMAIL_HELMET, "Ninja Tunic", Material.CHAINMAIL_CHESTPLATE, "Ninja Pants", Material.CHAINMAIL_LEGGINGS, "Ninja Boots", Material.CHAINMAIL_BOOTS, "chainmail ninja");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Ninja", pkt_golden, "Ninja Mask", Material.GOLDEN_HELMET, "Ninja Tunic", Material.GOLDEN_CHESTPLATE, "Ninja Pants", Material.GOLDEN_LEGGINGS, "Ninja Boots", Material.GOLDEN_BOOTS, "golden ninja");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Ninja", pkt_iron, "Ninja Mask", Material.IRON_HELMET, "Ninja Tunic", Material.IRON_CHESTPLATE, "Ninja Pants", Material.IRON_LEGGINGS, "Ninja Boots", Material.IRON_BOOTS, "iron ninja");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Ninja", pkt_diamond, "Ninja Mask", Material.DIAMOND_HELMET, "Ninja Tunic", Material.DIAMOND_CHESTPLATE, "Ninja Pants", Material.DIAMOND_LEGGINGS, "Ninja Boots", Material.DIAMOND_BOOTS, "diamond ninja");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Ninja", pkt_netherite, "Ninja Mask", Material.NETHERITE_HELMET, "Ninja Tunic", Material.NETHERITE_CHESTPLATE, "Ninja Pants", Material.NETHERITE_LEGGINGS, "Ninja Boots", Material.NETHERITE_BOOTS, "netherite ninja");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Nordic")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.nordic.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.nordic.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.nordic.iron");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.nordic.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.nordic.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages2(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Nordic", pkt_chainmail, "Nordic Helmet", Material.CHAINMAIL_HELMET, "Nordic Chestplate", Material.CHAINMAIL_CHESTPLATE, "Nordic Leggings", Material.CHAINMAIL_LEGGINGS, "Nordic Boots", Material.CHAINMAIL_BOOTS, "chainmail nordic");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Nordic", pkt_golden, "Nordic Helmet", Material.GOLDEN_HELMET, "Nordic Chestplate", Material.GOLDEN_CHESTPLATE, "Nordic Leggings", Material.GOLDEN_LEGGINGS, "Nordic Boots", Material.GOLDEN_BOOTS, "golden nordic");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Nordic", pkt_iron, "Nordic Helmet", Material.IRON_HELMET, "Nordic Chestplate", Material.IRON_CHESTPLATE, "Nordic Leggings", Material.IRON_LEGGINGS, "Nordic Boots", Material.IRON_BOOTS, "iron nordic");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Nordic", pkt_diamond, "Nordic Helmet", Material.DIAMOND_HELMET, "Nordic Chestplate", Material.DIAMOND_CHESTPLATE, "Nordic Leggings", Material.DIAMOND_LEGGINGS, "Nordic Boots", Material.DIAMOND_BOOTS, "diamond nordic");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Nordic", pkt_netherite, "Nordic Helmet", Material.NETHERITE_HELMET, "Nordic Chestplate", Material.NETHERITE_CHESTPLATE, "Nordic Leggings", Material.NETHERITE_LEGGINGS, "Nordic Boots", Material.NETHERITE_BOOTS, "netherite nordic");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Bone")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.bone.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.bone.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.bone.bone");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.bone.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.bone.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages2(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Bone", pkt_chainmail, "Bone Helmet", Material.CHAINMAIL_HELMET, "Bone Chestplate", Material.CHAINMAIL_CHESTPLATE, "Bone Leggings", Material.CHAINMAIL_LEGGINGS, "Bone Boots", Material.CHAINMAIL_BOOTS, "chainmail bone");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Bone", pkt_golden, "Bone Helmet", Material.GOLDEN_HELMET, "Bone Chestplate", Material.GOLDEN_CHESTPLATE, "Bone Leggings", Material.GOLDEN_LEGGINGS, "Bone Boots", Material.GOLDEN_BOOTS, "golden bone");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Bone", pkt_iron, "Bone Helmet", Material.IRON_HELMET, "Bone Chestplate", Material.IRON_CHESTPLATE, "Bone Leggings", Material.IRON_LEGGINGS, "Bone Boots", Material.IRON_BOOTS, "iron bone");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Bone", pkt_diamond, "Bone Helmet", Material.DIAMOND_HELMET, "Bone Chestplate", Material.DIAMOND_CHESTPLATE, "Bone Leggings", Material.DIAMOND_LEGGINGS, "Bone Boots", Material.DIAMOND_BOOTS, "diamond bone");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Bone", pkt_netherite, "Bone Helmet", Material.NETHERITE_HELMET, "Bone Chestplate", Material.NETHERITE_CHESTPLATE, "Bone Leggings", Material.NETHERITE_LEGGINGS, "Bone Boots", Material.NETHERITE_BOOTS, "netherite bone");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Space")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.space.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.space.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.space.bone");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.space.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.space.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages2(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Space", pkt_chainmail, "Space Helmet", Material.CHAINMAIL_HELMET, "Space Jacket", Material.CHAINMAIL_CHESTPLATE, "Space Pants", Material.CHAINMAIL_LEGGINGS, "Space Boots", Material.CHAINMAIL_BOOTS, "chainmail bone");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Space", pkt_golden, "Space Helmet", Material.GOLDEN_HELMET, "Space Jacket", Material.GOLDEN_CHESTPLATE, "Space Pants", Material.GOLDEN_LEGGINGS, "Space Boots", Material.GOLDEN_BOOTS, "golden space");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Space", pkt_iron, "Space Helmet", Material.IRON_HELMET, "Space Jacket", Material.IRON_CHESTPLATE, "Space Pants", Material.IRON_LEGGINGS, "Space Boots", Material.IRON_BOOTS, "iron space");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Space", pkt_diamond, "Space Helmet", Material.DIAMOND_HELMET, "Space Jacket", Material.DIAMOND_CHESTPLATE, "Space Pants", Material.DIAMOND_LEGGINGS, "Space Boots", Material.DIAMOND_BOOTS, "diamond space");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Space", pkt_netherite, "Space Helmet", Material.NETHERITE_HELMET, "Space Jacket", Material.NETHERITE_CHESTPLATE, "Space Pants", Material.NETHERITE_LEGGINGS, "Space Boots", Material.NETHERITE_BOOTS, "netherite space");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Spartan")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.spartan.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.spartan.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.spartan.bone");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.spartan.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.spartan.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages2(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Spartan", pkt_chainmail, "Spartan Helmet", Material.CHAINMAIL_HELMET, "Spartan Chestplate", Material.CHAINMAIL_CHESTPLATE, "Spartan Leggings", Material.CHAINMAIL_LEGGINGS, "Spartan Boots", Material.CHAINMAIL_BOOTS, "chainmail spartan");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Spartan", pkt_golden, "Spartan Helmet", Material.GOLDEN_HELMET, "Spartan Chestplate", Material.GOLDEN_CHESTPLATE, "Spartan Leggings", Material.GOLDEN_LEGGINGS, "Spartan Boots", Material.GOLDEN_BOOTS, "golden spartan");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Spartan", pkt_iron, "Spartan Helmet", Material.IRON_HELMET, "Spartan Chestplate", Material.IRON_CHESTPLATE, "Spartan Leggings", Material.IRON_LEGGINGS, "Spartan Boots", Material.IRON_BOOTS, "iron spartan");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Spartan", pkt_diamond, "Spartan Helmet", Material.DIAMOND_HELMET, "Spartan Chestplate", Material.DIAMOND_CHESTPLATE, "Spartan Leggings", Material.DIAMOND_LEGGINGS, "Spartan Boots", Material.DIAMOND_BOOTS, "diamond spartan");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Spartan", pkt_netherite, "Spartan Helmet", Material.NETHERITE_HELMET, "Spartan Chestplate", Material.NETHERITE_CHESTPLATE, "Spartan Leggings", Material.NETHERITE_LEGGINGS, "Spartan Boots", Material.NETHERITE_BOOTS, "netherite spartan");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Dragon")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.dragon.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.dragon.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.dragon.bone");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.dragon.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.dragon.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages2(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Dragon", pkt_chainmail, "Dragon Helmet", Material.CHAINMAIL_HELMET, "Dragon Chestplate", Material.CHAINMAIL_CHESTPLATE, "Dragon Leggings", Material.CHAINMAIL_LEGGINGS, "Dragon Boots", Material.CHAINMAIL_BOOTS, "chainmail dragon");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Dragon", pkt_golden, "Dragon Helmet", Material.GOLDEN_HELMET, "Dragon Chestplate", Material.GOLDEN_CHESTPLATE, "Dragon Leggings", Material.GOLDEN_LEGGINGS, "Dragon Boots", Material.GOLDEN_BOOTS, "golden dragon");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Dragon", pkt_iron, "Dragon Helmet", Material.IRON_HELMET, "Dragon Chestplate", Material.IRON_CHESTPLATE, "Dragon Leggings", Material.IRON_LEGGINGS, "Dragon Boots", Material.IRON_BOOTS, "iron dragon");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Dragon", pkt_diamond, "Dragon Helmet", Material.DIAMOND_HELMET, "Dragon Chestplate", Material.DIAMOND_CHESTPLATE, "Dragon Leggings", Material.DIAMOND_LEGGINGS, "Dragon Boots", Material.DIAMOND_BOOTS, "diamond dragon");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Dragon", pkt_netherite, "Dragon Helmet", Material.NETHERITE_HELMET, "Dragon Chestplate", Material.NETHERITE_CHESTPLATE, "Dragon Leggings", Material.NETHERITE_LEGGINGS, "Dragon Boots", Material.NETHERITE_BOOTS, "netherite dragon");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Steel")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.steel.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.steel.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.steel.bone");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.steel.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.steel.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages2(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steel", pkt_chainmail, "Steel Helmet", Material.CHAINMAIL_HELMET, "Steel Chestplate", Material.CHAINMAIL_CHESTPLATE, "Steel Leggings", Material.CHAINMAIL_LEGGINGS, "Steel Boots", Material.CHAINMAIL_BOOTS, "chainmail steel");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steel", pkt_golden, "Steel Helmet", Material.GOLDEN_HELMET, "Steel Chestplate", Material.GOLDEN_CHESTPLATE, "Steel Leggings", Material.GOLDEN_LEGGINGS, "Steel Boots", Material.GOLDEN_BOOTS, "golden steel");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steel", pkt_iron, "Steel Helmet", Material.IRON_HELMET, "Steel Chestplate", Material.IRON_CHESTPLATE, "Steel Leggings", Material.IRON_LEGGINGS, "Steel Boots", Material.IRON_BOOTS, "iron steel");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steel", pkt_diamond, "Steel Helmet", Material.DIAMOND_HELMET, "Steel Chestplate", Material.DIAMOND_CHESTPLATE, "Steel Leggings", Material.DIAMOND_LEGGINGS, "Steel Boots", Material.DIAMOND_BOOTS, "diamond steel");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steel", pkt_netherite, "Steel Helmet", Material.NETHERITE_HELMET, "Steel Chestplate", Material.NETHERITE_CHESTPLATE, "Steel Leggings", Material.NETHERITE_LEGGINGS, "Steel Boots", Material.NETHERITE_BOOTS, "netherite steel");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Elven")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.elven.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.elven.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.elven.bone");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.elven.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.elven.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages3(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Elven", pkt_chainmail, "Elven Helmet", Material.CHAINMAIL_HELMET, "Elven Chestplate", Material.CHAINMAIL_CHESTPLATE, "Elven Leggings", Material.CHAINMAIL_LEGGINGS, "Elven Boots", Material.CHAINMAIL_BOOTS, "chainmail elven");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Elven", pkt_golden, "Elven Helmet", Material.GOLDEN_HELMET, "Elven Chestplate", Material.GOLDEN_CHESTPLATE, "Elven Leggings", Material.GOLDEN_LEGGINGS, "Elven Boots", Material.GOLDEN_BOOTS, "golden elven");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Elven", pkt_iron, "Elven Helmet", Material.IRON_HELMET, "Elven Chestplate", Material.IRON_CHESTPLATE, "Elven Leggings", Material.IRON_LEGGINGS, "Elven Boots", Material.IRON_BOOTS, "iron elven");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Elven", pkt_diamond, "Elven Helmet", Material.DIAMOND_HELMET, "Elven Chestplate", Material.DIAMOND_CHESTPLATE, "Elven Leggings", Material.DIAMOND_LEGGINGS, "Elven Boots", Material.DIAMOND_BOOTS, "diamond elven");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Elven", pkt_netherite, "Elven Helmet", Material.NETHERITE_HELMET, "Elven Chestplate", Material.NETHERITE_CHESTPLATE, "Elven Leggings", Material.NETHERITE_LEGGINGS, "Elven Boots", Material.NETHERITE_BOOTS, "netherite elven");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Samurai")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.samurai.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.samurai.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.samurai.bone");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.samurai.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.samurai.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages3(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Samurai", pkt_chainmail, "Samurai Helmet", Material.CHAINMAIL_HELMET, "Samurai Chestplate", Material.CHAINMAIL_CHESTPLATE, "Samurai Leggings", Material.CHAINMAIL_LEGGINGS, "Samurai Boots", Material.CHAINMAIL_BOOTS, "chainmail samurai");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Samurai", pkt_golden, "Samurai Helmet", Material.GOLDEN_HELMET, "Samurai Chestplate", Material.GOLDEN_CHESTPLATE, "Samurai Leggings", Material.GOLDEN_LEGGINGS, "Samurai Boots", Material.GOLDEN_BOOTS, "golden samurai");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Samurai", pkt_iron, "Samurai Helmet", Material.IRON_HELMET, "Samurai Chestplate", Material.IRON_CHESTPLATE, "Samurai Leggings", Material.IRON_LEGGINGS, "Samurai Boots", Material.IRON_BOOTS, "iron samurai");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Samurai", pkt_diamond, "Samurai Helmet", Material.DIAMOND_HELMET, "Samurai Chestplate", Material.DIAMOND_CHESTPLATE, "Samurai Leggings", Material.DIAMOND_LEGGINGS, "Samurai Boots", Material.DIAMOND_BOOTS, "diamond samurai");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Samurai", pkt_netherite, "Samurai Helmet", Material.NETHERITE_HELMET, "Samurai Chestplate", Material.NETHERITE_CHESTPLATE, "Samurai Leggings", Material.NETHERITE_LEGGINGS, "Samurai Boots", Material.NETHERITE_BOOTS, "netherite samurai");
                }
            }
        }
        if (e.getView().getTitle().equals("§9§lKup skin Steampunk")) {
            int pkt_chainmail = plugin.getConfig().getInt("skin.armor.steampunk.chainmail");
            int pkt_golden = plugin.getConfig().getInt("skin.armor.steampunk.golden");
            int pkt_iron = plugin.getConfig().getInt("skin.armor.steampunk.bone");
            int pkt_diamond = plugin.getConfig().getInt("skin.armor.steampunk.diamond");
            int pkt_netherite = plugin.getConfig().getInt("skin.armor.steampunk.netherite");
            if (e.getRawSlot() == -999) p.closeInventory();
            if (e.getRawSlot() < e.getInventory().getSize()) {
                e.setCancelled(true);
                if (e.getRawSlot() == 44) {
                    p.closeInventory();
                    ArmorPages.armorpages3(p);
                }
                if (e.getRawSlot() == 29) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steampunk", pkt_chainmail, "Steampunk Cap", Material.CHAINMAIL_HELMET, "Steampunk Tunic", Material.CHAINMAIL_CHESTPLATE, "Steampunk Pants", Material.CHAINMAIL_LEGGINGS, "Steampunk Boots", Material.CHAINMAIL_BOOTS, "chainmail steampunk");
                }
                if (e.getRawSlot() == 30) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steampunk", pkt_golden, "Steampunk Cap", Material.GOLDEN_HELMET, "Steampunk Tunic", Material.GOLDEN_CHESTPLATE, "Steampunk Pants", Material.GOLDEN_LEGGINGS, "Steampunk Boots", Material.GOLDEN_BOOTS, "golden steampunk");
                }
                if (e.getRawSlot() == 31) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steampunk", pkt_iron, "Steampunk Cap", Material.IRON_HELMET, "Steampunk Tunic", Material.IRON_CHESTPLATE, "Steampunk Pants", Material.IRON_LEGGINGS, "Steampunk Boots", Material.IRON_BOOTS, "iron steampunk");
                }
                if (e.getRawSlot() == 32) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steampunk", pkt_diamond, "Steampunk Cap", Material.DIAMOND_HELMET, "Steampunk Tunic", Material.DIAMOND_CHESTPLATE, "Steampunk Pants", Material.DIAMOND_LEGGINGS, "Steampunk Boots", Material.DIAMOND_BOOTS, "diamond steampunk");
                }
                if (e.getRawSlot() == 33) {
                    p.closeInventory();
                    ItemsShop.ArmorShop(p, "Steampunk", pkt_netherite, "Steampunk Cap", Material.NETHERITE_HELMET, "Steampunk Tunic", Material.NETHERITE_CHESTPLATE, "Steampunk Pants", Material.NETHERITE_LEGGINGS, "Steampunk Boots", Material.NETHERITE_BOOTS, "netherite steampunk");
                }
            }
        }
    }
}
