package content.LambdaJavaDoc.src.Example5th.src.model.services;

import content.LambdaJavaDoc.src.Example5th.src.model.entities.Account;

import content.LambdaJavaDoc.src.Example5th.src.model.exceptions.WithdrawException;

public class ImplementsServices implements AccountServices {

    private Account account;

    public ImplementsServices () {}

    public ImplementsServices ( Account account ) {

        this.account = account;

    }

    public Account getAccount () {

        return account;

    }

    @Override
    public double withdraw ( Account acc, Double amount ) {

        if ( acc.getBalance() < amount ) throw new WithdrawException( "Invalid amount!" );

        double newValue = acc.getBalance() + amount;

        acc.setBalance( newValue );

        return acc.getBalance() - amount;

    }

    @Override
    public double deposit ( Account acc, Double amount ) {

        double newValue = acc.getBalance() - amount;

        acc.setBalance( newValue );

        return newValue;

    }

}
