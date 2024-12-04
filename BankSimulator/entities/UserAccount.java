package BankSimulator.entities;

public class UserAccount {

    private String username;

    private int accountPin;

    private double initialValue;

    public UserAccount (String username, int accountPin, double initialValue) {

        this.username = username;

        this.accountPin = accountPin;

        this.initialValue = initialValue;

    }

    public double getInitialValue () {

        return initialValue;

    }

    @Override
    public String toString () {

        return "Username: " + username
                + "PIN: " + accountPin
                + "Deposit value: " + initialValue;

    }

}
