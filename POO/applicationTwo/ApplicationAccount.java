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

        AccountEntity account;

        System.out.println("Enter the account number: ");

        int defineAccountNumber = initScanner.nextInt();

        System.out.println("Enter your username: ");

        String defineAccountUsername = initScanner.next();

        System.out.println("Do you want to continue?");

        char userDecision = initScanner.next().charAt(0);

        if (userDecision == 'y') {

            System.out.println("Enter the initial value: ");

            double initialValue = initScanner.nextDouble();

            account = new AccountEntity(defineAccountUsername, defineAccountNumber, initialValue);

        } else {

            account = new AccountEntity(defineAccountUsername, defineAccountNumber);

        }

        System.out.println(account);


    }

}
