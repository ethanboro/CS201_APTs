import java.util.*;
public class EndOfWords {
    public String[] filter(String[] words){
        // TODO: write code here
        HashMap <Character,Integer> myMap = new HashMap<>();
        ArrayList <String> ret = new ArrayList<>();
        for (String wrd : words) {
            if (wrd.charAt(0)==wrd.charAt(wrd.length()-1)) {
                if (myMap.containsKey(wrd.charAt(0))) {
                    continue;
                }
                ret.add(wrd);
                myMap.put(wrd.charAt(0), 1);
            }
        }
        String[] retf = new String[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            retf[i] = ret.get(i);
        }
        return retf;
    }
}