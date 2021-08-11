package coding.challenges;

public class A2B3C4 {

    public static void main(String[] args) {
//        given a String aabbccddaa return a string a2b2c2d2a2
        System.out.println(solution("ab"));//prints a1b1
        System.out.println(solution("aabb"));//prints a2b2
        System.out.println(solution("aabbaa"));//prints a2b2a2
    }

    private static String  solution(String s) {
        char [] characters = s.toCharArray();
        int i = 0;
        String ss = "";
        while(i < characters.length) {
            int counter = 1;
            while(i < characters.length - 1 && characters[i] == characters[i + 1]) {
                counter ++;
                i ++;
            }
            ss += Character.toString(characters[i]) + counter;
            i = i + 1;
        }
        return  ss;

    }
}
