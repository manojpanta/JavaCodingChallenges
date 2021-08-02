package coding.challenges;

class LuckyNumberWithString {
    public static int find(long l, long h) {
        int counter = 0;
         while(l <= h) {
            String s = new Long(l).toString();
            int counter6 = 0;
            int counter8 = 0;
             for (int i = 0; i < s.length(); i++) {
                 if(s.charAt(i) == '6') {
                     counter6 ++;
                 }else if(s.charAt(i) == '8') {
                     counter8 ++;
                 }
             }
             if(counter6 >= 1 && counter8 >= 1){
             } else if(counter6 >= 1 || counter8 >= 1) {
                counter ++;
             }
            l ++;
         }
        return counter;
    }


    public static void main(String[] args) {
        System.out.println(find(667, 668));
    }
}