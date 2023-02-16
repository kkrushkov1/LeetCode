package Medium;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        System.out.println(addTwoNumbers(l1, l2).val);
    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode resultNode = new ListNode();
        ListNode cur = resultNode;
        int carry = 0;

        while(l1!= null || l2!=null || carry == 1){
            int sum = 0;

            if(l1!=null){
                sum += l1.val;
                l1 = l1.next;
            }

            if(l2!=null){
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carry;

            carry = sum /10;

            ListNode newNode = new ListNode(sum%10);
            cur.next = newNode;
            cur = cur.next;
        }

        return resultNode.next;
    }


    public static  class ListNode {
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
