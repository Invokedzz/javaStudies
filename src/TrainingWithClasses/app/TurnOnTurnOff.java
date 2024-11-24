package src.TrainingWithClasses.app;

import src.TrainingWithClasses.entities.TurnOnTurnOffEntity;

import java.util.Scanner;

import java.util.Locale;

public class TurnOnTurnOff {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        mainFunctionalities();

    }

    private static void mainFunctionalities () {

        TurnOnTurnOffEntity device = new TurnOnTurnOffEntity();

        Scanner init = new Scanner(System.in);

        System.out.println("Welcome to the Chronos Network!");

        System.out.println("Let's turn on your device!");

        device.turnOnOurDevice();

        System.out.println("Want to turn off your device?");

        char userResponse = init.next().charAt(0);

        usersAnswersPath(userResponse, device);

    }

    private static void usersAnswersPath (char response, TurnOnTurnOffEntity device) {

        if (response == 'y' || response == 'Y') device.turnOffOurDevice();

        else System.out.println("Device working...");

    }

}
