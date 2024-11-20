import java.util.*;

public class MedalTable {
    private class MedalCountry {
       
       String myName;
       int myGold;
       int mySilver;
       int myBronze;
       MedalCountry (String name) {
            myName = name;
       }
       public int getGold() {
            return myGold;
       }
       public int getSilver() {
            return mySilver;
       }
       public int getBronze() {
            return myBronze;
       }
       public String getName() {
            return myName;
       }
       public String toString() {
        return String.format("%s %d %d %d", myName, myGold, mySilver, myBronze);
       }

    }

    public String[] generate(String[] results) {
        Map<String, MedalCountry> map = new HashMap<>();
        for (String s: results) {
            String[] data = s.split(" ");
            for (String c : data) {
                if (!map.containsKey(c)) {
                    map.put(c, new MedalCountry(c));
                }
            }
            map.get(data[0]).myGold+=1;
            map.get(data[1]).mySilver+=1;
            map.get(data[2]).myBronze+=1;

        }
        ArrayList<MedalCountry> list = new ArrayList<>(map.values());
        Comparator<MedalCountry> goldComp = Comparator.comparing(MedalCountry::getGold);
        Comparator<MedalCountry> silverComp = Comparator.comparing(MedalCountry::getSilver);
        Comparator<MedalCountry> bronzeComp = Comparator.comparing(MedalCountry::getBronze);
        Comparator<MedalCountry> nameComp = Comparator.comparing(MedalCountry::getName);

        Collections.sort(list,nameComp);
        Collections.sort(list,bronzeComp.reversed());
        Collections.sort(list,silverComp.reversed());
        Collections.sort(list,goldComp.reversed());
        
        String[] ret = new String[list.size()];
        int i = 0;
        for (MedalCountry mc: list) {
            ret[i] = mc.toString();
            i++;
        }

        return ret;







    }
  }