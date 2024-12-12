package heritage.entities;

public class SavingsAccount extends Account {

    // Account: holder (String), balance (double), number (int)

    private double interestRate;

    public SavingsAccount () {

        super();

    }

    public SavingsAccount ( String holder, double balance, int number, double interestRate ) {

        super ( holder, balance, number );

        this.interestRate = interestRate;

    }

    public double balanceUpdate () {

        return balance += balance * interestRate;

    }

}
