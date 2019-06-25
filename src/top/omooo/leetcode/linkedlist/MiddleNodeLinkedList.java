package top.omooo.leetcode.linkedlist;

import top.omooo.base.ListNode;

/**
 * 链表的中间节点
 * https://leetcode-cn.com/problems/middle-of-the-linked-list/
 */
public class MiddleNodeLinkedList {

    private ListNode middleNode(ListNode head) {
        ListNode p = head;
        while (head != null && head.next != null) {
            head = head.next.next;
            p = p.next;
        }
        return p;
    }

}
