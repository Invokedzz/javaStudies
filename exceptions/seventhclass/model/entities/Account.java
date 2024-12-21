package exceptions.seventhclass.model.entities;

public class Account {

    private Integer number;

    private String holder;

    private double balance;

    private Double withdrawLimit;

    public Account () {}

    public Account ( Integer number, String holder, double balance, Double withdrawLimit ) {

        this.number = number;

        this.holder = holder;

        this.balance = balance;

        this.withdrawLimit = withdrawLimit;

    }

    public Integer getNumber () {

        return number;

    }

    public String getHolder () {

        return holder;

    }

    public double getBalance () {

        return balance;

    }

    public Double getWithdrawLimit () {

        return withdrawLimit;

    }

    public double deposit ( double amount ) {

        return getBalance() + amount;

    }

    public double withdraw ( double amount ) {

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Number: " ).append( getNumber() )
                .append( " Holder: " ).append( getHolder() )
                .append( " Balance: " ).append( getBalance() )
                .append( " Withdraw Limit: " ).append ( getWithdrawLimit() );

        return sb.toString();

    }

}
