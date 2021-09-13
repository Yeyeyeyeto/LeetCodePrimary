package Link;

import java.util.Stack;

/**
 * @Auther Eternal
 * @Date 2021/9/13
 * 回文链表
 */
public class LinkTest5 {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(ListNode2 head) {
        ListNode2 temp = head;
        Stack<Integer> stack = new Stack();

        while (temp != null) {
            stack.push(temp.val);
            temp = temp.next;
        }

        while (head != null) {
            if (head.val != stack.pop()) return false;
            head = head.next;
        }

        return true;
    }
}
