package POO.entitiesTwo;

public class AccountEntity {

    private int accountNumber;

    public String accountUsername;

    private double initialValue;

    public AccountEntity (String accountUsername, double initialValue) {

        this.accountUsername = accountUsername;

        this.initialValue = initialValue;

    }

    public int getAccountNumber () {
        return accountNumber;
    }

    public String getAccountUsername () {
        return accountUsername;
    }

    public double getInitialValue () {
        return initialValue;
    }

    public void setAccountUsername (String accountUsername) {

        this.accountUsername = accountUsername;

    }

    public void setInitialValue (double initialValue) {

        this.initialValue = initialValue;

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
