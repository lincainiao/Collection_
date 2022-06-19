import com.sun.source.tree.ArrayAccessTree;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        ListNode head = new ListNode(0);
        ListNode cur = head;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int t = scanner.nextInt();
            ListNode node = new ListNode(t);
            cur.next = node;
            cur = cur.next;
        }
        int[] ans = test.reversePrint(head);
        for (int i:ans) {
            System.out.println(i);
        }
    }
    public int[] reversePrint(ListNode head) {
        int cnt = 0;
        ListNode cur = head.next;
        Stack<ListNode> stack = new Stack<ListNode>();
        while (cur != null) {
            stack.push(cur);
            cur = cur.next;
        }
        int[] ans = new int[stack.size()];
        while (!stack.isEmpty()) {
            ans[cnt++] = stack.pop().val;
        }
        return ans;
    }
}
