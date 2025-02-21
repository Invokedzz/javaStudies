package content.POO.application;

import content.POO.entity.Destroy;

import java.util.Scanner;

import java.util.Locale;

public class Construct {

    public static void main (String[] args) {

        Locale.setDefault(Locale.GERMAN);

        thinkAboutIt();

    }

    public static void thinkAboutIt () {

        Scanner initScanner = new Scanner (System.in);

        String receiveName = initScanner.next();

        double addToValue = initScanner.nextDouble();

        double totalValue = initScanner.nextDouble();

        Destroy ourProduct = new Destroy (receiveName, addToValue, totalValue);

        boolean receiveBoolean = analyzeValues(receiveName, addToValue, totalValue);

        System.out.println(ourProduct);

        System.out.println(receiveBoolean);

    }

    public static boolean analyzeValues (String name, double addToValue, double totalValue) {

        if (name.length() < 3) {
            System.out.println("Insert a valid name");
            return false;
        }

        if (addToValue <= 0 || totalValue <= 0) {
            System.out.println("Insert a measure bigger than 0");
            return false;
        }

        return true;

    }

}
