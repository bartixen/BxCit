package pl.bartixen.bxcit.Listeners;

import org.bukkit.Sound;
import org.bukkit.entity.Player;

public class PlayMusic {

    public static void PlayMusicBuy(Player p) {
        p.playSound(p.getLocation(), Sound.UI_TOAST_CHALLENGE_COMPLETE, 10, 100);
    }

    public static void PlayMusicError(Player p) {
        p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_NO, 10, 100);
    }

    public static void PlayMusicYes(Player p) {
        p.playSound(p.getLocation(), Sound.ENTITY_VILLAGER_YES, 10, 100);
    }
}