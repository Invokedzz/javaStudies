package chronos.app;

import chronos.entities.ChronosEntity;

import java.util.Scanner;

import java.util.Locale;

public class ChronosApp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        mainChronosFunction ();

    }

    private static void mainChronosFunction () {

        ChronosEntity product = new ChronosEntity();

        Scanner init = new Scanner(System.in);

        long initialValue = init.nextLong();

        product.chronosEngine(initialValue);

    }

}
