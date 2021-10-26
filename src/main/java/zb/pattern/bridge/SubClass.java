package zb.pattern.bridge;

public class SubClass extends SuperClass {
    private SuperClass superClass;

    public void method1() {
        System.out.println("subclass.... method1");
        superClass.method1();
    }
}
