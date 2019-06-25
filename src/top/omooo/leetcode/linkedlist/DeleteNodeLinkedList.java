package top.omooo.leetcode.linkedlist;

import top.omooo.base.ListNode;

/**
 * 删除链表中的节点
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 */
public class DeleteNodeLinkedList {

    private void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
