package heritage.entities;

public class Account {

    // holder ( String ), balance ( double ), number ( int )

    // functions: withdraw ( amount: double): double, deposit ( amount: double): double.

    private String holder;

    protected double balance;

    private int number;

    public Account () {}

    public Account ( String holder, double balance, int number ) {

        this.holder = holder;

        this.balance = balance;

        this.number = number;

    }

    public double withdraw ( double amount ) {

        if ( balance < amount ) {

            System.out.println("You can't withdraw an amount bigger than your balance!");

            return balance;

        }

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
                .append( " Number: " ).append( number )
                .append( " Balance: " ).append( balance );

        return sb.toString();

    }

}
