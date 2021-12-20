package com.Interview;

import com.dao.User;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 功能： 数组按顺序排列，取后面k个值的数组中的第一个值
 */

/**
 * @version: V1.0
 * @author: mikael
 * @description: PriorityQueue 是一个数据按关键词有序排列，插入新数据的时候，会自动插入到合适的位置保证队列有序。（顺序有两种形式：升序或者是降序） 默认是升序
 * @date: 2020/10/12
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        //
        int[] nums = {1, 23, 25, 6, 32423};
        int k = 4;
        System.out.println(find(nums, k));
        System.out.println("=========================");
        User user1 = new User(1, "h", 12);
        User user2 = new User(11, "j", 14);
        User user3 = new User(123, "t", 16);
        User user4 = new User(15, "e", 17);
        User user5 = new User(32, "f", 22);
        ArrayList<User> users = new ArrayList<>();
        users.add(user5);
        users.add(user4);
        users.add(user3);
        users.add(user2);
        users.add(user1);
//    System.out.println(findUser(users, 2));

    }

    //integer
    public static int find(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : nums) {
            priorityQueue.add(num);
            System.out.println(priorityQueue);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        System.out.println(priorityQueue);
        return priorityQueue.peek();
    }

    //integer
    public static User findUser(List<User> nums, int k) {
        PriorityQueue<User> priorityQueue = new PriorityQueue<>();
        for (User user : nums) {
            priorityQueue.add(user);
            System.out.println(priorityQueue);
            if (priorityQueue.size() > k) {
                priorityQueue.poll();
            }
        }
        System.out.println(priorityQueue);
        return priorityQueue.peek();
    }
}
