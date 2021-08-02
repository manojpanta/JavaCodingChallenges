package coding.challenges;

import java.util.*;
import java.util.regex.*;


// Write your code here. DO NOT use an access modifier in your class declaration.
class Parser{
    public boolean isBalanced(String s){
        if(s.length() == 0) {
            System.out.println("true");
            return true;
        }
        int position = 0;
        int i = 0;
        int j = 0;
        while(position < s.length()) {
            if(s.charAt(position) == '{') {
                i ++;
                position ++;
            }else if (s.charAt(position) == '}') {
                i --;
                position ++;
            } else if(s.charAt(position) == '(') {
                j ++;
                position ++;
            } else if(s.charAt(position) == ')') {
                j --;
                position ++;
            }
        }
        if(i == 0 && j == 0 ) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}

class Solution {
	public static void main(String[] args) {
		Parser parser = new Parser();
		System.out.println(parser.isBalanced("{{(())}}"));
	}
}
