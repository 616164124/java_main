package JUC.com.thread.threadpool;


import java.util.concurrent.*;

/**
 * @description: 使用Callable和Future一起来 创建线程
 * @author: mikael
 * @data: 2020/11/10
 */
public class ThreadBaseTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // Callable 来创建线程
        Callable callable =
                new Callable() {
                    @Override
                    public Object call() throws Exception {
                        //
                        System.out.println("你好！！！！");
                        return "1";
                    }
                };
        //FutureTask 也是实现了Runnable
        FutureTask futureTask = new FutureTask<>(callable);
        new Thread(futureTask, "a").start();
        //执行完有返回值
        Object o = futureTask.get();
        System.out.println(o);
        // Runnable接口 创建线程
        Runnable runnable =
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("使用Runnable 创建线程");
                    }
                };
        new Thread(runnable, "b").start();

        //采用TimeUnit.SECONDS.sleep(12)形式来设置睡眠时间
        TimeUnit.SECONDS.sleep(12);

    }

}
