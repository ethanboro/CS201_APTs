public class ListParity {
    public int count (ListNode list){
        ListNode pointer = list;
        int counter = 0;
        int even = 0;
        while (list!=null) {
            if (even%2==0) {
                counter+= list.info;
            }
            even++;
            list = list.next;
        }
        return counter;
    }
}