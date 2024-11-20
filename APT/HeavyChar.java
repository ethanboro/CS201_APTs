import java.util.*;
public class HeavyChar {
    public String[] weight(String[] words,
                           String letter,
                           int minChars){
        // write code below, don't return  null
        ArrayList<String> ret1 = new ArrayList<>(10); 
        for (String i : words) {
            char[] charlist = i.toCharArray();
            int counter = 0;
            for (char ch: charlist) {
                if (ch == letter.charAt(0)) {
                    counter+=1;
                }
            }
            if (counter>minChars) {
                ret1.add(i);
            }
        }
        int len = ret1.size();
        String[] ret = new String[len];
        for (int i = 0; i<len; i++) {
            ret[i] = ret1.get(i);
        }
        return ret;
    }
}