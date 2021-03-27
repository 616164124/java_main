package com.Interview;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制整个文件夹
 */

/**
 * @Description:
 * @Author: mikael
 */
public class CopyEntireFolder {
    private static String separator = File.separator;

    // 复制文件夹
    public static void copyDir(String sourcePath, String newPath) throws IOException {
        /**
         * @Description: 将sourcePath中的内容全部放入newPath中
         * @Param: [sourcePath, newPath]
         *
         * @return: void
         * @Author: mikael
         * @Date: 2020/10/10
         */
        File file = new File(sourcePath);
        String[] filePath = file.list();

        if (!(new File(newPath)).exists()) {
            (new File(newPath)).mkdir();
        }

        for (int i = 0; i < filePath.length; i++) {
            if ((new File(sourcePath + separator + filePath[i])).isDirectory()) {
                copyDir(sourcePath + separator + filePath[i], newPath + separator + filePath[i]);
            }
            if (new File(sourcePath + separator + filePath[i]).isFile()) {
                copyFile(sourcePath + separator + filePath[i], newPath + separator + filePath[i]);
            }
        }
    }

    // 复制文件
    public static void copyFile(String oldPath, String newPath) {
        File oldFile = new File(oldPath);
        File file = new File(newPath);
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(oldFile);
            out = new FileOutputStream(file);
            byte[] buffer = new byte[2097152];
            int readByte = 0;
            while ((readByte = in.read(buffer)) != -1) {
                out.write(buffer, 0, readByte);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                in.close();
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        // 复制文件夹
        String sourcePath = "C:\\test\\n";
        // 目标文件夹
        String path = "C:\\test\\source";

        copyDir(sourcePath, path);
        System.out.println("完成！！！！");
    }
}
