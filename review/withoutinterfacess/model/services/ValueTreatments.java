package review.withoutinterfacess.model.services;

import java.util.Scanner;

public class ValueTreatments {

    private boolean hasDoubleInput ( Scanner sc ) {

        return sc.hasNextInt();

    }

    public Double verifyInputForDouble ( Scanner sc ) {

        while ( !hasDoubleInput( sc ) ) {

            System.out.println( "Invalid value. Try again!" );

            sc.next();

        }

        return sc.nextDouble();

    }

}
