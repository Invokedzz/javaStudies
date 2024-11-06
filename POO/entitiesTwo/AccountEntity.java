package POO.entitiesTwo;

public class AccountEntity {

    private int accountNumber;

    public String accountUsername;

    private double initialValue;

    public AccountEntity (int accountNumber, String accountUsername, double initialValue) {

        this.accountUsername = accountUsername;

        this.initialValue = initialValue;

    }

    public int getAccountNumber (int accountNumber) {
        return accountNumber;
    }

    public String getAccountUsername (String accountUsername) {
        return accountUsername;
    }

    public double getInitialValue (double initialValue) {
        return initialValue;
    }

    public String toString () {

        return "Account " + accountNumber
                + "Holder: " + accountUsername
                + "Balance: " + initialValue;

    }

    public double enterSomeValue (double randomValue) {
        return initialValue += randomValue;
    }

    public double removeSomeValue (double randomValue) {
        return initialValue -= randomValue;
    }

}
