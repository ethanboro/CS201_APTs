public class ListFirstlast {
    public ListNode move(ListNode list) {        
        ListNode point = list;
        ListNode temp;
        while (list!=null) {
            if (list.next.next == null) {
                temp = new ListNode(list.next.info);
                list.next = null;
                break;
                
            }
            list = list.next;
        }

        
        temp.next=list;


        



    }
}