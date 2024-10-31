package src.trainingFunctions.List;

import java.util.Scanner;

public class FunctionsList {

    public static void main (String[] args) {

        Scanner scInit = new Scanner (System.in);

        int disposedByUser = scInit.nextInt();

        insertValues(disposedByUser);

    }

    public static void insertValues (int initialValue) {

        int totalResult = 1;

        for (int valueZero = 1; valueZero <= initialValue; valueZero++) {

           int receiveValues = totalResult * valueZero;

           System.out.println(receiveValues);

           totalResult++;

        }


    }

}
