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

        measureForVector = callScanner.nextInt();

        int [] vectorList = new int[measureForVector];

        displayTextForUserAgain();

        switchMeasure = callScanner.nextInt();

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

    }

    private static void oddValuesDisplay (int[] vectorList) {

    }

    private static void displayTextForUser () {

        System.out.println("Enter a measure for vectors");

    }

    private static void displayTextForUserAgain () {

        System.out.println("Enter a measure for the switch/case");

    }

}
