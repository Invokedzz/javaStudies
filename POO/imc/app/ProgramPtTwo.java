package POO.imc.app;

import POO.imc.entities.PatientTwo;

import POO.imc.entities.StatsTwo;

import java.util.Scanner;

public class ProgramPtTwo {

    public static void main ( String[] args ) {

        Scanner init = new Scanner( System.in );

        imcCalculator ( init );

    }

    private static void imcCalculator (Scanner init) {

      //  PatientTwo patientTwo = new PatientTwo( "Peter", "Claus" ); -> dumb example

        System.out.println( "Enter the number of patients: " );

        int numberOfPatients = init.nextInt();

        for ( int i = 0; i < numberOfPatients; i++ ) {

            System.out.println( "Enter the patient first name: " );

            String firstName = init.next();

            System.out.println( "Enter the patient second name: " );

            String lastName = init.next();

            PatientTwo patientTwo = new PatientTwo( firstName, lastName );

            StatsTwo.addPatient( patientTwo );

        }

        for ( int i = 0; i < numberOfPatients; i++ ) {

            System.out.println("Enter the patient weight: ");

            double weight = init.nextDouble();

            System.out.println("Enter the patient height: ");

            double height = init.nextDouble();

            StatsTwo element = new StatsTwo( weight, height );

            double getImcResult = element.calculusImc( weight, height );

            String getCondition = verifyImcCondition( getImcResult );

            System.out.println( element );

            System.out.printf( "Status of the patient: %s", getCondition );

        }

    }

    private static String verifyImcCondition (double getResult) {

        if ( getResult < 18.50 ) return "Underweight";

        if ( getResult >= 18.50 && getResult < 24.90 ) return "Normal";

        if ( getResult >= 25 && getResult < 29.90 ) return "Overweight";

        if ( getResult >= 30.0 ) return "Obese";

        return "Undefined";

    }

}
