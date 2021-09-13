package Link;

/**
 * @Auther Eternal
 * @Date 2021/9/13
 * 删除链表的倒数第N个节点
 */
public class LinkTest2 {
    public static void main(String[] args) {
        ListNode2 node0 = new ListNode2(5, null);
        ListNode2 node1 = new ListNode2(4, node0);
        ListNode2 node2 = new ListNode2(3, node1);
        ListNode2 node3 = new ListNode2(2, node2);
        ListNode2 node4 = new ListNode2(1, node3);

        ListNode2 nodeRes = removeNthFromEnd(node0, 2);
        show(node4);
        System.out.println();
        show(nodeRes);
    }

    public static ListNode2 removeNthFromEnd(ListNode2 head, int n) {
        ListNode2 pre = head;
        int last = length(head) - n;

        if (last == 0) return head.next;

        for (int i = 0; i < last - 1; i++) pre = pre.next;

        pre.next = pre.next.next;

        return head;
    }

    public static int length(ListNode2 head) {
        int len = 0;

        while (head != null) {
            len++;
            head = head.next;
        }

        return len;
    }

    public static void show(ListNode2 head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }
}
