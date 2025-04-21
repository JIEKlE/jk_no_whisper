package jiekie.util;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.entity.Player;

public class ChatUtil {
    public static String getWarnPrefix() {
        return "[ " + ChatColor.YELLOW + "❗" + ChatColor.WHITE + " ] ";
    }

    public static void noWhisper(Player player) {
        player.sendMessage(getWarnPrefix() + "귓속말을 할 수 없습니다.");
    }
}
