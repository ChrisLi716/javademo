package com.chris.io;

import org.apache.commons.lang3.StringUtils;

import java.io.File;


/**
 * @Auther Chris Lee
 * @Date 10/17/2018 14:37
 * @Description
 */
public class FileReader {

    public static void main(String[] args) {
        FileReader fileReader = FileReader.getInstance();
        String filePath = "D:/Chris_DemoProjects/psi-service.log";
        if (StringUtils.isNotEmpty(filePath)) {
            boolean isFileExists = fileReader.isFileExisted(new File(filePath));
            System.out.println(isFileExists);
        }

    }

    /**
     * if the file exists or not
     *
     * @param file file
     * @return true or false
     */
    private boolean isFileExisted(File file) {
        boolean isFileExisted = false;
        if (null != file) {
            if (!file.isDirectory() && file.exists()) {
                isFileExisted = true;
            }
        }
        return isFileExisted;
    }


    private static FileReader getInstance() {
        return new FileReader();

    }
}
