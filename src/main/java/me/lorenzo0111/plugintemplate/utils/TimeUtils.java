package me.lorenzo0111.plugintemplate.utils;

import java.util.concurrent.TimeUnit;

public final class TimeUtils {

    public static long parseTime(String time) {
        long result = 0;
        long current = 0;
        for (char c : time.toCharArray()) {
            if (Character.isDigit(c)) {
                current = current * 10 + Character.getNumericValue(c);
            } else {
                switch (c) {
                    case 'd':
                        result += TimeUnit.DAYS.toMillis(current);
                        break;
                    case 'h':
                        result += TimeUnit.HOURS.toMillis(current);
                        break;
                    case 'm':
                        result += TimeUnit.MINUTES.toMillis(current);
                        break;
                    case 's':
                        result += TimeUnit.SECONDS.toMillis(current);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid time format: " + time);
                }
                current = 0;
            }
        }
        return result;
    }

}
