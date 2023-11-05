package pl.bartixen.bxcit.Listeners;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import pl.bartixen.bxcit.Data.SkinsDataManager;
import pl.bartixen.bxcit.Main;

import java.io.IOException;

public class PlayerJoin implements Listener {

    Main plugin;
    SkinsDataManager data;

    public PlayerJoin(Main m) {
        plugin = m;
        data = SkinsDataManager.getInstance();
    }

    @EventHandler
    public void JoinTxt(PlayerJoinEvent e) throws IOException {
        Player p = e.getPlayer();
        String uuid = String.valueOf(p.getUniqueId());
        Bukkit.getServer().getScheduler().scheduleSyncDelayedTask(plugin, new Runnable() {
            public void run() {
                p.setResourcePack("https://www.dropbox.com/scl/fi/52v4n30aohn601je22f7i/TXT.zip?rlkey=7tr4d7ftxmvbv6gqkw6ht8byl&dl=1");
            }
        }, 5);
        data.getData().set(p.getDisplayName() + ".uuid", uuid);
        data.saveData();
    }
}
