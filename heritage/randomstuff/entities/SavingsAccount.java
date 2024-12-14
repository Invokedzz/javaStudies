package heritage.randomstuff.entities;

public class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount () {

        super ();

    }

    public SavingsAccount ( String holder, Integer number, double balance, double interestRate ) {

        super ( holder, number, balance );

        this.interestRate = interestRate;

    }

    public double getInterestRate () {

        return interestRate;

    }

    public double updateBalance () {

        double balance = getBalance();

        return balance + getBalance() * interestRate;

    }

}
