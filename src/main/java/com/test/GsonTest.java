package com.test;

import com.dao.User;
import com.google.gson.Gson;

import java.lang.reflect.Type;

public class GsonTest {

    public static void main(String[] args) {
        User user = new User();
        user.setAge(12);
        user.setId(1);
        user.setName("jun");
        Gson gson = new Gson();
        String s = gson.toJson(user);
        System.out.println(s);
        String ss = "{\"id\":12,\"name\":\"ming\",\"age\":13}\n";
        User o = (User)gson.fromJson(ss,  User.class);
        System.out.println("==========="+o.getName());

    }
}
