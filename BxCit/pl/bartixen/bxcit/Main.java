package pl.bartixen.bxcit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.bartixen.bxcit.Commands.BxCit;
import pl.bartixen.bxcit.Commands.Skiny;
import pl.bartixen.bxcit.Commands.SkinyGraczCommand;
import pl.bartixen.bxcit.Commands.Txt;
import pl.bartixen.bxcit.Data.SkinyDataManager;
import pl.bartixen.bxcit.Listeners.*;
import pl.bartixen.bxcit.Shop.ItemsShop;

import java.io.IOException;
import java.util.logging.Level;

public class Main extends JavaPlugin {

    public static Main main;

    public String version = getDescription().getVersion();

    SkinyDataManager data;

    public Main() {
        data = SkinyDataManager.getInstance();
    }

    @Override
    public void onEnable() {
        if ((!getDescription().getName().contains("BxCit")) || (!getDescription().getAuthors().contains("Bartixen"))) {
            getLogger().log(Level.WARNING, "§8[========== §9BxCit §8==========]");
            getLogger().log(Level.WARNING, "§cPlugin zostal wylaczony z powodu edytowania pliku §eplugin.yml");
            getLogger().log(Level.WARNING, "§8[========== §9BxCit §8==========]");
            Bukkit.getServer().getPluginManager().disablePlugin(this);
        } else {
            getLogger().log(Level.INFO, "§8[========== §9BxCit §8==========]");
            getLogger().log(Level.INFO, "§fVersion: §b{0}", getDescription().getVersion());
            getLogger().log(Level.INFO, "§fAuthor: §bBartixen");
            getLogger().log(Level.INFO, "§fWebsite: §bhttps://bartixen.pl");
            getLogger().log(Level.INFO, "§8[========== §9BxCit §8==========]");

            getConfig().options().copyDefaults(true);
            saveConfig();

            main = this;

            try {
                data.setup(this);
            } catch (IOException e) {
                e.printStackTrace();
            }

            new BxCit(this);
            new Txt(this);
            new SkinyGraczCommand(this);
            new ItemsShop(this);
            new Skiny(this);

            getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
            getServer().getPluginManager().registerEvents(new MenuListener(this), this);
            getServer().getPluginManager().registerEvents(new ShieldListener(this), this);
            getServer().getPluginManager().registerEvents(new ArmListener(this), this);
            getServer().getPluginManager().registerEvents(new BowListener(this), this);
            getServer().getPluginManager().registerEvents(new ElytraListener(this), this);
            getServer().getPluginManager().registerEvents(new AnvilListener(this), this);
            getServer().getPluginManager().registerEvents(new SwordListener(this), this);
            getServer().getPluginManager().registerEvents(new AxeListener(this), this);
            getServer().getPluginManager().registerEvents(new ArmorPages(this), this);
            getServer().getPluginManager().registerEvents(new ArmorListener(this), this);
            getServer().getPluginManager().registerEvents(new ArmorsShop(this), this);
        }
    }
}
