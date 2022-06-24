package coding.challenges;

import java.util.Optional;

public class OptionalPr {

    public static Optional<String> returnString(int i, int j) {
        Optional<String> s = Optional.empty();
        if(i == j){
            s = Optional.of("string");
        } else {
            s = null;
        }
        return s;
    }
    public static String main1() {
        Optional<String> s = returnString(3, 3);
        if(s.isPresent()){
            return stringPlusHyphon(s.get());
        }
        s.ifPresent(d -> { stringPlusHyphon(s.get());});
        return null;
    }

    public static String stringPlusHyphon(String s ) {
        return s + "_";
    }

    public static void main(String[] args) {
        System.out.println(main1());
    }
}
