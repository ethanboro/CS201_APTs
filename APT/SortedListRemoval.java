public class SortedListRemoval {
    public ListNode uniqify(ListNode list){
      ListNode front = list;
      if (list==null){ return list;}
      while (list.next!=null) {
        if (list.info==list.next.info) {
            list.next = list.next.next;
        }
        else {list = list.next;}
      }
    return front;
    }
}