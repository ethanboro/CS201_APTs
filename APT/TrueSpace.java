public class TrueSpace {
    public long calculateSpace(int[] sizes, int clusterSize) {
       long size = 0;
       for (int s : sizes) {
        if (s == 0) {
            ;
        }
        else if (s <= clusterSize) {
            size += clusterSize;
          }
        else if (Math.floorDiv(s, clusterSize) == (double) s / clusterSize) {
            size += s;
        }
        else {
            size += (1+ Math.floorDiv(s, clusterSize))*clusterSize;
        }
       }
       return size;
    }
 }