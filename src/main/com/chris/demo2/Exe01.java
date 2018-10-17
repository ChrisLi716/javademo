package com.chris.demo2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Auther Chris Lee
 * @Date 10/17/2018 14:56
 * @Description
 */
public class Exe01 {
    public static void main(String[] args) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss_SSS");
        System.out.println(df.format(new Date()));
    }
}
