package arrays.matrix;

import java.util.Scanner;

public class MatrixExercise {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        int n = init.nextInt();

        int m = init.nextInt();

        int [][] matrix = new int[n][m];

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j <= n; j++) {

                matrix[i][j] = init.nextInt();

            }
        }

        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j <= n; j++) {

                System.out.println(matrix[i][j]);

            }
        }

    }

}
