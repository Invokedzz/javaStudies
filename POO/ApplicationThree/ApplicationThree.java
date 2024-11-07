package POO.ApplicationThree;

import java.util.Scanner;

import java.util.Locale;

import POO.EntitiesThree.EntitiesThree;

import POO.EntitiesThree.EntitiesValidator;

public class ApplicationThree {

    public static void main (String[] args) {

        Locale.setDefault(Locale.GERMAN);

        carPatterns();

    }

    public static void carPatterns () {

        EntitiesThree carInfo;

        Scanner initSc = new Scanner (System.in);

        int carID = initSc.nextInt();

        String carBrand = initSc.next();

        String carColor = initSc.next();

        char userDecision = initSc.next().charAt(0);

        if (userDecision == 'y') {

            double totalValue = initSc.nextDouble();

            double totalKm = initSc.nextDouble();

            carInfo = new EntitiesThree(carID, carBrand, carColor, totalValue, totalKm);

        } else {

            carInfo = new EntitiesThree(carID, carBrand, carColor);

        }

        System.out.println(carInfo);

    }

}
