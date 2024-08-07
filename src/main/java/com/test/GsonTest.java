package com.test;

import com.dao.User;
import com.google.common.collect.Maps;
import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * https://blog.csdn.net/qq_36838191/article/details/80596316
 */
public class GsonTest {

    public static void main(String[] args) {
        User user = new User();
        user.setAge(12);
        user.setId(1);
        user.setName("jun");
        Gson gson = new Gson();
        //将对象，转化为string
        String s = gson.toJson(user);
        System.out.println(s);
        //将字符串转成user对象
        User o1 = gson.fromJson(s, User.class);

        String ss = "{\"id\":12,\"name\":\"ming\",\"age\":13}";
        //将字符串转化为对象类型
        User o = gson.fromJson(ss, User.class);
        System.out.println("===========" + o.getName());
        //BigDecimal
        String ssss = new BigDecimal("100").multiply(new BigDecimal("0.03")).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
        System.out.println(ssss + "==========================================");
        BigDecimal decimal = new BigDecimal("12");
        BigDecimal i = new BigDecimal("6475.65").divide(new BigDecimal("16184.39"), 2, BigDecimal.ROUND_HALF_UP);
        String bcje = "123.123";
        //bcje=(Integer.valueOf(bcje)/0.13)-Integer.valueOf(bcje)>-1&&Integer.valueOf(bcje)/0.13-Integer.valueOf(bcje)<1?bcje:new BigDecimal(bcje).divide(new BigDecimal("0.13"),2,BigDecimal.ROUND_HALF_UP).toString();

        System.out.println(bcje + "----------");
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid);
        System.out.println(uuid.replace("-", ""));

        ArrayList<String> strings = new ArrayList<>();

        Map<String, String> map = new HashMap<>();
        map.put("uuu", 111 + "");
        map.put("uuu2", 222 + "");
        map.put("uuu3", 3333 + "");
        String s1 = gson.toJson(map);
        System.out.println(s1);
        Map map1 = gson.fromJson(s1, Map.class);
        String uuu3 = (String) map1.get("uuu3");
        System.out.println(uuu3);

        //10之内的随机整数int
        int i1 = ThreadLocalRandom.current().nextInt(10);
        System.out.println(i1);

    }
}
