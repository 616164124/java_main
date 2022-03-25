package zb.other;

import java.util.HashMap;

public class Test01 {
    public static void main(String[] args) {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("aaa","8987");
        if (hashMap.containsKey("aaa")) {
            System.out.println("111111");
        }else {
            System.out.println("000000");
        }

    }
}
