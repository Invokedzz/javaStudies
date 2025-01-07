package practice.src.model.services;

import practice.src.model.entities.Contract;
import practice.src.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService () {}

    public ContractService ( OnlinePaymentService onlinePaymentService ) {

        this.onlinePaymentService = onlinePaymentService;

    }

    public OnlinePaymentService getOnlinePaymentService () {

        return onlinePaymentService;

    }

    public void processContract ( Contract contract, Integer months ) {

        double initialQuota = contract.getTotalValue() / months;

        for ( int index = 1; index <= months; index ++ ) {

            LocalDate monthsProgression = contract.getDate().plusMonths( index );

            double interest = getOnlinePaymentService().interest( initialQuota, index );

            double paymentFee = getOnlinePaymentService().paymentFee( initialQuota + interest );

            double finalQuota = initialQuota + paymentFee + interest;

            contract.addInstallment( new Installment( monthsProgression, finalQuota ) );

        }

    }

}
