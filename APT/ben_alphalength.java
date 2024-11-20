import java.util.*;

public class ben_alphalength {
    public ListNode create (String[] words) {
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<String> check = new ArrayList<>();
        Arrays.sort(words);
        for(String word : words) {
            if(!check.contains(word)) {
                list.add(word.length());
                check.add(word);
            }
        }
        ListNode first = new ListNode(-1);
        ListNode last = first;
        for(int i=0; i<list.size(); i++) {
            ListNode temp = new ListNode(list.get(i));
            last.next = temp;
            last = last.next;
        }
    return first.next;
    
    }
}