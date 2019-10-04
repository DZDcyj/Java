import org.jetbrains.annotations.Contract;

public class Solution_RemoveDuplicatesFromSortedList {
    public static class ListNode {
        int val;
        ListNode next;

        @Contract(pure = true)
        ListNode(int x) {
            val = x;
        }

        @Override
        public String toString() {
            String result = "";
            ListNode curr = this;
            while (curr.next != null) {
                result += curr.val + "->";
                curr = curr.next;
            }
            result += curr.val;
            return result;
        }
    }

    @Contract("null -> null")
    private static ListNode deleteDuplicates(ListNode head) {
        if (head == null)
            return null;
        ListNode curr = head;
        int currval;
        while (curr.next != null) {
            currval = curr.val;
            if (curr.next.val == currval) {
                if (curr.next.next != null) {
                    curr.next = curr.next.next;
                    continue;
                } else
                    curr.next = null;
            }
            curr = curr.next;
            if (curr == null)
                break;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode test1 = new ListNode(1);
        test1.next = new ListNode(1);
        test1.next.next = new ListNode(2);
        ListNode test2 = new ListNode(1);
        test2.next = new ListNode(1);
        test2.next.next = new ListNode(2);
        test2.next.next.next = new ListNode(3);
        test2.next.next.next.next = new ListNode(3);
        ListNode test3 = new ListNode(3);
        System.out.println(deleteDuplicates(test1).toString());
        System.out.println(deleteDuplicates(test2).toString());
        System.out.println(deleteDuplicates(test3).toString());
    }
}
