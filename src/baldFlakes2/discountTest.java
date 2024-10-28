package src.baldFlakes2;

import java.util.Scanner;

public class discountTest {

    public static void main (String[] args) {

        discount(args);

    }

    public static void discount (String[] args) {

        Scanner initializeScanner = new Scanner (System.in);

        double discount, merPrice, total;

        System.out.println("How much was your purchase?");

        merPrice = initializeScanner.nextDouble();

        if (merPrice < 100) {

            total = merPrice;

            System.out.printf("No discount for you today. The total of your purchase was: R$%s", total);

        }

        if (merPrice >= 100 && merPrice <= 200) {

            discount = merPrice * 0.05;

            total = merPrice - discount;

            System.out.printf("The total of your purchase was: R$%s", total);

        }

        if (merPrice > 200) {

            discount = merPrice * 0.1;

            total = merPrice - discount;

            System.out.printf("The total of your purchase was: R$%s", total);

        }

    }

}
