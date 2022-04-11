package zb.xuexi.juc.class02;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * FutureTask
 */
public class Demo01 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        FutureTask<String> stringFutureTask01 = new FutureTask<String>(()->{
            System.out.println(Thread.currentThread().getName()+ "进入stringFutureTask01。。。。。");
            return "1";
        });
        FutureTask<String> stringFutureTask02 = new FutureTask<String>(()->{
            System.out.println(Thread.currentThread().getName()+ "进入stringFutureTask02。。。。。");
            return "2";
        });

        new Thread(stringFutureTask01,"李四").start();
        new Thread(stringFutureTask02,"张三").start();

//        while (!stringFutureTask01.isDone()){
//            System.out.println("wait......");
//        }
        System.out.println(stringFutureTask01.get());
        System.out.println(stringFutureTask02.get());
        System.out.println("结束");
    }
}
