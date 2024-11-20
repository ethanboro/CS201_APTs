import java.util.*;
public class SplitCount {
    public String counter(String[] info) {
        // write code below, don't return  ""
        HashMap <String,Integer> myMap = new HashMap<>();
        for (String i : info) {
            String[] twolist = i.split(":");
            for (String j : twolist) {
                if (! myMap.containsKey(j)) {
                    myMap.put(j,0);
                }
                else {
                    myMap.put(j, myMap.get(j)+1);
                }
            }

        }

        Set<String> words = myMap.keySet();
        String[] wordarray = new String[words.size()];
        Object [] objwords = words.toArray();

        for (int k = 0; k<words.size(); k++) {
            String str1 = objwords[k].toString(); 
            wordarray[k] = str1;
        }
        int max = 0;
        int index = 0;
        int retindex = 0;
        for (String wrd: wordarray) {
            int val = myMap.get(wrd);
            if (val>max) {
                max = val;
                retindex = index;
            }
            index ++;
        }


        return (wordarray[retindex]);
    }
}