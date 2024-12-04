package POO.imc.app;

import POO.imc.entities.PatientTwo;

import POO.imc.entities.StatsTwo;

public class ProgramPtTwo {

    public static void main ( String[] args ) {

        imcCalculator ();

    }

    private static void imcCalculator () {

        StatsTwo statsTwo = new StatsTwo( 10.7, 1 );

        PatientTwo patientTwo = new PatientTwo( "Peter", "Claus" );

        statsTwo.addPatient(patientTwo);

        System.out.println(statsTwo);

    }

}
