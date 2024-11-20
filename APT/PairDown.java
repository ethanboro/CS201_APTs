public class PairDown {
    public int[] fold(int[] list) {
        int[] nlist;
        if (list.length%2==1) {
            nlist = new int[list.length+1];
            for (int i = 0; i < list.length; i++) {
                nlist[i] = list[i];
            }
            nlist[list.length] = 0;
        }

        else {
            nlist = list;
        }

        int ret[] = new int[nlist.length/2];
        for (int i = 0; i< nlist.length; i+=2) {
            ret[i/2] = nlist[i] + nlist[i+1];
        }
 
        return ret;
    }
}