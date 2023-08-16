package zb.设计模式;

import java.util.HashMap;
import java.util.Map;

public class Test01 extends Test {
    @Override
    void Testvoid01() {
        System.out.println("Test01===Testvoid01");
    }


    public static void main(String[] args) {
        Test01 test01 = new Test01();
        test01.Testvoid01();
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("lk", "123");
        String orDefault = hashMap.getOrDefault("ui", "sf");
        String orDefault1 = hashMap.getOrDefault("lk", "2f");
        System.out.println(orDefault);
        System.out.println(orDefault1);

    }





}





abstract class Test{
    abstract void Testvoid01();

}
 interface Interface01{
    int a = 1234;
    String ss();
}

class Interface01class implements  Interface01{

    @Override
    public String ss() {
        return null;
    }
}
