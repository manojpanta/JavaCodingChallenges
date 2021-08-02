package coding.challenges;

public class LuckyNumber {
    public static void main(String[] args) {
        System.out.println(isLuckyNumber(1, 100));
    }
    private static int isLuckyNumber(int i, int h) {
        int counter = 0;
        while(i <= h) {
            int n = i;
            int counter6 = 0;
            int counter8 = 0;
            while(n > 0) {
                int pop = n % 10;
                if(pop == 6) {
                    counter6 ++;
                } else if( pop == 8) {
                    counter8 ++;
                }
                n = n /10;
            }
            if(counter6 >= 1 && counter8 >= 1){
            } else if(counter6 >= 1 || counter8 >= 1) {
                counter ++;
            }
            i ++;
        }
        return  counter;
    }
}
