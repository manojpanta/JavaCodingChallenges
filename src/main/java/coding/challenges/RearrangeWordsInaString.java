package coding.challenges;

public class RearrangeWordsInaString {

    public static void main(String[] args) {
        System.out.println(rearrange("z a b c d e f"));//expected: a b c d e f z
        System.out.println(rearrange("byte ascii double char even"));//expected: ascii byte char double even
    }

    private static String rearrange(String string) {
        String [] stringArray = string.split(" ");
        for (int j = 0; j < stringArray.length ; j++) {
            for (int k = 0; k < stringArray.length ; k++) {
                if(Character.toLowerCase(stringArray[k].charAt(0)) > Character.toLowerCase(stringArray[j].charAt(0))) {
                    String temp = stringArray[j];
                    stringArray[j] = stringArray[k];
                    stringArray[k] = temp;
                }
            }
        }

        return  String.join(" ", stringArray);
    }
}
