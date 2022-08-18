package zb.day001;


import java.util.concurrent.*;

public class Test01 {
    public static void main(String[] args) throws Exception {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(12, 12, 1, TimeUnit.MINUTES,new LinkedBlockingQueue<>(12), new ThreadFactory() {
            @Override
            public Thread newThread(Runnable r) {
                Thread thread = new Thread(r);
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
                thread.setUncaughtExceptionHandler(uncaughtExceptionHandler);
                return thread;
            }
        });

        Future<?> submit = threadPoolExecutor.submit(new Thread01());
        System.out.println(submit.get().toString());
//        threadPoolExecutor.execute(new Thread02());

//        Future<?> submit = threadPoolExecutor.submit(new Thread02());
//        Object o = submit.get();
//        System.out.println(o.toString());
    }
}

class Thread01 implements Callable {

    @Override
    public Object call()  {
        try {

            int i = 1/0;
        }catch (Exception e){
            return new Exception(e.getMessage());
        }finally {
            return "hfks";
        }
    }
}

class Thread02 implements Runnable{

    @Override
    public void run() {
        try {
            int i =1/0;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
