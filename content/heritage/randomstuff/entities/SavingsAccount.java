package content.heritage.randomstuff.entities;

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

    @Override
    public double withdraw ( double amount ) {

        super.withdraw( amount );

        double balance = getBalance();

        return balance - amount + 50;

    }

    @Override
    public double deposit ( double amount ) {

        super.deposit( amount );

        double balance = getBalance();

        return balance + amount - 50;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Holder: " ).append( getHolder() )
                .append( " Number: " ).append( getNumber() )
                .append( " Balance: " ).append( getBalance() )
                .append( " Interest Rate: " ).append( updateBalance() );

        return sb.toString();

    }

}
