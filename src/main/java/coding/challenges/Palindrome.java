package coding.challenges;

public class Palindrome {
    private static boolean isPalindrome(String s) {
//        have a pointer at the beginning and at the end.
//        compare those characters as we move pointers towards each other i.e. i ++, j --
//        skip all the spaces.
//        handle the case where input is just an empty string
//        ignore cases
        int i = 0;
        int j = s.length() -1;
        if(s.length() == 0 || s == null || s == " ") {
            return  false;
        }
        while(i < j) {
            while(i < j && s.charAt(i) == ' ') {
                i ++;
            }
            while (i < j && s.charAt(j) == ' ') {
                j --;
            }
            if(i == j) { // in case the input string is empty string return false;
                return  false;
            }
            if(Character.toLowerCase(s.charAt(i++)) != Character.toLowerCase(s.charAt(j--))) {
                return  false;
            }
        }
        return  true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("Racecar")); //returns true // in this case the middle character e will never be compared as i < j needs to be true  for the comparision.
        System.out.println(isPalindrome("       Racecar  ")); //returns true
        System.out.println(isPalindrome("          Racecar  ")); //returns true
        System.out.println(isPalindrome("ab  ba")); //returns true
        System.out.println(isPalindrome(" ")); //returns false
        System.out.println(isPalindrome("           ")); //returns false
    }
}
