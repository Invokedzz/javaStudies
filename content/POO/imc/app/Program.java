package content.POO.imc.app;

import content.POO.imc.entities.Patient;

import content.POO.imc.entities.Stats;

import java.util.Scanner;

public class Program {

    public static void main (String[] args) {

        Scanner init = new Scanner ( System.in );

        gatherInformation ( init );

    }

    private static void gatherInformation (Scanner init) {

        Patient patient = new Patient ( "Paul", "Roger" );

        double weight = init.nextDouble();

        double height = init.nextDouble();

        Stats stats = new Stats ( weight, height, patient );

        double getResult = stats.calculusImc ( weight, height );

        verifyResultAndImc ( getResult );

    }

    private static void verifyResultAndImc (double getResult) {

        if ( getResult < 18.50 ) System.out.println( "Underweight" );

        if ( getResult >= 18.50 && getResult < 24.90 ) System.out.println( "Normal" );

        if ( getResult >= 25 && getResult < 29.90 ) System.out.println( "Overweight" );

        if ( getResult >= 30.0 ) System.out.println( "Obese" );

    }

}
