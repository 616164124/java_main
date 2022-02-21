package zb.pattern.test.demo3;

public class son01 extends father01 {

    public void saySon() {
        super.age = 12;
        super.writer();
        System.out.println("son01....saySon...");
    }

    public void sayNo(String str) {
        System.out.println("son01....str....");
    }

}
