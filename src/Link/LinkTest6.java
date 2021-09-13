package Link;

/**
 * @Auther Eternal
 * @Date 2021/9/13
 * 环形链表
 */
public class LinkTest6 {
    public static void main(String[] args) {

    }

    public static boolean hasCycle(ListNode3 head) {
        if (head == null) return false;

        ListNode3 slow = head;
        ListNode3 fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }

        return false;
    }
}
