package coding.challenges;

public class ReverseWordsInAString {
    private static String reverseWords(String s) {
        int index1  = 0;
        String toReturn = "";
        while(index1 < s.length()) {
//            move the index1 until a character is found
            while(index1 < s.length() && !Character.isLetterOrDigit(s.charAt(index1))){
                index1 ++;
            }
            int index2 = index1;
//            move the index2 until it finds either end or space
            while(index2 < s.length() && Character.isLetterOrDigit(s.charAt(index2))){
                index2 ++;
            }
            if(index1  == s.length()) {
                return toReturn;
            }
            String sub = s.substring(index1, index2);
            if(toReturn.length() == 0){
                toReturn = sub;
            } else {
                toReturn = sub + " " + toReturn;
            }
            index1 = index2 + 1;
        }
        return toReturn;
    }

    public static void main(String[] args) {
//        System.out.println(reverseWords("Manoj is name My")); //returns "My name is Manoj"
//        System.out.println(reverseWords("Manoj     is name My")); //returns "My name is Manoj"
//        System.out.println(reverseWords("     Manoj is name My       ")); //returns "My name is Manoj"
    }
}