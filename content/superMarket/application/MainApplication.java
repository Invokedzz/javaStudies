package content.superMarket.application;

import java.util.Scanner;

import content.superMarket.entities.MarketEntity;

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

            while (findIdOfTheProduct(list, productId)) {

                System.out.println("Enter with a valid id!");
                productId = validateSentInteger(initSc);

            }

            System.out.println("Enter with the product price: ");

            Double productPrice = validateSentDouble(initSc);

            MarketEntity product = new MarketEntity(productName, productId, productPrice);

            list.add(product);

            System.out.println(list);

        }

        System.out.println("Enter here which product should have a discount: ");

        Integer receiveProductId = validateSentInteger(initSc);

        MarketEntity product = list.stream()
                .filter(x -> x.getProductId() == receiveProductId)
                .findFirst().orElse(null);

        if (productPosition(list, receiveProductId) != null) {

            System.out.println("Enter a percentage for the discount: ");

            Double discount = validateSentDouble(initSc);

            System.out.println(product.addDiscount(discount));

        } else System.out.println("Enter with a proper id!");


    }

    private static boolean findIdOfTheProduct (List<MarketEntity> list, Integer productId) {
        MarketEntity value = list.stream()
                .filter(x -> x.getProductId() == productId)
                .findFirst().orElse(null);

        return value != null;
    }

    private static Integer productPosition (List<MarketEntity> list, Integer productId) {

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getProductId() == productId) return i;
        }

        return null;

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
