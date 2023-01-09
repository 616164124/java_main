package com.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dao.User;

/**
 * fastjson
 */
public class FastJsonTest {
    public static void main(String[] args) {
        String ss = "{\"id\":12,\"name\":\"ming\",\"age\":13}";
        User user = new User();
        user.setAge(12);
        user.setId(1);
        user.setName("jun");
        //将对象，转化为string
        System.out.println(JSONObject.toJSONString(user));
        //将字符串转化为对象类型
        User user1 = JSON.parseObject(ss, User.class);
        System.out.println(user1);


    }
}
