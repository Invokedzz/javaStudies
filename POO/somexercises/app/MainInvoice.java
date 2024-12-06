package POO.somexercises.app;

import POO.somexercises.entities.EntityInvoice;

public class MainInvoice {

    public static void main ( String[] args ) {

        mainOperation();

    }

    private static void mainOperation () {

        EntityInvoice invoice = new EntityInvoice( "12", "hello!", 10, 20 );

        double getAmount = invoice.getInvoiceAmount();

        invoice.setQty( -2 );

        invoice.setItemPrice( -1 );

        System.out.println( invoice );

        System.out.println( getAmount );

    }

}
