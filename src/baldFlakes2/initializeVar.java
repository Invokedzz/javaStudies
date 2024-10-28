package src.baldFlakes2;

import java.util.Scanner;

public class initializeVar {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        double discount, price;

        discount = 0.0;

        price = init.nextDouble();

        if (price >= 500.00) discount = price * 0.1;

        System.out.println(discount);

        moreTests(args);

    }

    public static void moreTests (String[] args) {

        Scanner anotherOne = new Scanner (System.in);

        double anotherPrice;

        anotherPrice = anotherOne.nextDouble();

        if (anotherPrice >= 200.0) {

            double discount = anotherPrice - 50.0;

            System.out.println(discount);

        }

    }

}
