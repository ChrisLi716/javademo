package com.chris.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.Writer;

/**
 * @Auther Chris Lee
 * @Date 10/18/2018 17:50
 * @Description
 */
public class FileWriterUtils {
	
	public static void writeFile(FileBean bean)
		throws Exception {
		String fileFullName = bean.getFilePath() + File.separator + bean.getFileName() + "." + bean.getExtension();
		File file = new File(fileFullName);
		Writer writer = new FileWriter(file);
		BufferedWriter bufferedWriter = new BufferedWriter(writer);
		bufferedWriter.write(new String(bean.getContent(), "UTF-8"));
		bufferedWriter.flush();
		bufferedWriter.close();
		writer.close();
	}
	
}
