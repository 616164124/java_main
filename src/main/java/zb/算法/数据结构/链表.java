package zb.算法.数据结构;

import com.sun.mail.imap.protocol.Item;

import javax.mail.FetchProfile;

/**
 * @author mikael
 */
public class 链表 {
    private static class  Node{
        Item item;
        Node next;
    }

    public static void main(String[] args) {
        Node one = new Node();
        Node two = new Node();
        Node three = new Node();
        one.next=two;
        two.next=three;

    }
}
