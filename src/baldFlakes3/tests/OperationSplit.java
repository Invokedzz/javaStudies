package src.baldFlakes3.tests;

import java.util.Scanner;

public class OperationSplit {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert some values (strings)");

        String receiveStringsValue = initSc.nextLine();

        String [] absorbValues = receiveStringsValue.split(" ");

        String firstValue = absorbValues[0];

        String secondValue = absorbValues[1];

        String thirdValue = absorbValues[2];

        System.out.println(firstValue + "\n");

        System.out.println(secondValue + "\n");

        System.out.println(thirdValue + "\n");

    }

}
