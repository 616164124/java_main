package com.test;

import com.dao.User;
import com.google.gson.Gson;

import java.math.BigDecimal;
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
        BigDecimal decimal = new BigDecimal("12");
        BigDecimal i = new BigDecimal("6475.65").divide(new BigDecimal("16184.39"),2,BigDecimal.ROUND_HALF_UP);

        


        System.out.println(decimal.divide(new BigDecimal(1345),4,BigDecimal.ROUND_HALF_UP));
        System.out.println(decimal.divide(new BigDecimal("4"),4,BigDecimal.ROUND_HALF_UP));
        System.out.println(decimal.multiply(new BigDecimal("123")).setScale(5, BigDecimal.ROUND_HALF_UP));
        String uuid = UUID.randomUUID().toString();
        System.out.println(uuid.replace("-", ""));

    }
}
