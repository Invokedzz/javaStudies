package src.baldFlakes2;

import java.util.Scanner;

public class eighthTest {

    public static void main (String[] args) {

        eTest(args);

    }

    public static void eTest (String[] args) {

        Scanner init = new Scanner(System.in);

        double cash, taxValue;

        cash = init.nextDouble();

        if (cash <= 2000) System.out.println("Nothing");

        else if (cash > 2000 && cash <= 3000) {

            taxValue = (cash * 8) / 100;

            System.out.println(taxValue);

        }

        else if (cash > 3000 && cash <= 4500) {

            taxValue = (cash * 18) / 100;

            System.out.println(taxValue);

        }

        else if (cash > 4500) {

            taxValue = (cash * 28) / 100;

            System.out.println(taxValue);

        }

        else System.out.println("Die plague");

    }

}
