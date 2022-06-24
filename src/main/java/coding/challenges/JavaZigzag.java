package coding.challenges;

public class JavaZigzag {

    public static int [] zigzag(int[] arr) {
        boolean flag = true;
        int temp = 0;

        for (int i = 0; i < (arr.length - 1); i++) {
            if (flag) {
                if (arr[i] > arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            } else {
                if (arr[i] < arr[i + 1]) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            flag = !flag;
        }
        return arr;
    }

    public static void main(String[] args){
         int [] ints = { 4,0,1};
        for (int i : zigzag(ints)
             ) {
            System.out.println(i);

        }


    }

}
