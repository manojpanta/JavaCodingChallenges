package coding.challenges;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    private static int longestSubstringWithoutRepeatingCharacters(String s) {
        int index1 = 0;
        int index2 = 0;
        int maxSubstring = 0;
        Set<Character> hashSet = new HashSet<Character>();
        while(index2 < s.length()) {
            if(!hashSet.contains(s.charAt(index2))) {
                hashSet.add(s.charAt(index2));
                index2 ++;
                maxSubstring = Math.max(maxSubstring, hashSet.size());
            } else {
                hashSet.remove(s.charAt(index1));
                index1 ++;
            }
        }
        return maxSubstring;
    }

    public static void main(String[] args) {
        System.out.println(longestSubstringWithoutRepeatingCharacters("abcdef")); //6
        System.out.println(longestSubstringWithoutRepeatingCharacters("abcda")); //4
        System.out.println(longestSubstringWithoutRepeatingCharacters("abcabc")); //3
        System.out.println(longestSubstringWithoutRepeatingCharacters("aabbcc")); //2
        System.out.println(longestSubstringWithoutRepeatingCharacters("a")); //2
    }
}