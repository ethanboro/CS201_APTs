import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Totality {
    public int sum(int[] a, String stype) {
        int total = 0;
        //quick way to make list from 0 to n on line 9
        int[] indexlist = IntStream.range(0, (a.length)).toArray();


        if (stype.equals("even")) {
            for (int x: indexlist) {
                if (x%2==0){
                    total += a[x];
                }}}
        if (stype.equals("odd")) {
            for (int x: indexlist) {
                if (x%2==1){
                    total += a[x];}}}
        if (stype.equals("all")) {
            for (int x: a) {
                total += x;}
                
            }
            return total;
        }


        
    }

