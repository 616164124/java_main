package zb.xuexi.juc.class01;

/**
 * 守护线程
 */
public class DaemThread {
    public static void main(String[] args) {
        Thread aa = new Thread(() -> {
            System.out.println(Thread.currentThread().getName());
            while (true) {
            }
        }, "aa");
        aa.setDaemon(true);//设置为守护线程
        aa.start();
    }
}
