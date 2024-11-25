package chronos.app;

import chronos.entities.ChronosEntity;

import chronos.entities.ChronosDate;

import java.util.Scanner;

import java.util.Locale;

public class ChronosApp {

    public static void main (String[] args) throws  InterruptedException {

        Locale.setDefault(Locale.ITALIAN);

        startChronosEngine();

    }

    private static void startChronosEngine () {

        Scanner initScanner = new Scanner(System.in);

        System.out.println("Do you want to start Chronos?");

        char userCommand = initScanner.next().charAt(0);

        chronosControl(userCommand);

        chronosOptions(initScanner);

    }

    private static void chronosOptions (Scanner initScanner) {

        ChronosEntity chronos = new ChronosEntity();

        System.out.println("Select an option!");

        int selectOption = initScanner.nextInt();

        switch (selectOption) {

        }

    }

    private static void chronosControl (char userInput) {

        if (userInput != 'y' && userInput != 'Y') {

            System.out.println("See ya!");

            return;

        }

        System.out.println("Welcome!");

    }

}
