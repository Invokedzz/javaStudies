package superMarket.application;

import java.util.Scanner;

import superMarket.entities.MarketEntity;

import java.util.Locale;

import java.util.ArrayList;

import java.util.List;

public class MainApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.CHINESE);

        ourMarketPlace();

    }

    private static void ourMarketPlace () {

        Scanner initSc = new Scanner(System.in);

        List <MarketEntity> list = new ArrayList<>();

        System.out.println("Enter the products qty: ");

        int productsQty = validateSentInteger(initSc);

        Integer [] controlLoop = new Integer[productsQty];

        for (int i = 0; i < controlLoop.length; i++) {

            System.out.printf("Enter the product name: #%s \n", i + 1);

            String productName = initSc.next();

            System.out.println("Enter with the product id: ");

            Integer productId = validateSentInteger(initSc);

            System.out.println("Enter with the product price: ");

            Double productPrice = validateSentDouble(initSc);

            MarketEntity product = new MarketEntity(productName, productId, productPrice);

            list.add(product);

            System.out.println(list);

        }

    }

    private static boolean verifyInteger (Scanner init) {
        return init.hasNextInt();
    }

    private static boolean verifyDouble (Scanner init) {
        return init.hasNextDouble();
    }

    private static Double validateSentDouble (Scanner init) {

        while (!verifyDouble(init)) {
            System.out.println("Enter a valid/numerical value!");
            init.next();
        }

        return init.nextDouble();

    }

    private static Integer validateSentInteger (Scanner init) {

        while (!verifyInteger(init)) {
            System.out.println("Enter a valid/numerical value!");
            init.next();
        }

        return init.nextInt();

    }

}
