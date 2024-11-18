package review.otherFiles;

import java.util.Scanner;

import java.util.Locale;

import review.otherFiles.StoreEntity;

public class StoreApp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.TAIWAN);

        ourOwnStoreApp();

    }

    private static void ourOwnStoreApp () {

        Scanner initSc = new Scanner(System.in);

        int arrayParameter = initSc.nextInt();

        String [] productName = new String[arrayParameter];

        double [] productPrice = new double[arrayParameter];

        StoreEntity productMainClass = new StoreEntity(productName, productPrice);

        for (int i = 0; i < arrayParameter; i++) {

            System.out.println("Enter the product name: ");

            productName[i] = initSc.next();

            System.out.println("Enter the product value: ");

            productPrice[i] = initSc.nextDouble();

        }

        double average = 0.0;

        for (int y = 0; y < arrayParameter; y++) {

             average = productMainClass.valuesAddition(productPrice, y);

        }

        double totalResult = average / arrayParameter;

        System.out.println("Total: " + totalResult);

    }

}
