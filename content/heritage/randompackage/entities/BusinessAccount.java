package content.heritage.randompackage.entities;

public class BusinessAccount extends Account {

    // holder ( String ), balance ( double ), number ( int ), status ( AccountStatus )

    private final double loanLimit;

    public BusinessAccount ( String holder, double balance, int number, AccountStatus status, double loanLimit ) {

        super ( holder, balance, number, status );

        this.loanLimit = loanLimit;

    }

    public double loan ( double amount, AccountStatus status ) {

        if ( status.equals(AccountStatus.valueOf("PREMIUM")) && amount <= loanLimit ) return balance += amount;

        if ( status.equals(AccountStatus.valueOf("DEFAULT")) && amount <= loanLimit) return balance += amount - 1000.0;

        return 0.0;

    }

}
