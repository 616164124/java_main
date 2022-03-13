package zb.pattern.proxy;

public class ProxyObject implements AbstractObject {
    AbstractObject object = new TargetObject();

    @Override
    public void method1() {
        object.method1();
    }

    @Override
    public void method2() {

    }

    @Override
    public void method3() {

    }
}
