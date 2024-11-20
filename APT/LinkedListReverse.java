public class LinkedListReverse {
    public ListNode move(ListNode list) {
        ListNode first = new ListNode(-1);
        ListNode last = first;
        ListNode start = new ListNode(list.info);
        while (list.next!=null) {
            ListNode temp = new ListNode(list.next.info);
            temp.next = start;
            start = temp;
            list = list.next;

        }
        return start;
    }
}