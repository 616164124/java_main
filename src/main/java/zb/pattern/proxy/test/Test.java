package zb.pattern.proxy.test;

public class Test {
    public static void main(String[] args) {
        ProxyObject proxyObject = new ProxyObject();
        /**
         * 调用method1的时候，将调用MxObject中的方法，即生成了MxObject类
         */
        proxyObject.method1();
        /**
         * 没有用到MxObject的方法，没有生成MxObject类
         */
        proxyObject.method2();
    }
}
