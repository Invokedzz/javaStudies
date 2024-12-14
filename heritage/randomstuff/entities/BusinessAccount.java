package heritage.randomstuff.entities;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount () {

        super ();

    }

    public BusinessAccount ( String holder, Integer number, double balance, double loanLimit ) {

        super ( holder, number, balance );

        this.loanLimit = loanLimit;

    }

    public double getLoanLimit () {

        return loanLimit;

    }

    public double loan ( double amount ) {

        if ( loanLimit <= amount ) {

            double balance = getBalance();

            return balance - amount;

        }

        return getBalance();

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Holder: " ).append( getHolder() )
                .append( " Number: " ).append( getNumber() )
                .append( " Balance: " ).append( getBalance() );

        return sb.toString();

    }

}
