package logicExercises.testingClasses.application;

import logicExercises.testingClasses.entities.InfoEntity;

import java.util.Scanner;

import java.util.Locale;

public class ReceiveInfo {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        userCommands();

    }

    public static void userCommands () {

        InfoEntity receiveClassInfoEntity = new InfoEntity();

        Scanner initSc = new Scanner (System.in);

        receiveClassInfoEntity.productName = initSc.nextLine();

        receiveClassInfoEntity.totalPrice = initSc.nextInt();

        char userDecision = initSc.next().charAt(0);

        userOptions(userDecision);

        initSc.close();

    }

    public static void userOptions (char validOption) {

        Scanner initSc = new Scanner (System.in);

        InfoEntity receiveUserInputsAgain = new InfoEntity();

        if (validOption == 'y') {

            System.out.println("Okay. Insert the measures for the new stock");

            receiveUserInputsAgain.totalStock = initSc.nextInt();

            int newStock = initSc.nextInt();

            int receivedValues = receiveUserInputsAgain.incrementStock(newStock);

            System.out.printf("New stock: %s", receivedValues);
            

        }

        else if (validOption == 'n') System.out.println("Okay. Bye then");

        else System.out.println("Error");

        initSc.close();

    }

}
