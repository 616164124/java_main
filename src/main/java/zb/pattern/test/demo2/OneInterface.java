package zb.pattern.test.demo2;

public  interface OneInterface  extends TwoInterface {
    void OneInterface1();

    default void abstractFace() {
        System.out.println(11111);
    }
}
