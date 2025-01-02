package interfaces.accountinterfaces.services;

import interfaces.accountinterfaces.entities.UserAccount;

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

        return 0.0;

    }

    @Override
    public Double withdraw ( double amount ) {

        return 0.0;

    }


}
