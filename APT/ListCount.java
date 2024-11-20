import java.util.LinkedList;
public class ListCount {
    public int count (ListNode list) {
        int total = 0;
        ListNode current = list;
        while (current!=null) {
            total+=1;
            current = current.next;
        }
    return total;
    }
}
