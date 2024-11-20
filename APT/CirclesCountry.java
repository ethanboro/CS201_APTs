import java.util.stream.IntStream;

public class CirclesCountry {
    public int leastBorders(int[] x, int[] y, int[] r, 
                            int x1, int y1, int x2, int y2) {
        
        int[] ilist = IntStream.range(0, (x.length)).toArray();
        int counter = 0;

        for (int i: ilist) {
            if (((x1-x[i])*(x1-x[i]))+((y1-y[i])*(y1-y[i])) > (r[i]*r[i])) {
                if (((x2-x[i])*(x2-x[i]))+((y2-y[i])*(y2-y[i])) < (r[i]*r[i])) {
                    counter +=1;
                }


            }
            if (((x1-x[i])*(x1-x[i]))+((y1-y[i])*(y1-y[i])) < (r[i]*r[i])) {
                if (((x2-x[i])*(x2-x[i]))+((y2-y[i])*(y2-y[i])) > (r[i]*r[i])) {
                    counter +=1;
                }


            }

            
        }

        return counter;  
    }
 }