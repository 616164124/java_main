package JUC.com.test.abstracts;

/**
 * @description: 抽象类被继承，其内部抽象方法的使用具体看子类 （类似父子容器）
 * @author: mikael
 * @data: 2020/11/19
 */
public class AbstractTest extends A {

    public static void main(String[] args) {
        A a = new A() {
            @Override
            public boolean isError(String a) {
                return a == "te" ? true : false;
            }
        };
        a.test();
    }

    @Override
    public boolean isError(String a) {
        return a == "t" ? true : false;
    }

}

/**
 * 测试抽象类中的抽象方法的使用
 */
abstract class A {
    private String test_src = "test";

    public void test() {
        if (this.isError(test_src)) {
            System.out.println("isError!!!!");
        }
    }

    public abstract boolean isError(String a);

}

