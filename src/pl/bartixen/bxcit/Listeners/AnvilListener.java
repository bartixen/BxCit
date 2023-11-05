package pl.bartixen.bxcit.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.AnvilInventory;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryView;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import pl.bartixen.bxcit.Main;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;

public class AnvilListener implements Listener {

    static Main plugin;

    public AnvilListener(Main m) {
        plugin = m;
    }

    ArrayList<Player> checkinvenoty = new ArrayList<>();

    @EventHandler
    public void onAnvil(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        if (e.getCurrentItem() == null) {
            return;
        }
        if (e.getCurrentItem().getType() == Material.AIR) {
            return;
        }
        if (e.getInventory().getType() == InventoryType.ANVIL) {
            if(e.getSlotType() == InventoryType.SlotType.RESULT) {
                if (e.getCurrentItem().getType().equals(Material.DIAMOND) || e.getCurrentItem().getType().equals(Material.NETHERITE_INGOT)) {
                    e.setCancelled(true);
                    player.closeInventory();
                    player.kickPlayer("§cWykryto próbę kopiowania");
                    PlayMusic.PlayMusicError(player);
                }
            }
        }
    }

    @EventHandler
    public void onAnvilname(InventoryClickEvent e) {
        Player player = (Player) e.getWhoClicked();
        if (e.getCurrentItem() == null) {
            return;
        }
        if (e.getCurrentItem().getType() == Material.AIR) {
            return;
        }
        if (e.getInventory().getType() == InventoryType.ANVIL) {
            Inventory inv = e.getInventory();
            AnvilInventory anvil = (AnvilInventory)inv;
            int rawSlot = e.getRawSlot();
            InventoryView view = e.getView();
            String nameitfirst = "";
            if(rawSlot == view.convertSlot(rawSlot)){
                ItemStack[] items = anvil.getContents();
                ItemStack item1 = items[0];
                ItemMeta itmemeta = item1.getItemMeta();
                nameitfirst = itmemeta.getDisplayName().toLowerCase();
            }
            if (e.getSlotType() == InventoryType.SlotType.RESULT) {
                List<String> skiny = plugin.getConfig().getStringList("list_skins");
                String nameditemu = e.getCurrentItem().getItemMeta().getDisplayName().toLowerCase();
                checkinvenoty.add(player);
                for (String blacklist : skiny) {
                    if ((ChatColor.stripColor(nameditemu).equals(ChatColor.stripColor(blacklist.toLowerCase()))) && (!(ChatColor.stripColor(nameditemu).equals(ChatColor.stripColor(nameitfirst.toLowerCase()))))) {
                        e.setCancelled(true);
                        player.closeInventory();
                        player.kickPlayer("§cWykryto próbę kopiowania");
                        PlayMusic.PlayMusicError(player);
                        plugin.getLogger().log(Level.WARNING, "§cGracz §e" + player.getDisplayName() + " §cpróbował skopiować skiny");
                        for (Player players : Bukkit.getOnlinePlayers()) {
                            if (players.hasPermission("bxcore.alert.helpop") || players.isOp()) {
                                players.sendMessage("§eGracz §c" + player.getName() + " §epróbował skopiować skiny");
                            }
                        }
                        break;
                    }
                }
                checkinvenoty.remove(player);
            }
        }
    }

    @EventHandler
    public void onAnvilnameclick(InventoryClickEvent e) {
        Player p = (Player) e.getWhoClicked();
        if (checkinvenoty.contains(p)) {
            e.setCancelled(true);
        }
    }
}
