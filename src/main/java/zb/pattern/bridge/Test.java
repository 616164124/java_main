package zb.pattern.bridge;

public class Test {
    public static void main(String[] args) {
        String s = Integer.toString(12, 2);
        System.out.println(s);
        SubClass subClass = new SubClass();
        subClass.method1();
    }
}
