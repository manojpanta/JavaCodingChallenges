package coding.challenges;

public class ReverseWordsInAStringII {

    private static void reverseWordsInaString(char[] chars) {
//        first reverse the whole array
//        reverse earch word using the i and j pointer where j pointer is moving to the right until it finds a space
//        after j pointer finds a space reverse characters from i to j and reset i next to j
        reverse(chars, 0, chars.length - 1);
        reverseEachWord(chars);
    }

    private static void reverseEachWord(char[] chars) {
        int n = chars.length;
        int i = 0, j =0;
        while(i < n) {
            while(j < n &&  chars[j] != ' '){
                j ++;
            }
            reverse(chars, i, j-1);
            j ++;
            i = j;
        }
        for (char c : chars) {
            System.out.println(c);
        }
    }
    public static void reverse(char [] s, int i, int j) {
        while(i < j) {
            char temp = s[i];
            s[i++] = s[j];
            s[j--] = temp;
        }
    }
    public static void main(String[] args) {
        reverseWordsInaString(new char[] {'M','A','N','O', 'J',' ','I','M',});
    }
//    Given a character array s, reverse the order of the words.
//
//    A word is defined as a sequence of non-space characters. The words in s will be separated by a single space.
//
//    Your code must solve the problem in-place, i.e. without allocating extra space.
//
//    Constraints:
//
//            1 <= s.length <= 105
//    s[i] is an English letter (uppercase or lowercase), digit, or space ' '.
//    There is at least one word in s.
//    s does not contain leading or trailing spaces.
//    All the words in s are guaranteed to be separated by a single space.

}
