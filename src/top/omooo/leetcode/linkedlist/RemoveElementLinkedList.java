package top.omooo.leetcode.linkedlist;

import top.omooo.base.ListNode;

/**
 * 删除链表中等于给定值的所有节点
 * https://leetcode-cn.com/problems/remove-linked-list-elements/
 */
public class RemoveElementLinkedList {

    public ListNode removeElements(ListNode head, int val) {
        ListNode p = new ListNode(0);
        p.next = head;
        ListNode p1 = p;
        while (p1.next != null) {
            if (p1.next.val == val) {
                p1.next = p1.next.next;
            } else {
                p1 = p1.next;
            }
        }
        return p.next;
    }
}
