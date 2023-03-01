package Easy;

public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode list = new ListNode();
        ListNode output = list;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list.next = list1;
                list1 = list1.next;
            } else {
                list.next = list2;
                list2 = list2.next;
            }
            list = list.next;
        }

        if (list1 != null) {
            list.next = list1;
        } else {
            list.next = list2;
        }
        return output.next;
    }

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
    }
}
