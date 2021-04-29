package pl.bartixen.bxcit.Listeners;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class PlayMusic {

    public static void PlayMusicKupno(Player p) {
        p.playSound(p.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 10, 100);
    }

    public static void PlayMusicBlad(Player p) {
        p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 10, 100);
    }

    public static void PlayMusicyes(Player p) {
        p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10, 100);
    }
}