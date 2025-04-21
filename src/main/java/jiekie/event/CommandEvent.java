package jiekie.event;

import jiekie.NoWhisperPlugin;
import jiekie.util.ChatUtil;
import jiekie.util.SoundUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;

public class CommandEvent implements Listener {
    private NoWhisperPlugin plugin;

    public CommandEvent(NoWhisperPlugin plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onCommand(PlayerCommandPreprocessEvent e) {
        String message = e.getMessage().toLowerCase();
        Player player = e.getPlayer();

        if(message.startsWith("/w ") || message.startsWith("/tell ") || message.startsWith("/msg ")) {
            if(player.isOp()) return;

            e.setCancelled(true);
            ChatUtil.noWhisper(player);
            SoundUtil.playNoteBlockBell(player);
        }
    }
}
