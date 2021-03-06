package com.test;

import com.dao.User;
import com.google.gson.Gson;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.UUID;

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
        String ss = "{\"id\":12,\"name\":\"ming\",\"age\":13}\n";
        //将字符串转化为对象类型
        User o = (User) gson.fromJson(ss, User.class);
        System.out.println("===========" + o.getName());
        //BigDecimal
        String ssss= new BigDecimal("100").multiply(new BigDecimal("0.03")).setScale(2, BigDecimal.ROUND_HALF_UP).toString();
        System.out.println(ssss+"==========================================");
        BigDecimal decimal = new BigDecimal("12");
        BigDecimal i = new BigDecimal("6475.65").divide(new BigDecimal("16184.39"),2,BigDecimal.ROUND_HALF_UP);
        String bcje="123.123";
        //bcje=(Integer.valueOf(bcje)/0.13)-Integer.valueOf(bcje)>-1&&Integer.valueOf(bcje)/0.13-Integer.valueOf(bcje)<1?bcje:new BigDecimal(bcje).divide(new BigDecimal("0.13"),2,BigDecimal.ROUND_HALF_UP).toString();

        System.out.println(bcje+"----------");
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid.replace("-", ""));

        ArrayList<String> strings = new ArrayList<>();


    }
}
