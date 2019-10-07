public class Solution_LinkedListCycle {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    private static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null)
            return false;
        ListNode onestep = head;
        ListNode twostep = head;
        while (true) {
            if (onestep.next != null)
                onestep = onestep.next;
            else
                return false;
            if (twostep == null)
                return false;
            if (twostep.next != null)
                twostep = twostep.next.next;
            else
                return false;
            if (onestep == twostep)
                return true;
        }
    }

    public static void main(String[] args) {
        ListNode test1 = new ListNode(3);
        test1.next = new ListNode(2);
        test1.next.next = new ListNode(0);
        test1.next.next.next = new ListNode(-4);
        test1.next.next.next.next = test1.next;

        System.out.println(hasCycle(test1));

        ListNode test2 = new ListNode(1);
        test2.next = new ListNode(2);
        test2.next.next = test2.next;

        System.out.println(hasCycle(test2));

        ListNode test3 = new ListNode(1);

        System.out.println(hasCycle(test3));

    }
}
