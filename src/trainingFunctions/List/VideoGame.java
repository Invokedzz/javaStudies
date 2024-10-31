package src.trainingFunctions.List;

import java.util.Scanner;

public class VideoGame {

    public static void main (String[] args) {

        Scanner scInit = new Scanner (System.in);

        char userInput = scInit.next().charAt(0);

        chooseYourCharacter(userInput);

        scInit.close();

    }

    public static void chooseYourCharacter (char receiveData) {

        if (receiveData == 'M') System.out.println("Warrior");

        else if (receiveData == 'F') System.out.println("Mage");

        else System.out.println("Error");

    }

}
