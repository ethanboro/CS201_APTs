// import java.util.ArrayList;
// import java.util.HashMap;
// import java.util.Comparator;
// import java.util.Collections;
import java.util.*; 
public class SortByFreqs {
    
    
    public String[] sort (String[] data) {
        if (data == null || data.length == 0) {
            return new String[0];  // Return an empty array if input data is empty
        }
        HashMap<String, Fruit> map= new HashMap<>();
        for (String str : data) {
            map.putIfAbsent(str, new Fruit(str));
            map.get(str).myFreq+=1;
        }
        
        ArrayList<Fruit> list = new ArrayList<>(map.values());
        Comparator<Fruit> freqComp = Comparator.comparing(Fruit::getFreq);
        Comparator<Fruit> nameComp = Comparator.comparing(Fruit::toString);

        Collections.sort(list, nameComp);
        Collections.sort(list, freqComp.reversed());

        String[] ret = new String[list.size()];
        int i = 0;
        for (Fruit ft: list) {
            ret[i] = ft.toString();
            i++;
        }

        return ret;
    }

    public class Fruit {
        String myName;
        int myFreq;
        Fruit (String name) {
            myName = name;
            myFreq=0;
        }
        public int getFreq() {
            return myFreq;
        }


        public String toString() {
            return myName;
        }
    }
 }



 