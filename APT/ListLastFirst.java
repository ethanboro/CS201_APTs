

public class ListLastFirst {
    public ListNode move(ListNode list) {
        // If the list is empty or has only one element, return it as is.
        if (list == null || list.next == null) {
            return list;
        }

        ListNode secondLast = null;
        ListNode last = list;

        // Traverse to find the last and second last nodes.
        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }


        // Now 'last' is the last node and 'secondLast' is the second last node.
        secondLast.next = null; // Remove the last node from the list.
        last.next = list; // Point the last node's next to the original head.
        
        return last; // Return the new head of the list (last node).
    }
}