package Link;

/**
 * @Auther Eternal
 * @Date 2021/9/13
 * 合并两个有序链表
 */
public class LinkTest4 {
    public static void main(String[] args) {

    }

    public static ListNode2 mergeTwoLists(ListNode2 l1, ListNode2 l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;

        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
