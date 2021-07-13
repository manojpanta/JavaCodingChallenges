package coding.challenges;

import java.util.Arrays;

public class ReverseAString {
//    given an array of characters, return the array reversed without creating a second array
    private static char[] reverseString(char[] s) {
        int position = 0;
        int n = s.length;
//        swap position within the array
        char temp;
        for (int i = n-1; i >= n/2 ; i--) {
            temp = s[position];
            s[position] = s[i];
            s[i] = temp;
            position += 1;
        }
        return s;
    }

    public static void main(String[] args) {
        char [] string = new char[] {'j', 'o', 'n', 'a', 'm'};
        System.out.println(Arrays.toString(reverseString(string))); // prints M A N O J
        char [] string1 = new char[] {'o', 'n', 'a', 'm'};
        System.out.println(Arrays.toString(reverseString(string1))); // M A N O
    }
}
