package review.otherFiles;

import java.util.Scanner;

import review.otherFiles.BhaskaraEntity;

public class BhaskaraApp {

    public static void main (String[] args) {

        ourMainApplication();

    }

    private static void ourMainApplication () {

        Scanner init = new Scanner (System.in);

        double valueA = validateDoubleInputs(init);

        double valueB = validateDoubleInputs(init);

        double valueC = validateDoubleInputs(init);

        BhaskaraEntity values = new BhaskaraEntity(valueA, valueB, valueC);

        values.deltaCalculus(valueA, valueB, valueC);

        values.bhaskaraFirstValueCalculus(valueA, valueB);

        values.bhaskaraSecondValueCalculus(valueA, valueC);

    }

    private static boolean analyzeDoubleInputs (Scanner init) {
        return init.hasNextDouble();
    }

    private static double validateDoubleInputs (Scanner init) {

        while (!analyzeDoubleInputs(init)) {

            System.out.println("Enter numerical (double) values!");
            init.next();

        }

        return init.nextDouble();
    }

}
