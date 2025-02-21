package content.logicExercises.MatrixExercises;

import java.util.Scanner;

public class MatrixPosition {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        int rows = init.nextInt();

        int columns = init.nextInt();

        int [][] matrix = new int[rows][columns];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = init.nextInt();
            }
        }

        int x = init.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {

                if (matrix[i][j] == x) {

                    if (i > 0) System.out.println(matrix[i - 1][j]);

                    if (j > 0) System.out.println(matrix[i][j - 1]);

                    if (i < matrix[i].length - 1) System.out.println(matrix[i + 1][j]);

                    if (i < matrix.length - 1) System.out.println(matrix[i][j + 1]);


                }

            }
        }

    }

}
