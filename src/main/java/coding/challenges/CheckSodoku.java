package coding.challenges;

import java.util.*;

public class CheckSodoku {

    public static void main(String[] args) {
        checkSodoku();
    }

    public static boolean checkSodoku() {
        int[][] sodoku = {
                {1, 9, 8, 7, 6, 5, 4, 3, 2},
                {2, 1, 9, 8, 7, 6, 5, 4, 3},
                {3, 2, 1, 9, 8, 7, 6, 5, 4},
                {4, 3, 2, 1, 9, 8, 7, 6, 5},
                {5, 4, 3, 2, 1, 9, 8, 7, 6},
                {6, 5, 4, 3, 2, 1, 9, 8, 7},
                {7, 6, 5, 4, 3, 2, 1, 9, 8},
                {8, 7, 6, 5, 4, 3, 2, 1, 9},
                {9, 8, 7, 6, 5, 4, 3, 2, 1}
        };

        Map<Integer, int[]> columns = new HashMap<>();
        columns.put(1, new int[9]);
        columns.put(2, new int[9]);
        columns.put(3, new int[9]);
        columns.put(4, new int[9]);
        columns.put(5, new int[9]);
        columns.put(6, new int[9]);
        columns.put(7, new int[9]);
        columns.put(8, new int[9]);
        columns.put(9, new int[9]);

        int k = 1;
        for (int i = 0; i < sodoku.length; i++) {
            Set<Integer> currentRow = new HashSet<>();
            for (int j = 0; j < sodoku[i].length; j++) {
                int currNumber = sodoku[i][j];
                int[] currentCol = columns.get(j + 1);
                boolean currentColumnContainsCurrNumber = currentCol[0] == currNumber;
                if (!currentRow.contains(currNumber) && !currentColumnContainsCurrNumber) {
                    currentRow.add(sodoku[i][j]);
                    columns.get(j + 1)[i] = sodoku[i][j];
                    k ++;
                } else {
                    System.out.println("No Sodoku");
                    return false;
                }
            }
        }
        System.out.println("It was sodoku");

        return true;
    }

}
