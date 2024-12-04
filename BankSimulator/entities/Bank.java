package BankSimulator.entities;

import BankSimulator.entities.UserAccount;

import java.util.Scanner;

public class Bank {

    private final String bankName;

    private final int bankPIN;

    private final UserAccount userElements;

    public Bank (String bankName, int bankPIN, UserAccount userElements) {

        this.bankName = bankName;

        this.bankPIN = bankPIN;

        this.userElements = userElements;

    }

    public double depositSomeValue (double value, Scanner init) {

        double getInitialValue = UserAccount.getInitialValue();

        return getInitialValue + value;

    }

    public double withdrawSomeValue (double value, Scanner init) {

        double getInitialValue = UserAccount.getInitialValue();

        while (value > getInitialValue) {

            System.out.println("Enter a valid value!");

            value = init.nextDouble();

        }

        return getInitialValue - value;

    }

    @Override
    public String toString () {

        return "Bank: " + bankName
                + " Bank PIN: " + bankPIN
                + userElements;

    }

}
