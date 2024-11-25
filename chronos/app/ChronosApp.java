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

    private static void startChronosEngine () throws InterruptedException {

        Scanner initScanner = new Scanner(System.in);

        System.out.println("Do you want to start Chronos?");

        char userCommand = initScanner.next().charAt(0);

        chronosControl(userCommand);

        chronosOptions(initScanner);

    }

    private static void chronosOptions (Scanner initScanner) throws InterruptedException {

        System.out.println("Select an option!");

        int selectOption = initScanner.nextInt();

        switch (selectOption) {

            case 1:
                chronosChronometerControl(initScanner);

            case 2:
                displayDateToUserWithChronos();

            case 3:
                displayTimeToUserWithChronos();

            default:
                
        }

    }

    private static void displayDateToUserWithChronos () {

    }

    private static void displayTimeToUserWithChronos () {

    }

    private static void chronosControl (char userInput) {

        if (userInput != 'y' && userInput != 'Y') {

            System.out.println("See ya!");

            return;

        }

        System.out.println("Welcome!");

    }

    private static void chronosChronometerControl (Scanner initScanner) throws InterruptedException {

        ChronosEntity chronos = new ChronosEntity();

        System.out.println("Turning on the chronometer \n");

        System.out.println("Select the time u want the chronometer to stop: ");

        int millisTime = initScanner.nextInt();

        chronos.startChronos();

        Thread.sleep(millisTime);

        chronos.pauseChronos();

        chronos.resetChronos();

    }

}
