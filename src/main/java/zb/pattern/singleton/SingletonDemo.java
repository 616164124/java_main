package zb.pattern.singleton;


public class SingletonDemo {
    private int a = 1000;

    public SingletonDemo() {
    }

    private static final SingletonDemo singletonDemo = new SingletonDemo();

    public static SingletonDemo getInstance() {
        return singletonDemo;
    }

    public synchronized int getNextA() {
        return --a;

    }

}
