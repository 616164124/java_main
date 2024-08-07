package com.Interview;

/**
 * @author mikael
 */
public class NoVisibility {
    private static volatile boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                ;
            System.out.println(number);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new ReaderThread().start();
        Thread.sleep(10000);
        number = 42;
        ready = true;
        Thread.sleep(10000);
    }
}
