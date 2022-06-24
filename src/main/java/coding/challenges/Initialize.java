package coding.challenges;

import java.sql.SQLOutput;
import java.util.*;
import java.util.function.Function;
import java.util.function.IntUnaryOperator;
import java.util.stream.Collectors;

public class Initialize {

    public static void main(String[] args) {
        String[] strings = {"One", "Two", "Three" };
        List<String> strings1 = new ArrayList<>();
        String[] sources = {"OneTwo", "OneTwoThree"};
        boolean [] toReturn = new boolean[sources.length];

        for (int i = 0; i < strings.length; i++) {
            String s = "";
            int j = 0;
            while(j <= i) {
                String ss = strings[j ++];
                s += ss;
            }
            strings1.add(s);
        }

        for (int i = 0; i <sources.length ; i++) {
            if(strings1.contains(sources[i])) {
                toReturn[i] = true;
            } else {
                toReturn[i] = false;
            }
        }
        
        for (boolean s: toReturn
             ) {

            System.out.println(s);

        }
    }

}



