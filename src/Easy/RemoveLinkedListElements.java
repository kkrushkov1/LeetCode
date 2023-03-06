package Easy;

public class RemoveLinkedListElements {


    public static ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode temp = dummy;
        while (temp != null) {
            while (temp.next != null && temp.next.val == val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }

        return dummy.next;
    }

    ListNode head;

    public static void main(String[] args) {

        RemoveLinkedListElements cycle = new RemoveLinkedListElements();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(6);
        ListNode forth = new ListNode(3);
        ListNode fifth = new ListNode(4);
        ListNode sixth = new ListNode(5);
        ListNode seventh = new ListNode(6);
        cycle.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;

        System.out.println(removeElements(cycle.head, 6));
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
