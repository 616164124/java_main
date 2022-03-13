package zb.pattern.adapter;

public class PrintBanner extends Banner implements Adapter {

    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void Adapter1() {
        method1();
    }

    @Override
    public void Adapter2() {
        method2();
    }

    //重写了父类中的方法
    public void method2() {
        System.out.println("PrintBanner....method2()..");
    }

    public void method2(String s) {
        System.out.println("PrintBanner....method2(String s)..有参数");
    }
}
