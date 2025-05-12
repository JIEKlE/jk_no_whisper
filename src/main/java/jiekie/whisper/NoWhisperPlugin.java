package jiekie.whisper;

import jiekie.whisper.event.CommandEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class NoWhisperPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(new CommandEvent(this), this);

        getLogger().info("귓속말 금지 플러그인 by Jiekie");
        getLogger().info("Copyright © 2025 Jiekie. All rights reserved.");
    }

    @Override
    public void onDisable() {}
}
