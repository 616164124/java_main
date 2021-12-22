package zb.算法.第一个收藏视频.链表反转;

import com.Leetcode.leetcodeday004.Solution;

import java.util.List;

/**
 * @author mikael
 */
public class fist {
    private static class  ListNode{
        private  int val;
        private  ListNode next;

        public  ListNode(int val,ListNode next){
            this.val=val;
            this.next=next;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;//前面一个 listnode
        ListNode curr = head;//
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode one = new ListNode(1,null);
        ListNode two = new ListNode(2,one);
        ListNode three = new ListNode(3,two);
        ListNode four = new ListNode(4,three);
        ListNode five = new ListNode(5,four);
        ListNode listNode = reverseList(five);
        System.out.println("111");
        int i = 3;
        System.out.println(i^5);
    }

}
