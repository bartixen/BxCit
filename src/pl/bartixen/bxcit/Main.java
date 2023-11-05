package pl.bartixen.bxcit;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pl.bartixen.bxcit.Commands.BxCit;
import pl.bartixen.bxcit.Commands.Skins;
import pl.bartixen.bxcit.Commands.SkinsPlayerCommand;
import pl.bartixen.bxcit.Commands.Txt;
import pl.bartixen.bxcit.Data.SkinsDataManager;
import pl.bartixen.bxcit.Listeners.*;
import pl.bartixen.bxcit.Shop.ItemsShop;

import java.io.IOException;
import java.util.logging.Level;

public class Main extends JavaPlugin {

    public static Main main;

    public String version = getDescription().getVersion();

    SkinsDataManager data;

    public Main() {
        data = SkinsDataManager.getInstance();
    }

    @Override
    public void onEnable() {
        if ((!getDescription().getName().contains("BxCit")) || (!getDescription().getAuthors().contains("Bartixen"))) {
            getLogger().log(Level.WARNING, "[========== BxCit ==========]");
            getLogger().log(Level.WARNING, "The plugin has been disabled due to file editing plugin.yml");
            getLogger().log(Level.WARNING, "[========== BxCit ==========]");
            Bukkit.getServer().getPluginManager().disablePlugin(this);
        } else {
            getLogger().log(Level.INFO, "[========== BxCit ==========]");
            getLogger().log(Level.INFO, "Version: {0}", getDescription().getVersion());
            getLogger().log(Level.INFO, "Author: Bartixen");
            getLogger().log(Level.INFO, "Website: https://bartixen.pl");
            getLogger().log(Level.INFO, "[========== BxCit ==========]");

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
            new SkinsPlayerCommand(this);
            new ItemsShop(this);
            new Skins(this);

            getServer().getPluginManager().registerEvents(new PlayerJoin(this), this);
            getServer().getPluginManager().registerEvents(new MenuListener(this), this);
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
