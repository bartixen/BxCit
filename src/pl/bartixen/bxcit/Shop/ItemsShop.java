package pl.bartixen.bxcit.Shop;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import pl.bartixen.bxcit.Data.SkinsDataManager;
import pl.bartixen.bxcit.Listeners.PlayMusic;
import pl.bartixen.bxcit.Main;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.UUID;

public class ItemsShop {

    static Main plugin;

    static SkinsDataManager data;

    static ArrayList<String> listasprzedarzy = new ArrayList<>();

    public ItemsShop(Main m) {
        plugin = m;
        data = SkinsDataManager.getInstance();
    }

    public static void ItemShop(Player p, Material material, int pkt_ile, String nazwa, String nazwa_przedmiotu) throws IOException {
        UUID uuid = p.getUniqueId();
        if ((data.getData().getInt(uuid + ".pkt")) >= pkt_ile) {
            String kodsprzedazy = losowanie(8);
            Date now = new Date();
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
            listasprzedarzy = (ArrayList<String>) data.getData().getStringList(uuid + ".lista_sprzedaz");
            data.getData().set(uuid + ".pkt", data.getData().getInt(uuid + ".pkt") - pkt_ile);
            data.getData().set(uuid + ".sprzedaz." + kodsprzedazy + ".name", p.getName());
            data.getData().set(uuid + ".sprzedaz." + kodsprzedazy + ".data", format.format(now));
            data.getData().set(uuid + ".sprzedaz." + kodsprzedazy + ".item", nazwa_przedmiotu);
            data.getData().set(uuid + ".sprzedaz." + kodsprzedazy + ".koszt", pkt_ile);
            listasprzedarzy.add(kodsprzedazy);
            data.getData().set(uuid + ".lista_sprzedaz", listasprzedarzy);
            data.saveData();
            ItemStack itemStack = new ItemStack(material);
            ItemMeta itemMeta = itemStack.getItemMeta();
            itemMeta.setDisplayName("§e§l" + nazwa);
            itemMeta.setLore(Arrays.asList("§7[ID:" + kodsprzedazy + "]"));
            itemStack.setItemMeta(itemMeta);
            p.getInventory().addItem(itemStack);
            p.sendMessage("§fPomyślnie zakupiono przedmiot §9" + nazwa + " §7[ID:" + kodsprzedazy + "]");
            PlayMusic.PlayMusicBuy(p);
        } else {
            p.sendMessage("§7Nie masz wystarczająco punktów, aby kupić ten skin.");
            PlayMusic.PlayMusicError(p);
        }
    }

    public static void ArmorShop(Player p, String nazwa, int pkt_ile, String nazwa_helmet, Material material_helmet, String nazwa_chestplate, Material material_chestplate, String nazwa_leggings, Material material_leggings, String nazwa_boots, Material material_boots, String nazwa_przedmiotu) throws IOException {
        UUID uuid = p.getUniqueId();
        if ((data.getData().getInt(uuid + ".pkt")) >= pkt_ile) {
            String kodsprzedazy = losowanie(8);
            Date now = new Date();
            SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss dd-MM-yyyy");
            listasprzedarzy = (ArrayList<String>) data.getData().getStringList(uuid + ".lista_sprzedaz");
            data.getData().set(uuid + ".pkt", data.getData().getInt(uuid + ".pkt") - pkt_ile);
            data.getData().set(uuid + ".sprzedaz." + kodsprzedazy + ".name", p.getName());
            data.getData().set(uuid + ".sprzedaz." + kodsprzedazy + ".data", format.format(now));
            data.getData().set(uuid + ".sprzedaz." + kodsprzedazy + ".item", nazwa_przedmiotu);
            data.getData().set(uuid + ".sprzedaz." + kodsprzedazy + ".koszt", pkt_ile);
            listasprzedarzy.add(kodsprzedazy);
            data.getData().set(uuid + ".lista_sprzedaz", listasprzedarzy);
            data.saveData();
            ItemStack helmet = new ItemStack(material_helmet);
            ItemMeta helmetmeta = helmet.getItemMeta();
            helmetmeta.setDisplayName("§e§l" + nazwa_helmet);
            helmetmeta.setLore(Arrays.asList("§7[ID:" + kodsprzedazy + "]"));
            helmet.setItemMeta(helmetmeta);
            ItemStack chestplate = new ItemStack(material_chestplate);
            ItemMeta chestplatemeta = chestplate.getItemMeta();
            chestplatemeta.setDisplayName("§e§l" + nazwa_chestplate);
            chestplatemeta.setLore(Arrays.asList("§7[ID:" + kodsprzedazy + "]"));
            chestplate.setItemMeta(chestplatemeta);
            ItemStack leggings = new ItemStack(material_leggings);
            ItemMeta leggingsmeta = leggings.getItemMeta();
            leggingsmeta.setDisplayName("§e§l" + nazwa_leggings);
            leggingsmeta.setLore(Arrays.asList("§7[ID:" + kodsprzedazy + "]"));
            leggings.setItemMeta(leggingsmeta);
            ItemStack boots = new ItemStack(material_boots);
            ItemMeta bootsmeta = boots.getItemMeta();
            bootsmeta.setDisplayName("§e§l" + nazwa_boots);
            bootsmeta.setLore(Arrays.asList("§7[ID:" + kodsprzedazy + "]"));
            boots.setItemMeta(bootsmeta);
            p.getInventory().addItem(helmet);
            p.getInventory().addItem(chestplate);
            p.getInventory().addItem(leggings);
            p.getInventory().addItem(boots);
            p.sendMessage("§fPomyślnie zakupiono przedmiot §9" + nazwa + " §7[ID:" + kodsprzedazy + "]");
            PlayMusic.PlayMusicBuy(p);
        } else {
            p.sendMessage("§7Nie masz wystarczająco punktów, aby kupić ten skin.");
            PlayMusic.PlayMusicError(p);
        }
    }

    public static String losowanie(int n)
    {
        char[] base = new char[n];

        for (int i = 0; i <n; i++)
        {
            base[i] = (char) (((int)(Math.random() * 26)) + (int)'a');
        }

        return (new String(base, 0, n));
    }
}
