public class RemoveMin {
    public ListNode remove (ListNode list) {
        int count = list.info;
        while (list.next!=null) {
            if (list.next.info<count) {
                count = list.next.info;

            }
            list = list.next;
        }

        ListNode pointer = list;
        while (pointer.next!=null) {
            if (pointer.next.info==count) {
                pointer.next = pointer.next.next;
            }
            pointer = pointer.next;
        }
    return null;
    }
}