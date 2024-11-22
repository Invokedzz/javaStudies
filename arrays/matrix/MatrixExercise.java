package arrays.matrix;

import java.util.Scanner;

public class MatrixExercise {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        int n = init.nextInt();

        int m = init.nextInt();

        int [][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                matrix[i][j] = init.nextInt();

            }
        }

            for (int i = 0; i < matrix.length; i++) {

                for (int j = 0; j < matrix[i].length; j++) {


                    System.out.println(matrix[i][j]);

            }
        }

        int incrementSomeValue = 0;

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] < 0) {

                    incrementSomeValue++;
                    System.out.println(incrementSomeValue);

                }

            }

        }

    }

}
