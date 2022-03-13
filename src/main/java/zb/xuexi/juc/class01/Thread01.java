package zb.xuexi.juc.class01;

/**
 * wait虚假唤醒演练
 */

class Ticket1 {

    private int number = 0;

    //    +1
    public synchronized void incr() throws InterruptedException {
        if (number != 0) {
            this.wait();
        }
        number++;
        this.notifyAll();
        System.out.println(Thread.currentThread().getName() + ":还有" + number);
    }

    //    -1
    public synchronized void dcr() throws InterruptedException {
        if (number != 1) {
            this.wait();
        }
        number--;
        this.notifyAll();
        System.out.println(Thread.currentThread().getName() + ":还有" + number);

    }
}

public class Thread01 {
    public static void main(String[] args) {

        Ticket ticket = new Ticket();

        new Thread(() -> {

            try {
                for (int i = 0; i < 10; i++) {
                    ticket.incr();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "aa").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    ticket.dcr();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "bb").start();


        new Thread(() -> {

            try {
                for (int i = 0; i < 10; i++) {
                    ticket.incr();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "cc").start();

        new Thread(() -> {
            try {
                for (int i = 0; i < 10; i++) {
                    ticket.dcr();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "dd").start();


    }


}
