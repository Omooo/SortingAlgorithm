package top.omooo.leetcode.linkedlist;

import top.omooo.base.ListNode;

import java.util.HashSet;

/**
 * 链表判环
 * https://leetcode-cn.com/problems/linked-list-cycle
 */
public class CircleLinkedList {

    public static void main(String[] args) {

    }

    public static boolean hasCircle(ListNode head) {
        if (head == null || head.next == null) return false;
        ListNode p1 = head;
        ListNode p2 = head.next;
        while (p2 != null && p2.next != null) {
            p1 = p1.next;
            p2 = p2.next.next;
            if (p1 == p2) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasCircle1(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode p1 = head;
        while (p1 != null) {
            if (set.contains(p1)) {
                return true;
            } else {
                set.add(p1);
                p1 = p1.next;
            }
        }
        return false;
    }

    public static boolean hasCircle2(ListNode head) {
        ListNode p1 = head;
        while (p1 != null) {
            if (p1.val == 0x23333) {
                return true;
            } else {
                p1.val = 0x23333;
                p1 = p1.next;
            }
        }
        return false;
    }
}
