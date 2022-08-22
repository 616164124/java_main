package zb.thread;

import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;

/**
 * park
 *
 *
 * 与 Object 的 wait & notify 相比
 * wait，notify 和 notifyAll 必须配合 Object Monitor 一起使用，而 unpark 不必
 * park & unpark 是以线程为单位来【阻塞】和【唤醒】线程，而 notify 只能随机唤醒一个等待线程，notifyAll 是唤醒所以等待线程，就不那么【精确】
 * park & unpark 可以先 unpark ,而 wait & notify 不能先 notify
 *
 *  参考地址 https://blog.csdn.net/lzh754413563/article/details/112255474
 *
 * 注意LockSupport是不可重入的，如果一个线程连续两次调用LockSupport.park()(中间没有unpark的情况)那么该线程会一直阻塞下去。哪怕你2次unpark也没法让线程继续执行下去

 *
 *
 */
public class ParkTest01 {
    public static void main(String[] args) {

        Thread thread = new Thread(()->{
            LockSupport.park();
            System.out.println("123312");
        });
        Thread thread2 = new Thread(()->{
            LockSupport.park();
//            LockSupport.unpark(Thread.currentThread()); //2次park中间夹杂着一个unpark就可以执行完成
            System.out.println("hfkjs2");
            LockSupport.park();
            System.out.println("hfkjsmbn2");


        });

//        LockSupport.parkUntil(1_000l);
        thread.start();
        thread2.start();
        LockSupport.unpark(thread2);//可以精准唤醒某个被park的线程，
        LockSupport.unpark(thread2);

        System.exit(100);

    }
}
