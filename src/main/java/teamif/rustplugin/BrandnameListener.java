package teamif.rustplugin;

import org.bukkit.entity.Player;
import org.bukkit.plugin.messaging.PluginMessageListener;

import java.nio.charset.StandardCharsets;

class BrandnameListener implements PluginMessageListener {
    @Override
    public void onPluginMessageReceived(String channel, Player player, byte[] message) {
        String brandname = new String(message, StandardCharsets.UTF_8).substring(1);
        if (!brandname.equals("vanilla")) {
            player.kickPlayer("순정 클라이언트로만 접속하실 수 있습니다!>");
        }
        player.sendMessage("Your client brand: " + brandname);
    }
}