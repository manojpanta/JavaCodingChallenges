package coding.challenges;

public class Anagram1 {

    public static boolean isAnagram(String s, String t) {
        if (s == null || t== null || (s.length() != t.length())) {
            return false;
        }

        byte[] count = new byte[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (byte b : count) {
            if (b != 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        System.out.println(isAnagram("Manoj", "jonam"));
    }
}
