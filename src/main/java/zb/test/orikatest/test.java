package zb.test.orikatest;

import org.junit.Test;

public class test {
    public static void main(String[] args) {
        System.out.println("e111");
        System.out.println(Integer.MAX_VALUE / 4);
        String s = "hfksjhf00qq";
        try {
            System.out.println(s.split("11")[1]);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("你好");
    }

    @Test
    public void test02(){
        System.out.println("12313");
    }


}
