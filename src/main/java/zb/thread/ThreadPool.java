package zb.thread;

import org.aspectj.weaver.ast.Var;

import java.util.concurrent.*;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPool {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("uuuuuuuu");
        ReentrantLock lock = new ReentrantLock(false);
        Condition condition = lock.newCondition();
        lock.lock();
         condition.await();
    }

}
