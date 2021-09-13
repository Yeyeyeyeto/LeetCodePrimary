package Link;

import java.util.Stack;

/**
 * @Auther Eternal
 * @Date 2021/9/13
 * 反转链表
 */
public class LinkTest3 {
    public static void main(String[] args) {

    }

    public static ListNode2 reverseList(ListNode2 head) {
        Stack<ListNode2> stack = new Stack<>();

        while (head != null) {
            stack.push(head);
            head = head.next;
        }

        if (stack.isEmpty()) return null;

        ListNode2 node = stack.pop();
        ListNode2 dummy = node;

        while (!stack.isEmpty()) {
            ListNode2 tempNode = stack.pop();
            node.next = tempNode;
            node = node.next;
        }

        node.next = null;
        return dummy;
    }
}
