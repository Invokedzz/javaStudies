package POO.applicationTwo;

import java.util.Scanner;

import java.util.Locale;

import POO.entitiesTwo.AccountEntity;

public class ApplicationAccount {

    public static void main (String[] args) {

        Locale.setDefault(Locale.GERMAN);

        mainApplicationForAccount();

    }

    public static void mainApplicationForAccount () {

        Scanner initScanner = new Scanner (System.in);

        System.out.println("Enter the account number: ");

        int defineAccountNumber = initScanner.nextInt();

        System.out.println("Enter your username: ");

        String defineAccountUsername = initScanner.next();

        char userDecision = initScanner.next().charAt(0);

        AccountEntity elementForAccountClass = new AccountEntity(defineAccountUsername, );


    }

}
