package jiekie.util;

import org.bukkit.entity.Player;

public class ChatUtil {
    public static String getWarnPrefix() {
        return "\uA003 ";
    }

    public static void noWhisper(Player player) {
        player.sendMessage(getWarnPrefix() + "귓속말을 할 수 없습니다.");
    }
}
