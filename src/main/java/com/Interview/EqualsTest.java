
package com.Interview;

import com.dao.User;


/*
 * @version: V1.0
 * @author: mikael
 * @className: Test
 * @packageName: Interview
 * @description:
 * @data: 2020-11-03
 **/
public class EqualsTest {
    public static void main(String[] args) {
        User user1 = new User(1, "hua", 33);
        User user2 = new User(1, "hua", 33);
        System.out.println(user1.getAge().equals(user2.getAge())); //true
        System.out.println(user1.equals(user2));//false
    }
}
