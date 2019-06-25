package top.omooo.leetcode.linkedlist;

import top.omooo.base.ListNode;


/**
 * 链表反转
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseLinkedList {

    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode p3 = null;
        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        head.next = null;
        head = p1;
        return head;
    }

    public static void main(String[] args) {
        ListNode head = getHeaderList();
        System.out.println("Before reverse");
        ListNode p = head;
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
        System.out.println("After reverse");
        p = reverseList(head);
        while (p != null) {
            System.out.println(p.val);
            p = p.next;
        }
    }

    private static ListNode getHeaderList() {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next = new ListNode(5);
        return head;
    }
}
