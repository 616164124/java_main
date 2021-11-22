package zb.算法.LeetCode;

public class 判断链表是否为一个环 {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode l1 = head, l2 = head.next;
        while (l1 != null && l2 != null) {
            if (l1 == l2) return true;
            l1 = l1.next;
            if (l2.next == null) break;
            l2 = l2.next.next;
        }
        return false;
    }

}

class ListNode {

    public ListNode next;
}