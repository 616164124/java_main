package zb.thread;

import java.util.concurrent.Callable;

public class Thread01 implements Callable {
    public static void main(String[] args) {
        Thread01 thread01 = new Thread01();
        try {
            thread01.call();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Object call() throws Exception {
        System.out.println("1111111111");
        return null;
    }
}
