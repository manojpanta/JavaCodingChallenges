package coding.challenges;

import java.util.Arrays;

public class BakaMarch25 {

    public static int[] different(int[] arr1, int[] arr2) {
        int [] returnArray;
        if(arr1.length == 0 || arr2.length == 0) {
            return new int[0];
        }
        if(arr1.length < arr2.length) {
            returnArray = new int[arr1.length];
        } else {
            returnArray = new int[arr2.length];
        }
        for (int i = 0; i < returnArray.length; i++) {
            if(arr1[i] == arr2[i]) {
                returnArray[i] = 0;
            } else {
                returnArray[i] = 1;
            }
        }
        return returnArray;
    }

    public static void main(String[] args) {
        int[] array1 = {2, 4};
        int[] array2 ={};
        int[] result = different(array1,array2);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);

        }

//        result = {1, 0, 1, 1, 0};
//        array1 = {2, 4, 5, 7, 3, 5, 7, 88}
//        array2 = {8, 4, 3, 0, 3};

//        int[] array1 = {8, 3, 7};
//        int[] array2 = {8, 9, 7, 9, 4};
//        int[] result = different(array1,array2);
//
//
//        result = {0, 1, 0}
//        array1 = {8, 3, 7}
//        array2 = {8, 9, 7, 9, 4}
//
//        int[] array1 = {2, 4};
//        int[] array2 = {};
//        int[] result = different(array1, array2);
//
//        result = {}
//        array1 = {2, 4}
//        array2 = {}
    }
}
