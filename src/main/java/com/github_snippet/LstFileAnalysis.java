package com.github_snippet;

import java.io.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 简单的线程池实现多线程对大文件的读取
 *
 * @author kyojurorengoku
 * @date 2022/1/20
 * @Description
 */
public class LstFileAnalysis {
    static String fileUrl = "2.txt";
    static File file = new File(fileUrl);
    static InputStreamReader isr;

    static {
        try {
            isr = new InputStreamReader(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws IOException {
        ExecutorService executorService = Executors.newFixedThreadPool(4);
        BufferedReader read = new BufferedReader(isr);
        String line = "";
        long l = System.currentTimeMillis();
        while ((line = read.readLine()) != null) {
            String[] split = line.split("\\s+");
            if (split.length == 0) {
                break;
            }
            Runnable task = new Task(line);
            executorService.execute(task);
        }
        long l1 = System.currentTimeMillis();
        System.out.println((l1 - l));
    }

}

class Task implements Runnable {

    private String line;

    public Task(String line) {
        this.line = line;
    }

    @Override
    public void run() {
            System.err.println(Thread.currentThread().getName() + "  " + line);
    }
}
