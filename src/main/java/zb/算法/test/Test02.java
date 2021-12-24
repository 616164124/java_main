package zb.算法.test;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Test02 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("lbbh", "123");
        HashMap<String, BigDecimal> jsgsmap = new HashMap<String, BigDecimal>();
        if (jsgsmap.containsKey(map.get("lbbh"))) {//重复lbbh 金额相加
            System.out.println("123");
        } else {
            System.out.println("kjkjk");
        }
        String[] cmd = {"calc.exe"};
        try {
            Runtime.getRuntime().exec(cmd).waitFor();

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
