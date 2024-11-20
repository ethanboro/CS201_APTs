import java.util.*;
public class Measuring {
    public int[] calculate(String[] data) {
        int[] ret = new int[data.length];
        HashMap <String,Integer> myMap = new HashMap<>();
        for (int i=0; i<data.length; i++) {
            if (myMap.containsKey(data[i])) {
                ret[i] = 0;
            }
            else {
                ret[i] = data[i].length();
                myMap.put(data[i],0);
            }

        }
        return ret;
    }
}