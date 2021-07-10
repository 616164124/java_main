package com.thread.threadpool;

import org.springframework.scheduling.concurrent.CustomizableThreadFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class FutureTest {
    private static List<Future<String>> futurelist = new ArrayList<Future<String>>();
    private static ExecutorService POOL = Executors.newFixedThreadPool(4, new CustomizableThreadFactory("SbxxService-pool-"));

    public static void main(String[] args) {
       // UpFutureTask upFutureTask = new UpFutureTask();
        futurelist.add((Future<String>) POOL.submit(new T01()));
        futurelist.add((Future<String>) POOL.submit(new T02()));
        String s="";
        for(Future<String> future:futurelist){
            try {
                 s = future.get(15, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            } catch (TimeoutException e) {
                e.printStackTrace();
                return;
            }
        }
        System.out.println("结束\t"+s);
       // POOL.shutdown();

    }
}

class T01 implements Callable {


    @Override
    public Object call() throws Exception {
        try {
            Thread.sleep(10000);
            System.out.println("t01----");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "t01";
    }
}


class T02 implements Callable {

    @Override
    public Object call() throws Exception {
        try {
            Thread.sleep(10000);
            System.out.println("t02----");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "t01";
    }
}