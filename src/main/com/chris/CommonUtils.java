package com.chris;

/**
 * @Auther Chris Lee
 * @Date 10/18/2018 18:11
 * @Description
 */
public class CommonUtils {


    public static String getNewLineCharacter() {
        return System.getProperty("line.separator");
    }

    public static void main(String[] args) {
        String strTemp = "Chris" + getNewLineCharacter() + ",Hello World!";
        System.out.println(strTemp);
    }
}
