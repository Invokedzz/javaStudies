package arrays;

import arrays.entities.SecondArrayEntity;

import java.util.Scanner;

import java.util.Locale;

public class SecondArrayPtTwo {

    public static void main (String[] args) {

        Locale.setDefault(Locale.KOREA);

        receiveValuesForLoops();

    }

    public static void receiveValuesForLoops () {

        Scanner initScanner = new Scanner (System.in);

        int valueReceivedForArrays = initScanner.nextInt();

        SecondArrayEntity [] vector = new SecondArrayEntity[valueReceivedForArrays];

        for (int i = 0; i < valueReceivedForArrays; i ++) {

            String productsName = initScanner.next();

            double productsValue = initScanner.nextDouble();

            vector[i] = new SecondArrayEntity(productsName, productsValue);

        }

        double totalResult = 0.0;

        for (int u = 0; u < valueReceivedForArrays; u ++) {

            totalResult += vector[u].getProductsValue();

        }

        double zzz = totalResult / valueReceivedForArrays;

        System.out.println(zzz);

    }

}
