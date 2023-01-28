package Easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class LinkedListCycle {
    ListNode head;

    public static void main(String[] args) {

        LinkedListCycle cycle = new LinkedListCycle();
        ListNode first = new ListNode(3);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(0);
        ListNode forth = new ListNode(-4);
        cycle.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = second;

        System.out.println(hasCycle(cycle.head));

    }

    public static boolean hasCycle(ListNode head) {
        ListNode node = head;
        HashSet<ListNode> result = new HashSet<>();

        while (node != null) {
            if (result.contains(node)) {
                return true;
            } else {
                result.add(node);
            }
            node = node.next;
        }

        return false;

    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
