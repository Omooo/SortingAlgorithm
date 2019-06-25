package top.omooo.leetcode.linkedlist;

import top.omooo.base.ListNode;

/**
 * 合并有序链表
 * https://leetcode-cn.com/problems/merge-two-sorted-lists/
 */
public class MergeSortedList {

    private ListNode merge(ListNode p1, ListNode p2) {
        ListNode head = new ListNode(0);
        ListNode res = head;
        while (p1 != null && p2 != null) {
            if (p1.val <= p2.val) {
                head.next = p1;
                p1 = p1.next;
            } else {
                head.next = p2;
                p2 = p2.next;
            }
            head = head.next;
        }
        head.next = p2 == null ? p1 : p2;
        return res.next;
    }
}
