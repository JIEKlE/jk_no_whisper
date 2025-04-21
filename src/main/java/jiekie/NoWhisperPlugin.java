package jiekie;

import jiekie.event.CommandEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoWhisperPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CommandEvent(this), this);
    }

    @Override
    public void onDisable() {}
}
