public class ListSum {
    public int sum(ListNode list, int thresh) {

        int counter = 0;
        ListNode current = list;

        while(current != null) {
            if(current.info > thresh) {
                counter += current.info;
            }

            current = current.next;
        }

        return counter;
    }
}