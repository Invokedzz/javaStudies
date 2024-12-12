package heritage.entities;

public class BusinessAccount extends Account {

    // holder ( String ), balance ( double ), number ( int )

    private double loanLimit;

     public BusinessAccount () {

        super();

    }

    public BusinessAccount ( String holder, double balance, int number, double loanLimit ) {

        super ( holder, balance, number );

        this.loanLimit = loanLimit;

    }

    public void loan ( double amount ) {

        if (amount <= loanLimit) {

            balance += amount - 10.0;

            return;

        }

        System.out.println("invalid amount!");

    }

    @Override
    public String toString () {

         StringBuilder sb;

         sb = new StringBuilder();

         sb.append(balance);

         return sb.toString();

    }

}
