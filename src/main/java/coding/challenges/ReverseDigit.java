package coding.challenges;

public class ReverseDigit {
    private static int reverseDigit(int i) {
        int toReturn = 0;
        while(i > 0) {
            int pop = i % 10;
            toReturn = (toReturn * 10) + pop;
            i = i /10;
        }
        return toReturn;
    }

    public static void main(String[] args) {
        System.out.println(reverseDigit(1234567890));
    }
}
