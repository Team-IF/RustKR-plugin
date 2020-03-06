package teamif.rustplugin;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.Messenger;

public final class Rustplugin extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Messenger messenger = Bukkit.getMessenger();
        messenger.registerIncomingPluginChannel(this, "MC|Brand", new BrandnameListener());

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
