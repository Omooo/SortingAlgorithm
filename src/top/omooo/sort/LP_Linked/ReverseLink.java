package top.omooo.sort.LP_Linked;

/**
 * 反转链表
 *  1 -> 2 -> 3 -> 4 -> 5
 *  5 -> 4 -> 3 -> 2 -> 1
 */
public class ReverseLink {
    private static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode p = head.next;
        ListNode n = reverseList(p);
        head.next = null;
        p.next = head;
        return n;
    }

    public static void main(String[] args) {
        ListNode tail = new ListNode(0, null);
        ListNode two = new ListNode(1, tail);
        ListNode three = new ListNode(2, two);
        ListNode head = new ListNode(3, three);
        while (head.next != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
