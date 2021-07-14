package coding.challenges;

public class ArraySort {

//    sort an array without allocating an extra space;
    private static int[] arraySort(int[] ints) {
//        swap indices with bigger numbers to the right hand side
        for (int i = 0; i < ints.length; i++) {
            for (int j = i + 1; j < ints.length ; j++) {
                if(ints[i] > ints[j]) {
                    int temp = ints[i];
                    ints[i] = ints[j];
                    ints[j] = temp;
                }
            }
        }
        return  ints;
    }

    public static void main(String[] args) {
        for (int i : arraySort(new int[] { 6, 7, 0, 23, 2, 1, 345})) {
            System.out.println(i);
        }
    }
}
