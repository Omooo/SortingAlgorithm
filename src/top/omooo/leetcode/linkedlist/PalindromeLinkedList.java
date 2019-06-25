package top.omooo.leetcode.linkedlist;

import top.omooo.base.ListNode;

/**
 * 回文链表
 * https://leetcode-cn.com/problems/palindrome-linked-list/
 */
public class PalindromeLinkedList {

    public static void main(String[] args) {
        ListNode head = new ListNode(0);
        head.next = new ListNode(1);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(0);

        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(ListNode head) {

        if (head == null || head.next == null) return true;
        ListNode p = head;

        //查找链表中间节点
        ListNode middle = head;
        while (head != null && head.next != null) {
            head = head.next.next;
            middle = middle.next;
        }

        //从链表中间节点开始进行链表反转
        ListNode p1 = middle;
        ListNode p2 = middle.next;
        ListNode p3 = null;
        while (p2 != null) {
            p3 = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = p3;
        }
        middle.next = null;


        //判断回文
        while (p1 != null) {
            if (p.val == p1.val) {
                p = p.next;
                p1 = p1.next;
            } else {
                return false;
            }
        }
        return true;
    }
}
