package top.omooo.sort.LP_Linked;

/**
 * 删除链表的倒数第N个节点
 * 给定一个链表，删除链表的倒数第n个节点，并且返回链表的头节点
 * 示例：
 *  1 > 2 > 3 > 4 > 5   n = 2
 *  1 > 2 > 3 > 5
 */
public class DeleteNthEnd {
    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x, ListNode next) {
            this.next = next;
            val = x;
        }
    }

    private static ListNode removeFromEnd(ListNode head, int n) {
        int length = 0;
        ListNode headNode = head;
        if (head == null || n == 0) {
            return null;
        }
        while (headNode != null) {
            length++;
            headNode = headNode.next;
        }
        int fromStart = length - n + 1;
        if (fromStart == 1) {
            return head.next;
        }
        headNode = head;
        int i = 0;
        while (headNode != null) {
            i++;
            if (i == fromStart - 1) {
                headNode.next = headNode.next.next;
            }
            headNode = headNode.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(0, null);
        ListNode two = new ListNode(1, tail);
        ListNode three = new ListNode(2, two);
        ListNode four = new ListNode(3, three);
        ListNode head = new ListNode(4, four);

        removeFromEnd(head, 2);
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
