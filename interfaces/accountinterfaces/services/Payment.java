package interfaces.accountinterfaces.services;

import interfaces.accountinterfaces.entities.UserAccount;

import interfaces.accountinterfaces.exceptions.WithdrawException;

public class Payment implements Deposit, Withdraw {

    private UserAccount userAccount;

    private ServiceForTaxes serviceForTaxes;

    public Payment () {}

    public Payment ( UserAccount userAccount, ServiceForTaxes serviceForTaxes ) {

        this.userAccount = userAccount;

        this.serviceForTaxes = serviceForTaxes;

    }

    @Override
    public Double deposit ( double amount ) {

        return userAccount.getBalance() + amount;

    }

    @Override
    public Double withdraw ( double amount ) {

        if ( userAccount.getBalance() < amount ) throw new WithdrawException( "The amount you want to withdraw is bigger than your actual balance!" );

        return userAccount.getBalance() - amount + serviceForTaxes.calculateTax( amount );

    }


}
