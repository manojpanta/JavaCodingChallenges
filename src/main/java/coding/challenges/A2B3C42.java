package coding.challenges;

public class A2B3C42 {

    public static void main(String[] args) {
//        given a String aabbccddaa return a string a2b2c2d2a2
        System.out.println(solution("ab"));//prints a1b1
        System.out.println(solution("aabb"));//prints a2b2
        System.out.println(solution("aaabbaa"));//prints a3b2a2
    }

    private static String  solution(String s) {
        int i = 0;
        String subString = "";
        while(i < s.length()) {
            int counter = 1;
            while(i < s.length() - 1 && s.charAt(i) == s.charAt(i + 1)) {
                counter ++;
                i ++;
            }
            subString += Character.toString(s.charAt(i)) + counter;
            i = i + 1;
        }
        return  subString;

    }
}