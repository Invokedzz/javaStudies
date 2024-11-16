package review.noOtherFile;

import java.util.Scanner;

import java.util.Locale;

public class FirstExp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.TAIWAN);

        initProject();

    }

    public static void initProject () {

        Scanner init = new Scanner (System.in);

        double minQty, maxQty, totalQty;

        textsMinimum();

        minQty = init.nextDouble();

        System.out.println("Enter the max qty");

        maxQty = init.nextDouble();

        totalQty = maxQty + minQty / 2;

        System.out.println(totalQty);

    }

    public static void textsMinimum () {

        System.out.println("Enter the min qty");

    }

    public st

}
