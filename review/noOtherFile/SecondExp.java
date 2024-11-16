package review.noOtherFile;

import java.util.Scanner;

public class SecondExp {

    public static void main (String[] args) {

        startProject();

    }

    public static void startProject () {

        Scanner initSc = new Scanner(System.in);

        System.out.println("Enter with a number (int)");

        double switchValue = validateScannerInput(initSc);

        switch ((int) switchValue) {

            case 1:
                System.out.println("1");
                break;

            case 2:
                System.out.println("2");
                break;

            case 3:
                System.out.println("3");
                break;

            case 4:
                System.out.println("4");
                break;

        }

    }

    public static boolean checkScannerInput (Scanner input) {
        return input.hasNextInt();
    }

    public static int validateScannerInput (Scanner init) {

        while (!checkScannerInput(init)) {

            System.out.println("Enter something valid!");

            init.next();

        }

        return init.nextInt();

    }

}
