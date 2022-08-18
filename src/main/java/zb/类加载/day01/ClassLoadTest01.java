package zb.类加载.day01;

public class ClassLoadTest01 {
    public static void main(String[] args) {
        ClassLoader cl1 = ClassLoadTest01.class.getClassLoader();
        System.out.println(cl1);
        System.out.println(cl1.getParent());
    }
}
