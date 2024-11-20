public class Gravity {
    public double falling(double time, double velo){
        double d = velo*time + 4.9 * time * time;
        return d;
      }
    
}
