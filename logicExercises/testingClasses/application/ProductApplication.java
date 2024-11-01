package logicExercises.testingClasses.application;

import java.util.Scanner;

import java.util.Locale;

import logicExercises.testingClasses.entities.ProductEntity;

public class ProductApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveUserValues();

    }

    public static void receiveUserValues () {

        Scanner initSc = new Scanner (System.in);

       ProductEntity displayInfo = new ProductEntity();

        System.out.println("Enter the name of the product: \n");

        displayInfo.name = initSc.nextLine();

        System.out.println("Insert the product price: \n");

        displayInfo.price = initSc.nextInt();

        System.out.println("Insert the product quantity: \n");

        displayInfo.quantity = initSc.nextInt();

        System.out.printf("%s, %s and %s", displayInfo.name, displayInfo.price, displayInfo.quantity);

    }

    public static void displayInformationToUser () {

    }

}
