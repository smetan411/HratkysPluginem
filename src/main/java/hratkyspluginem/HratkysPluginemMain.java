package hratkyspluginem;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

public final class HratkysPluginemMain extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin

        this.saveDefaultConfig();
      this.getConfig().set("cislo", 10);
//        this.getConfig().set("LobbyLocationStartCorner",new Location(Bukkit.getServer().getWorld("world"), 0,0,0));
        this.saveConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
