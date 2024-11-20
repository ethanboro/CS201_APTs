import java.util.*;
public class AlphaLength {
    public ListNode create (String[] words) {
        // replace statement below with code you write
        
        ArrayList <String> al = new ArrayList<>();
        for (String wrd : words) {
            if (! al.contains(wrd)) {
                al.add(wrd);
            }
        }

        Collections.sort(al);

        ListNode head= null;
        ListNode tail = null;

        for (String val: al) {
            int len = val.length();
            ListNode newNode = new ListNode(len);
            if (head == null) {
                head = newNode;
                tail = newNode;
            }
            else {
                tail.next = newNode;
                tail = tail.next;
            }

        }
        
        
    return head;
    }
}