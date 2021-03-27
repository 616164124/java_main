package com.Interview;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * 延迟队列
 *
 * @author: mikael
 */
public class DelayQueueTest {

    public static void main(String[] args) throws Exception {

        BlockingQueue<Task> delayqueue = new DelayQueue<>();
        long now = System.currentTimeMillis();
        delayqueue.put(new Task("task1", now + 30000));
        delayqueue.put(new Task("task2", now + 40000));
        delayqueue.put(new Task("task3", now + 6000));
        delayqueue.put(new Task("task4", now + 1000));
//       System.out.println(delayqueue);

        for (int i = 0; i < 4; i++) {
            //会停顿，take()等待时间到
            System.out.println(delayqueue.take());
        }

    }

    /**
     * @author: mikael
     */
    static class Task implements Delayed {
        long time = System.currentTimeMillis();
        String name;

        public Task(String name, long time) {
            this.time = time;
            this.name = name;
        }

        @Override
        public int compareTo(Delayed o) {
            if (this.getDelay(TimeUnit.MILLISECONDS) < o.getDelay(TimeUnit.MILLISECONDS)) {
                return -1;
            } else if (this.getDelay(TimeUnit.MILLISECONDS) > o.getDelay(TimeUnit.MILLISECONDS)) {
                return 1;
            } else {
                return 0;
            }
        }

        /**
         * getDelay也就是剩余时间为0的时候，该元素才有资格被消费者从队列中取出来，所以构造函数一般都有一个时间传入。
         *
         * @param unit
         * @return
         */
        @Override
        public long getDelay(TimeUnit unit) {
            System.out.println("123");
            return unit.convert(time - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
        }

        @Override
        public String toString() {
            System.out.println("11111");
            return "" + time + "\t" + name;
        }
    }


    class Task1 implements Delayed {

        @Override
        public long getDelay(TimeUnit unit) {
            return 0;
        }

        @Override
        public int compareTo(Delayed o) {
            return 0;
        }
    }

}