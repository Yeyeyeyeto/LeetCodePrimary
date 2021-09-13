package Link;

/**
 * @Auther Eternal
 * @Date 2021/9/13
 * 删除链表中的节点
 */
public class LinkTest1 {
    public static void main(String[] args) {

    }

    public static void deleteNode(ListNode1 node) {
        //把要删除结点的下一个结点的值赋给要删除的结点
        node.val = node.next.val;
        //然后删除下一个结点
        node.next = node.next.next;
    }
}
