package pl.bartixen.bxcit.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.bartixen.bxcit.Data.SkinyDataManager;
import pl.bartixen.bxcit.Main;

import java.io.IOException;
import java.util.UUID;

public class PlayerJoin implements Listener {

    Main plugin;
    SkinyDataManager data;

    public PlayerJoin(Main m) {
        plugin = m;
        data = SkinyDataManager.getInstance();
    }

    @EventHandler
    public void JoinTxt(PlayerJoinEvent e) throws IOException {
        Player p = e.getPlayer();
        String uuid = String.valueOf(p.getUniqueId());
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            public void run() {
                p.setResourcePack("https://www.dropbox.com/s/ayj97v063x26sb5/ROLL%20-%20Skiny.zip?dl=1");
            }
        }, 20);
        data.getData().set(p.getDisplayName() + ".uuid", uuid);
        data.saveData();
    }
}
