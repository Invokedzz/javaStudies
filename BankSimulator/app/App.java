package BankSimulator.app;

import BankSimulator.entities.Bank;

import BankSimulator.entities.UserAccount;

import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        initProgram();

    }

    private static void initProgram () {

        Scanner init = new Scanner (System.in);

        int selectAnOption = init.nextInt();

        optionsForUser(selectAnOption);

    }

    private static void optionsForUser (int selectAnOption) {

        System.out.println("Main menu: ");

        switch (selectAnOption) {

            case 1:

                double getElement = UserAccount.getInitialValue();

                System.out.println(getElement);

                break;

            case 2:


        }

    }

}
