package zb.pattern.proxy;

public class Test {
    public static void main(String[] args) {
        AbstractObject proxyObject = new ProxyObject();
        proxyObject.method1();
    }
}
