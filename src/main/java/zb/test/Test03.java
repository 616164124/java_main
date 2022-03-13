package zb.test;

public class Test03 {
    public static void main(String[] args) {
        try {
            int i = 1 / 0;
        } catch (Exception e) {
            System.out.println("12");
        }
        System.out.println("end");
    }
}
