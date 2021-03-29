package uk.tw.energy.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * @ClassName: TimeUtil
 * @Description:
 * @Author: jackson
 * @Date: 2021/3/29 下午12:53
 * @Version: v1.0
 */
public class TimeUtil {

    public static LocalDateTime instantToLocalDateTime(Instant instant) {
        ZoneId zone = ZoneId.systemDefault();
        return LocalDateTime.ofInstant(instant,zone);
    }

}
