package zb.pattern.bridge;

public class SuperClass implements SuperInterface {
    private int a;
    private String b;

    public void method1(){
        System.out.println("SuperClass...........method1");
    }

    @Override
    public void methodFace1() {
        System.out.println("SuperClass.......methodFace1");
    }
}
