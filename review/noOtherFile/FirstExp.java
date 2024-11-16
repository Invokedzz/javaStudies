package review.noOtherFile;

import java.util.Scanner;

import java.util.Locale;

public class FirstExp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.TAIWAN);

        initProject();

    }

    public static void initProject () {

        Scanner init = new Scanner (System.in);

        double minQty, maxQty, totalQty;

        textsMinimum();

        minQty = checkScannerInput(init);

        textsMaximum();

        maxQty = checkScannerInput(init);

        totalQty = (maxQty + minQty) / 2;

        System.out.println(totalQty);

    }

    public static boolean reviewScanner (Scanner value) {

        return value.hasNextDouble();

    }

    public static double checkScannerInput (Scanner input) {

        while (!reviewScanner(input)) {

            System.out.println("Enter valid values!");
            input.next(); // Clear the buffer. Otherwise the text loops infinitely

        }

        return input.nextDouble();

    }

    public static void textsMinimum () {

        System.out.println("Enter the min qty");

    }

    public static void textsMaximum () {

        System.out.println("Enter the max qty");

    }

}
