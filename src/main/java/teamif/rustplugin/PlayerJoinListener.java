package teamif.rustplugin;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

import java.lang.reflect.InvocationTargetException;

public class PlayerJoinListener implements Listener {
    private static void addChannel(Player p) {
        try {
            p.getClass().getMethod("addChannel", String.class).invoke(p, "MC|Brand");
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException
                | SecurityException e) {
            e.printStackTrace();
        }
    }
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        addChannel(event.getPlayer());
    }
}
