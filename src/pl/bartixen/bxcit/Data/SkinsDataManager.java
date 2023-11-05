package pl.bartixen.bxcit.Data;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.Plugin;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;

public class SkinsDataManager {

    static SkinsDataManager instance;
    Plugin p;
    FileConfiguration data;
    public static File banfile;

    static {
        instance = new SkinsDataManager();
    }

    public static SkinsDataManager getInstance() {
        return instance;
    }

    public void setup(Plugin p) throws IOException {
        if (!p.getDataFolder().exists()) {
            p.getDataFolder().mkdirs();
        }
        File path = new File(p.getDataFolder() + File.separator);
        banfile = new File(path, String.valueOf(File.separator + "data.yml"));
        if (!banfile.exists()) {
            try {
                path.mkdirs();
                banfile.createNewFile();
            } catch (IOException e) {
                Bukkit.getServer().getLogger().log(Level.WARNING, "Failed to create file data.yml");
            }
        }
        data = YamlConfiguration.loadConfiguration(banfile);
    }

    public FileConfiguration getData() {
        return data;
    }

    public void saveData() throws IOException {
        try {
            data.save(banfile);
        } catch (IIOException e) {
            Bukkit.getServer().getLogger().log(Level.WARNING, "Failed to create file data.yml");
        }
    }

    public void reloadData() {
        data = YamlConfiguration.loadConfiguration(banfile);
    }
}
