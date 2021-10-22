package zb.pattern.singleton;

public class Test {
    public static void main(String[] args) {
        SingletonDemo instance = SingletonDemo.getInstance();
        SingletonDemo instance2 = SingletonDemo.getInstance();
        if (instance == instance2) {
            System.out.println("123");
        }
        SingletonDemo instance3 = SingletonDemo.getInstance();
        System.out.println(instance3.getNextA());
        /*分割线*/
        EnumSingleton enumSingleton = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;
        if (enumSingleton == enumSingleton2) {
            System.out.println("相同");
        }
        enumSingleton.test();

    }
}
