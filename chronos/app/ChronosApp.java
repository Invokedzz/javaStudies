package chronos.app;

import chronos.entities.ChronosEntity;

import java.util.Scanner;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

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

        chronosOptions();
        
    }

    private static void chronosOptions () {

        ChronosEntity chronos = new ChronosEntity();

    }

    private static void chronosControl (char userInput) {

        if (userInput != 'y' && userInput != 'Y') {

            System.out.println("See ya!");

            return;

        }

        System.out.println("Welcome!");

    }

}
