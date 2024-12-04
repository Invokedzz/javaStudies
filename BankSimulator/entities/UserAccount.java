package BankSimulator.entities;

public class UserAccount {

    private String username;

    private int accountPin;

    private static double initialValue;

    public UserAccount (String username, int accountPin, double initialValue) {

        this.username = username;

        this.accountPin = accountPin;

        UserAccount.initialValue = initialValue;

    }

    public static double getInitialValue () {

        return initialValue;

    }

    @Override
    public String toString () {

        return " Username: " + username
                + " PIN: " + accountPin
                + " Deposit value: $" + initialValue;

    }

}
