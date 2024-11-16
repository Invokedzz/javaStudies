package review.noOtherFile;

import java.util.Scanner;

import java.util.Locale;

public class FriendlyArray {

    public static void main (String[] args) {

        Locale.setDefault(Locale.TAIWAN);

        startProject();

    }

    private static void startProject () {

        Scanner callScanner = new Scanner(System.in);

        int measureForVector, switchMeasure;

        displayTextForUser();

        measureForVector = validateScannerInput(callScanner);

        int [] vectorList = new int[measureForVector];

        displayTextForUserAgain();

        switchMeasure = validateScannerInput(callScanner);

        switchCaseFunctionCall(switchMeasure, vectorList);

    }

    private static void switchCaseFunctionCall (int switchMeasure, int [] vectorList) {

        switch (switchMeasure) {

            case 1:
                loadVector(vectorList);
                break;

            case 2:
                evenValuesDisplay(vectorList);
                break;

            case 3:
                oddValuesDisplay(vectorList);
                break;

            default:
                System.out.println("Enter a valid number for this switch/case");
                break;
        }

    }

    private static void loadVector (int[] vectorList) {

        Scanner initSc = new Scanner (System.in);

        for (int i = 0; i < vectorList.length; i++) {

            vectorList[i] = initSc.nextInt();

        }

        for (int j : vectorList) {

            System.out.println(j);

        }

    }

    private static void evenValuesDisplay (int[] vectorList) {

        Scanner initSc = new Scanner (System.in);

        for (int i = 0; i < vectorList.length; i++) {

            vectorList[i] = initSc.nextInt();

            if (vectorList[i] % 2 == 0) System.out.println(vectorList[i]);

        }

    }

    private static void oddValuesDisplay (int[] vectorList) {

        Scanner initSc = new Scanner (System.in);

        for (int i = 0; i < vectorList.length; i++) {

            vectorList[i] = initSc.nextInt();

            if (vectorList[i] % 2 != 0) System.out.println(vectorList[i]);

        }

    }

    private static boolean returnScannerProperValue (Scanner input) {

        return input.hasNextInt();

    }

    private static int validateScannerInput (Scanner init) {

        while (!returnScannerProperValue(init)) {

                System.out.println("Enter valid measures");
                init.next();

        }

        return init.nextInt();

    }

    private static void displayTextForUser () {

        System.out.println("Enter a measure for vectors");

    }

    private static void displayTextForUserAgain () {

        System.out.println("Enter a measure for the switch/case");

    }

}
