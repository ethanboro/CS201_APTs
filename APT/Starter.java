import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class Starter {
    public int begins(String[] words, String first) {
        // quick two lines to go from array to set to array - removes duplicates
        Set<String> wordSet = new HashSet<>(Arrays.asList(words));
        String[] wordslist = wordSet.toArray(new String[wordSet.size()]);
        int counter = 0;
        for (int i = 0; i< wordslist.length; i++) {
            if ((wordslist[i].charAt(0))==(first.charAt(0))){
                counter ++;
            }
            

        }

        return counter;
    }
}