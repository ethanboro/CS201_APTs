public class AccessLevel {
    public String canAccess(int[] rights, int minPermission) {
        String ret = "";
        for (int val: rights){
            String x = "A";
            if (val < minPermission){
                x = "D";
            
            }
            ret +=x;
        }
        return ret; 
    }
 }
