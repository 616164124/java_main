package zb.算法.LeetCode.环形链表的约瑟夫问题;

import java.util.LinkedList;

/**
 * 输入：5,2
 * 返回值：3
 * 说明：
 * 开始5个人 1，2，3，4，5 ，从1开始报数，1->1，2->2编号为2的人离开
 * 1，3，4，5，从3开始报数，3->1，4->2编号为4的人离开
 * 1，3，5，从5开始报数，5->1，1->2编号为1的人离开
 * 3，5，从3开始报数，3->1，5->2编号为5的人离开
 * 最后留下人的编号是3
 */
public class Test {

    @org.junit.Test
    public void test() {
        System.out.println(ysf(15, 3));
    }

    //0 1 2 3 4    2
    public static int ysf(int n, int m) {

        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            list.addLast(i);
        }
        int curr = 0;
        for (int i = 0; i < n - 1; i++) {
            curr += m - 1;
            curr = curr % list.size();
            list.remove(curr);
        }
        return list.get(0);
    }

}
