package com.thread;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Random;
import java.util.concurrent.*;
import java.util.function.Supplier;

public class ComputerFutureTest01 {
    private static ExecutorService POOL = Executors.newFixedThreadPool(4, new CustomizableThreadFactory("SbxxService-pool-"));

    public static void main(String[] args) {

        Future<?> submit = POOL.submit(new T01());
         submit = POOL.submit(new T02());

        try {
            submit.get();
            System.out.println("jieshu");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        POOL.shutdown();


    }

    private static void sleep(int i, TimeUnit seconds) {
        try {
            Thread.sleep(i * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
class T01 implements Runnable{

    @Override
    public void run() {
        System.out.println("=======t01========");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


class T02 implements Runnable{

    @Override
    public void run() {
        System.out.println("======t02=========");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}