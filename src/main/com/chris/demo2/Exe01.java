package com.chris.demo2;

import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther Chris Lee
 * @Date 10/17/2018 14:56
 * @Description
 */
public class Exe01 {
    private final static String PATTERN_ONE = "yyyy-MM-dd HH:mm:ss_SSS";

    public static void main(String[] args) {
        DateFormat df = getDateFormat(PATTERN_ONE);
        System.out.println(df.format(new Date()));
    }

    private static DateFormat getDateFormat(String datePattern) {
        DateFormat df;
        if (StringUtils.isNotEmpty(datePattern)) {
            df = new SimpleDateFormat(datePattern);
        } else {
            df = new SimpleDateFormat();
        }
        return df;
    }


}
