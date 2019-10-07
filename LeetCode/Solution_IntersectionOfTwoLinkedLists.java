import org.jetbrains.annotations.Contract;


public class Solution_IntersectionOfTwoLinkedLists {
    public static class ListNode {
        int val;
        ListNode next;

        @Contract(pure = true)
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    @Contract("null, _ -> null; !null, null -> null")
    private static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null)
            return null;
        ListNode pointA = headA;
        ListNode pointB = headB;
        ListNode lastA = null, lastB = null;
        while (true) {
            if (pointA.next != null)
                pointA = pointA.next;
            else {
                lastA = pointA;
                pointA = headB;
            }
            if (pointB.next != null)
                pointB = pointB.next;
            else {
                lastB = pointB;
                pointB = headA;
            }
            if (lastA != null && lastB != null && lastA != lastB)
                return null;
            if (pointA == pointB)
                return pointA;
        }
    }

}
