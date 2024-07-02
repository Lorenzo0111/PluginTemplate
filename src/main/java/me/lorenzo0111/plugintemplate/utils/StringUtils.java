package me.lorenzo0111.plugintemplate.utils;

import org.bukkit.ChatColor;

import java.util.List;
import java.util.stream.Collectors;

public final class StringUtils {

    public static String color(String message) {
        return ChatColor.translateAlternateColorCodes('&', message);
    }

    public static List<String> color(List<String> messages) {
        return messages.stream()
                .map(StringUtils::color)
                .collect(Collectors.toList());
    }

}
