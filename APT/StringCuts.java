import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;

public class StringCuts {
    public String[] filter(String[] list, int minLength) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(list));
        String[] wordlist = wordSet.toArray(new String[wordSet.size()]);
        String[] newlist = new String[wordlist.length];
        int x = 0;
        for (String str : wordlist) {
            if (str.length() >= minLength) {
                newlist[x] = str;
                x++;
            }
        }
        int y=0;
        String[] xlist = new String[x];
        for (String str : newlist) {
            xlist[y] = str;
        }





        return xlist;
    }
}