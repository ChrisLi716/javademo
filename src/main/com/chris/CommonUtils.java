package com.chris;

import org.apache.log4j.Logger;

/**
 * @Auther Chris Lee
 * @Date 10/18/2018 18:11
 * @Description
 */
public class CommonUtils {
    private static final Logger LOGGER = Logger.getLogger(CommonUtils.class);


    public static String getNewLineCharacter() {
        return System.getProperty("line.separator");
    }

    public static void main(String[] args) {
        LOGGER.info(getNewLineCharacter());
    }
}
