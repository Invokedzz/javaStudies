package heritage.randompackage.entities;

public class Account {

    // holder ( String ), balance ( double ), number ( int ), status ( AccountStatus )

    // functions: withdraw ( amount: double): double, deposit ( amount: double): double

    private String holder;

    protected double balance;

    private int number;

    private AccountStatus status;

    public Account ( String holder, double balance, int number, AccountStatus status ) {

        this.holder = holder;

        this.balance = balance;

        this.number = number;

        this.status = status;

    }

    public double withdraw ( double amount ) {

        return balance -= amount;

    }

    public double deposit ( double amount ) {

        return balance += amount;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Holder: " ).append( holder )
                .append( " Balance: " ).append( balance )
                .append( " Number: " ).append( number )
                .append( " Status: " ).append( status );

        return sb.toString();

    }

}
