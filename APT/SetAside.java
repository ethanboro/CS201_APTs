import java.util.*;
public class SetAside {
    public String common(String[] list) {
        int len = list.length;
        HashMap <String, Integer> map = new HashMap<>();
        for (String el : list) {
            String[] wordarray = el.split(" ");
            ArrayList <String> seenlist = new ArrayList<>();
            for (String word : wordarray) {
                if (! map.containsKey(word)) {
                    map.put(word, 1);
                    seenlist.add(word);
                }
                else {
                    if (! seenlist.contains(word)) {
                        map.put(word, map.get(word)+1);
                    }
                    
                }

            }
        }
        ArrayList <String> alist = new ArrayList<>();
        ArrayList <String> blist = new ArrayList<>();
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            alist.add(key);
        }

        for (String word : alist) {
            if (map.get(word) >= len) {
                blist.add(word);
            }
        }

        
        String[] retf = new String[blist.size()];
        for (int i = 0; i < blist.size(); i++) {
            retf[i] = blist.get(i);
        }

        Arrays.sort(retf);
        return String.join(" ", retf);
    }
}