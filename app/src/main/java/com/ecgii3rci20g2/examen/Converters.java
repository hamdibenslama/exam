package com.ecgii3rci20g2.examen;

import java.util.Date;

public class Converters {
    //TODO import TypeConverter from Room
    @TypeConverter
    public static Date fromTimestamp(Long value) {
        return value == null ? null : new Date(value);
    }

    @TypeConverter
    public static Long dateToTimestamp(Date date) {
        return date == null ? null : date.getTime();
    }
}
