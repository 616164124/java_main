package zb.other.base;

import java.util.HashMap;

public class Test {

    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>(3);
        hashMap.put("hua", 12);
        hashMap.put("li", 23);
        hashMap.put("mu", 4);
        hashMap.put("zhang", 332);
        hashMap.put("liu", 98);
        hashMap.put("liu", 111);

        hashMap.forEach((key, value) -> {
            System.out.println("key==>" + key + "\t\tvalue==>" + value);
        });


    }
}
