import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MemberCheck {
    public String[] removeDups(String[] club) {
        Set<String> uniqueElements = new LinkedHashSet<>();
        for (String name : club) {
            uniqueElements.add(name);
        }
    
        // Create a result array and populate it with unique elements
        String[] result = new String[uniqueElements.size()];
        int index = 0;
        for (String uniqueName : uniqueElements) {
            result[index++] = uniqueName; // Populate the array
        }
    
        return result;
    }
    public String[] whosDishonest(String[] club1, String[] club2, String[] club3) {                                


    String[] club1s = removeDups(club1);
    String[] club2s = removeDups(club2);
    String[] club3s = removeDups(club3);


    System.out.println(club1.getClass().getSimpleName());

    String[][] clubList = {club1s, club2s, club3s};
    HashMap<String, Integer> members = new HashMap<>();
    Set<String> dishonest = new HashSet<>();  
    

    for (String[] club: clubList) {
        for (String name : club) {
            //int value = members.get(name);
            if (members.containsKey(name)) {
                dishonest.add(name);
            }
            else {
                members.put(name, 0);
            }
        }
    }
    String[] f = dishonest.toArray(new String[0]);
    Arrays.sort(f);
    return f;
    
 }

}