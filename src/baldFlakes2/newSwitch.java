package src.baldFlakes2;

import java.util.Scanner;

public class newSwitch {

    public static void main (String[] args) {

        Scanner initScanner = new Scanner(System.in);

        int valueReceivedByUser;

        double receiveValues;

        double valueA, valueB;

        System.out.println("(1) -> addition, (2) -> subtraction, (3) -> multiplication, (4) -> Division");

        valueReceivedByUser = initScanner.nextInt();

        valueA = initScanner.nextDouble();

        valueB = initScanner.nextDouble();

        switch (valueReceivedByUser) {

            case 1:
                receiveValues = valueA + valueB;
                break;

            case 2:
                receiveValues = valueA - valueB;
                break;

            case 3:
                receiveValues = valueA * valueB;
                break;

            case 4:
                receiveValues = valueA / valueB;
                break;

            default:
                receiveValues = 0.0;
                break;
        }

        System.out.println(receiveValues);

    }

}
