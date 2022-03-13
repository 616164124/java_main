package zb.pattern.proxy.test;

/**
 * 被代理的类（明星类）
 */
public class MxObject implements AbstractObject {

    public MxObject() {
        System.out.println("MxObject.....");
    }

    @Override
    public void method1() {
        System.out.println("mxObject..method1....");
    }

    @Override
    public void method2() {
        System.out.println("mxObject..method2....");
    }

    @Override
    public void method3() {
        System.out.println("mxObject..method3....");
    }
}
