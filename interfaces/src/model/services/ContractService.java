package interfaces.src.model.services;

import interfaces.src.model.entities.Contract;

import interfaces.src.model.entities.Installment;

import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService onlinePaymentService;

    public ContractService () {}

    public ContractService ( OnlinePaymentService onlinePaymentService ) {

        this.onlinePaymentService = onlinePaymentService;

    }

    public void processContract ( Contract contract, int months ) {

        double basicQuota = contract.getTotalValue() / months;

        for ( int index = 1; index <= months; index ++ ) {

            LocalDate date = contract.getDate().plusMonths( index );

            double interest = onlinePaymentService.interest( basicQuota, months );

            double fee = onlinePaymentService.paymentFee( basicQuota );

            double quota = fee + interest + basicQuota;

            contract.getInstallmentList().add( new Installment( date, quota ) );

        }

    }

}
