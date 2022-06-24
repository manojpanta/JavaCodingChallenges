package coding.challenges;

public class PermutationsRecursive {

    public static void permute(String s) {
        permute("", s);
    }

    public static void main(String[] args) {
        permute("ABC");
    }

    private static void permute(String prefix, String remaining) {
        if(remaining.length() == 0) {
            System.out.println(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            permute(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1, remaining.length()));
        }


    }


}
