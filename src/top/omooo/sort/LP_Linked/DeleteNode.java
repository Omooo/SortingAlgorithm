package top.omooo.sort.LP_Linked;

/**
 * 删除链表的节点
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点
 * 您只被给予要求被删除的节点
 * 示例：
 * 1 -> 2 -> 3 -> 4 删除 3 之后为：1 -> 2 -> 4
 */
public class DeleteNode {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x, ListNode next) {
            this.next = next;
            val = x;
        }
    }

    private static void deleteNode(ListNode head, ListNode node) {
        if (node.next == null) {
            //删除尾节点
            while (head.next != node) {
                head = head.next;
            }
        } else if (head == node) {
            //删除头节点
            head = null;
        } else {
            node.val = node.next.val;
            node.next = node.next.next;
        }
    }

    //依照题意，只给被删除节点
    private static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(0, null);
        ListNode two = new ListNode(1, tail);
        ListNode three = new ListNode(2, two);
        ListNode head = new ListNode(3, three);
        deleteNode(head, two);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
