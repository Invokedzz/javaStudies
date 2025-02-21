package content.POO.AppFour;

import java.util.Scanner;

import java.util.Locale;

import content.POO.EntityFour.EntityFour;

public class AppFour {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveGasValues();

    }

    public static void receiveGasValues () {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Enter the vehicle name: ");

        String vehicleName = initSc.next();

        double literTotal = 0.0;

        EntityFour product = new EntityFour(vehicleName, literTotal);

        System.out.println("Enter the liters you want to add: ");

        double totalLiters = initSc.nextDouble();

        product.addGasAfterATrip(totalLiters);

        System.out.println("After doing a travel... enter the total kms");

        double totalKms = initSc.nextDouble();

        product.useGasInATrip(totalLiters, totalKms);

        System.out.println(product);

    }

}
