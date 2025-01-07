package practice.src.application;

import practice.src.model.entities.*;

import practice.src.model.services.*;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public class Operations {

    public static void runOperations () {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern( "dd/MM/yyyy" );

        LocalDate localDate = LocalDate.parse( "23/09/2000", dateTimeFormatter );

        Contract contract = new Contract( 8473, localDate, 10.000 );

        ContractService contractService = new ContractService( new PaypalService() );

        contractService.processContract( contract, 12 );


        for ( Installment installment : contract.getInstallmentList() ) {

            System.out.println( installment );

        }

    }

}
