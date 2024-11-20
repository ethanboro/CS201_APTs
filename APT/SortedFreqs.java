import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class SortedFreqs {
    public int[] freqs(String[] data) {
        
        HashMap<String, Integer> myMap= new HashMap<>();
        for (String str : data) {
            myMap.putIfAbsent(str, 0);
            myMap.put(str, myMap.get(str)+1);
        }
        //set of keys
        Set<String> keys = myMap.keySet();
        ArrayList <String> alist = new ArrayList();

        String[] karray= new String[keys.size()];
        int[] ret = new int [keys.size()];

        for (String key : keys) {
            alist.add(key);

        }
        for (int i = 0; i<keys.size(); i++) {
            karray[i] = alist.get(i);
        }

        Arrays.sort(karray);

        for (int i = 0; i< myMap.keySet().size(); i++) {
            ret[i] = myMap.get(karray[i]);
        }

        return ret;


    }
 }