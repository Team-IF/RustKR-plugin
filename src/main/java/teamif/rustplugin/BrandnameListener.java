package teamif.rustplugin;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

class BrandnameListener implements PluginMessageListener {
    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        player.sendMessage("\"Your client brand: \" + new String(msg, \"UTF-8\").substring(1)");
    }
}