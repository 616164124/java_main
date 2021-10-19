package zb.pattern.proxy.test;

public class ProxyObject implements AbstractObject {
    AbstractObject abstractObject;

    @Override
    public synchronized void  method1() {
        if (abstractObject == null) {
                return;
        }
        abstractObject.method1();
        System.out.println("ProxyObject.....method1..");
    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
