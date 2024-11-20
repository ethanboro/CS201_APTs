import java.util.*; 

public class AlphaLength {

    int temp = 0; 
    ListNode first = null; 

    public ListNode create (String[] words) {
        
        ArrayList<String> list = new ArrayList<>(); 

        Arrays.sort(words); 

        for(String s: words) {
            if(!list.contains(s)) {
                list.add(s); 
            }
            
        } 

        String[] sorted = list.toArray(new String[0]);

        ListNode first = new ListNode(sorted[0].length()); 

        ListNode yes = first; 

        for(int i = 1; i < sorted.length; i++) {
            first.next = new ListNode(sorted[i].length(), first);

            if(i == sorted.length-1) {
                first.next = new ListNode(sorted[i].length(), null);
            }

            first = first.next; 

        }


        
        return yes;
    }

}