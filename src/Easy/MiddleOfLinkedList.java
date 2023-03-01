package Easy;

public class MiddleOfLinkedList {
    ListNode head;

    public static void main(String[] args) {
        MiddleOfLinkedList cycle = new MiddleOfLinkedList();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode forth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        cycle.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        System.out.println(middleNode(cycle.head));
    }


    public static ListNode middleNode(ListNode head) {
        ListNode root = head;
        int length = 0;

        while (root != null) {
            root = root.next;
            length++;
        }
        length = (int) Math.ceil(length / 2);
        for (int i = 0; i < length; i++) {
            head = head.next;
        }
        return head;
    }


    public  static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }


    }
}
