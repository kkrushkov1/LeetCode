package Easy;

public class RemoveDuplicates_From_SortedList {

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            while (temp.next != null && temp.next.val == temp.val) {
                temp.next = temp.next.next;
            }
            temp = temp.next;
        }
        return head;
    }


    ListNode head;
    public static void main(String[] args) {
        RemoveDuplicates_From_SortedList cycle = new RemoveDuplicates_From_SortedList();
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(2);
        ListNode forth = new ListNode(3);
        ListNode fifth = new ListNode(3);
        cycle.head = first;
        first.next = second;
        second.next = third;
        third.next = forth;
        forth.next = fifth;

        System.out.println(deleteDuplicates(cycle.head));


    }

    public static class ListNode {
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
