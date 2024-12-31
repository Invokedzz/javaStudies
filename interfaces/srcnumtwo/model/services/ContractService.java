package interfaces.srcnumtwo.model.services;

import interfaces.srcnumtwo.model.entities.Contract;
import interfaces.srcnumtwo.model.entities.Installment;

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

            LocalDate date = contract.getDate().plusMonths( months );

            double interest = onlinePaymentService.interest( basicQuota, months );

            double paymentFee = onlinePaymentService.paymentFee( basicQuota );

            double quota = interest + paymentFee + basicQuota;

            contract.getInstallmentList().add( new Installment( date, quota ) );

        }

    }

}
