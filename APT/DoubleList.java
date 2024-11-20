public class DoubleList {
    public ListNode bigify(ListNode list) {
        
        ListNode first = new ListNode(-1);
        ListNode last = first;

        while (list != null) {
            ListNode temp = new ListNode(list.info);
            temp.next = new ListNode(list.info);
            last.next = temp;
            last = last.next.next;
            list = list.next;
        }

        return first.next;

    }
}
