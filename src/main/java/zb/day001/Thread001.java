package zb.day001;

import java.util.concurrent.atomic.AtomicInteger;

public class Thread001 {

    static volatile AtomicInteger a = new AtomicInteger(0);
    static int b = 0;

    public static void main(String[] args) throws Exception {
        for (int j = 0; j < 100; j++) {
            for (int i = 0; i < 1000; i++) {
                new Thread(() -> {
                    a.incrementAndGet();
                    b++;
                }).start();
            }
            Thread.sleep(100);
            System.out.println(a + ",\t" + b);

        }

    }

}
