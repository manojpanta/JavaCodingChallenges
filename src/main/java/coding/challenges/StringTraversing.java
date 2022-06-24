package coding.challenges;

import java.util.ArrayList;
import java.util.List;

public class StringTraversing {

    public static int findComb(String t, String s) {
        List<String> strgs = new ArrayList<>();
        for (int i = 0; i <t.length() ; i++) {
            String ss = "";
            int j = i;
            while(j < t.length() && j - i <= 4) {
                ss += String.valueOf(t.charAt(j));
                j += 2;
            }
            strgs.add(ss);
        }
        int count = 0;
        for (String ss: strgs
             ) {
            if(ss.equals(s)) {
                count += 1;
            }
        }
        return count;

    }
    public static void main(String[] args) {
        System.out.println(findComb("azcabcab", "acb"));
    }
}
