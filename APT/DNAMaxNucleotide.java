import java.util.ArrayList;
import java.util.Collections;

public class DNAMaxNucleotide {
    public String max(String[] strands, String nuc) {
        Character ntide = nuc.charAt(0);
        int storec = 0;
        String store_str = "";
        for (int i = 0; i< strands.length; i++) {
            int counter = 0;
            for (int j = 0; j < strands[i].length(); j++){
                char c = strands[i].charAt(j);
                if (c == ntide) {
                    counter ++;
                }
        }

        if (counter > storec) {
            store_str = strands[i];
            storec = counter;
        }

        if (counter == storec) {
            if (strands[i].length() > store_str.length()) {
                store_str = strands[i];
                storec = counter;
            }
        }
    }
    if (storec == 0) {
        return "";
    }
    return store_str;
    
    
    }
}