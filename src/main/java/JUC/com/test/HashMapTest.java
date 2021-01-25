package JUC.com.test;


import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @version: V1.0
 * @author: mikael
 * @description:
 * @data: 2020-11-08
 **/
public class HashMapTest {

    public static <T> void main(String[] args) {

        HashMap<Object, Object> hashMap = new HashMap<>(200);

        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(12);
        Integer integer = new Integer(12);
        String s = new String("123");

        for (int i = 0; i < 100000; i++) {
            hashMap.put(new Test01(), new Object());
        }


        hashMap.put(1, "fs");
        hashMap.put(null, "hacks");
        System.out.println(hashMap.size());
        System.out.println(hashMap.get(null));

    }
}

class Test01 extends Object {

    @Override
    public int hashCode() {
        return 1;
    }
}
