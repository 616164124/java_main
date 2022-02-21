package zb.pattern.test.demo3;

public class father01 implements life {
    public int age = 77;

    public void sayHello() {
        System.out.println("father01...sayHello....");
    }

    @Override
    public void run() {
        System.out.println("father01...run..");

    }

    @Override
    public void writer() {
        System.out.println("father01...writer..");

    }
}
