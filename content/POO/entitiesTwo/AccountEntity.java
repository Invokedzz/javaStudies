package content.POO.entitiesTwo;

public class AccountEntity {

    private int accountNumber;

    public String accountUsername;

    private double initialValue;

    public AccountEntity (String accountUsername, int accountNumber, double initialValue) {

        this.accountUsername = accountUsername;

        this.accountNumber = accountNumber;

        enterSomeValue(initialValue);

    }

    public AccountEntity (String accountUsername, int accountNumber) {

        this.accountUsername = accountUsername;

        this.accountNumber = accountNumber;

    }

    public int getAccountNumber (int accountNumber) {
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


    public String toString () {

        return "Account " + accountNumber
                + "Holder: " + accountUsername
                + "Balance: " + initialValue;

    }

    public double enterSomeValue (double randomValue) {
        return initialValue += randomValue;
    }

    public double removeSomeValue (double randomValue) {
        return initialValue -= randomValue + 5.00;
    }

}
