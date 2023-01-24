package Easy;

import java.util.Stack;

public class PalindromeLinkedList {


    public boolean isPalindrome(ListNode head) {
        Stack<ListNode> list = new Stack<>();

        ListNode temp = head;
        while (temp != null) {
            list.push(temp);
            temp = temp.next;
        }
        while (head != null && !list.isEmpty()) {
            if (list.pop().val != head.val) {
                return false;
            } else {
                head = head.next;
            }
        }
        return true;

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
