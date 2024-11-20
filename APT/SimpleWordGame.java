import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SimpleWordGame {
    public int points(String[] player, 
                      String[] dictionary) {
        Set<String> wordSet = new HashSet<>(Arrays.asList(player));
        String[] nplayer = wordSet.toArray(new String[wordSet.size()]);
        int score = 0;
        for (String word: nplayer) {
            for (String aword: dictionary) {
                if (aword.equals(word)) {
                    score += (word.length()) * (word.length());

                }

            }
            
        }
        return score;
    }
}
