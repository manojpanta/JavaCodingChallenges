package coding.challenges;

import java.util.HashMap;
import java.util.Map;

public class Anagram {


    private static boolean anagram(String s1, String s2) {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i <s1.length() ; i++) {
            if(map.containsKey(s1.charAt(i))) {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) + 1);
            } else {
                map.put(s1.charAt(i), 1);
            }
        }
        for (int i = 0; i <s2.length() ; i++) {
            if(!map.containsKey(s2.charAt(i))) {
                return  false;
            } else {
                map.put(s1.charAt(i), map.get(s1.charAt(i)) -1);
            }
        }
        for (Integer i: map.values()
             ) {
            if(i != 0) {
                return false;
            }
        }
        return  true;
    }
    public static void main(String[] args) {
        System.out.println(anagram("manojmaaa", "jonammaaa"));
    }
}
