package pl.bartixen.bxcit.Commands;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.InventoryView;
import pl.bartixen.bxcit.Data.ItemBuilder;
import pl.bartixen.bxcit.Data.SkinyDataManager;
import pl.bartixen.bxcit.Main;

import java.io.IOException;
import java.util.UUID;

public class Skiny implements CommandExecutor {

    Main plugin;

    static SkinyDataManager data;

    public Skiny(Main m) {
        plugin = m;
        m.getCommand("skiny").setExecutor(this);
        data = SkinyDataManager.getInstance();
    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage("§cTa komenda jest przeznaczona tylko dla graczy");
            return false;
        }
        Player p = (Player)sender;
        try {
            this.menu(p);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static InventoryView menu(Player p) throws IOException {
        UUID uuid = p.getUniqueId();
        if ((data.getData().getString(uuid + ".pkt")) == null) {
            data.getData().set(uuid + ".pkt", 0);
            data.saveData();
        }
        int pkt = data.getData().getInt(uuid + ".pkt");
        Inventory inventory = Bukkit.createInventory((InventoryHolder)p, 45, ("§9§lMenu skinów"));
        ItemBuilder slot10 = (new ItemBuilder(Material.SHIELD, 1)).setTitle("§7stone shield").addLore("§e§lKategoria tarcze");
        ItemBuilder slot12 = (new ItemBuilder(Material.BOW, 1)).setTitle("§7dark bow").addLore("§e§lKategoria łuki");
        ItemBuilder slot14 = (new ItemBuilder(Material.IRON_SWORD, 1)).setTitle("§7charged sword").addLore("§e§lKategoria miecze");
        ItemBuilder slot16 = (new ItemBuilder(Material.ELYTRA, 1)).setTitle("§7enderman minecon").addLore("§e§lKategoria elytry");
        ItemBuilder slot28 = (new ItemBuilder(Material.BOW, 1)).setTitle("§7ak-47").addLore("§e§lKategoria bronie");
        ItemBuilder slot30 = (new ItemBuilder(Material.IRON_AXE, 1)).setTitle("§7nordic axe").addLore("§e§lKategoria siekiery");
        ItemBuilder slot32 = (new ItemBuilder(Material.IRON_CHESTPLATE, 1)).setTitle("§7kings chestplate").addLore("§e§lKategoria zbroje");
        ItemBuilder slot44 = (new ItemBuilder(Material.PAPER, 1)).setTitle("§e§lInformacje o skinach").addLore("§7").addLore("§f§o- Co to są te skiny?").addLore("§fSą to skórki na itemy, które zmieniają tylko wygląd danego przedmiotu.").addLore("§7").addLore("§f§o- Co otrzymam po kupnie skina?").addLore("§fJak kupisz skina to dostaniesz predmiot z wybranego przez ciebie surwoca.").addLore("§7").addLore("§f§o- Dlaczego to jest takie drogie?").addLore("§fCena jest taka wysoka, ponieważ jeżeli wybierzesz zbroje z netherytu").addLore("§fto dostajesz całą neterytową zbroje ze skinem.").addLore("§7").addLore("§7§oZnalazłeś błąd?").addLore("§7§oZgłoś go jak najszybciej do administratora").addLore("§7");
        ItemBuilder slot36 = (new ItemBuilder(Material.CHEST, 1)).setTitle("§f§lPosiadasz §9§l" + pkt + " pkt.").addLore("§7").addLore("§f§oChcesz doładować?").addLore("§fKliknij skrzynke").addLore("§7");
        inventory.setItem(10, slot10.build());
        inventory.setItem(12, slot12.build());
        inventory.setItem(14, slot14.build());
        inventory.setItem(16, slot16.build());
        inventory.setItem(28, slot28.build());
        inventory.setItem(30, slot30.build());
        inventory.setItem(32, slot32.build());
        inventory.setItem(44, slot44.build());
        inventory.setItem(36, slot36.build());
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
        inventory.setItem(34, backguard.build());
        inventory.setItem(35, backguard.build());
        inventory.setItem(37, backguard.build());
        inventory.setItem(38, backguard.build());
        inventory.setItem(39, backguard.build());
        inventory.setItem(40, backguard.build());
        inventory.setItem(41, backguard.build());
        inventory.setItem(42, backguard.build());
        inventory.setItem(43, backguard.build());
        return p.openInventory(inventory);
    }
}
