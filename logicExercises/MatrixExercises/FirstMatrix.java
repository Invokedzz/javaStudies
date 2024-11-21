package logicExercises.MatrixExercises;

import java.util.Scanner;

public class FirstMatrix {

    public static void main (String[] args) {

        ourFirstMatrixApp();

    }

    private static void ourFirstMatrixApp () {

        Scanner init = new Scanner(System.in);

        int rows = init.nextInt();

        int column = init.nextInt();

        int [][] matrix = new int[rows][column];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = init.nextInt();
            }
        }

        System.out.println("Matrix: ");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println(matrix[i][j]);
            }
        }

    }

}
