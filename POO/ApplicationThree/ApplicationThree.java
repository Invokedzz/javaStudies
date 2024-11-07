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

        System.out.println("Enter the ID: ");

        int carID = initSc.nextInt();

        System.out.println("Enter the car brand: ");

        String carBrand = initSc.next();

        System.out.println("Enter the car color: ");

        String carColor = initSc.next();

        returnInputValidators(carID, carBrand, carColor);

        System.out.println("Continue? ");

        char userDecision = initSc.next().charAt(0);

        if (userDecision == 'y') {

            System.out.println("Enter the price of the vehicle: ");

            double totalValue = initSc.nextDouble();

            System.out.println("Enter the total distance: ");

            double totalKm = initSc.nextDouble();

            returnNumericalValuesValidators(totalValue, totalKm);

            carInfo = new EntitiesThree(carID, carBrand, carColor, totalValue, totalKm);

        } else {

            carInfo = new EntitiesThree(carID, carBrand, carColor);

        }

        System.out.println(carInfo);

    }

    public static void returnInputValidators
            (int validateId, String carBrandValidate, String carColorValidate) {

        EntitiesValidator value = new EntitiesValidator();

        value.validatorID(validateId);

        value.validatorCarBrand(carBrandValidate);

        value.validatorCarColor(carColorValidate);

    }

    public static void returnNumericalValuesValidators (double totalValue, double totalKms) {

        EntitiesValidator value = new EntitiesValidator();

        value.validateBothValueAndKm(totalValue, totalKms);



    }

}
