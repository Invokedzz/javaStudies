package POO.imc.app;

import POO.imc.entities.PatientTwo;

import POO.imc.entities.StatsTwo;

import java.util.ArrayList;

import java.util.Scanner;

import java.util.List;

public class ProgramPtTwo {

    public static void main ( String[] args ) {

        Scanner init = new Scanner(System.in);

        imcCalculator (init);

    }

    private static void imcCalculator (Scanner init) {

      //  PatientTwo patientTwo = new PatientTwo( "Peter", "Claus" );

        System.out.println("Enter the number of patients: ");

        int numberOfPatients = init.nextInt();

        for (int i = 0; i < numberOfPatients; i++) {

            System.out.println("Enter the patient first name: ");

            String firstName = init.next();

            System.out.println("Enter the patient second name: ");

            String lastName = init.next();

            PatientTwo patientTwo = new PatientTwo(firstName, lastName);

            StatsTwo.addPatient(patientTwo);

        }

        for (int i = 0; i < numberOfPatients; i++) {

            System.out.println("Enter the patient weight: ");

            double weight = init.nextDouble();

            System.out.println("Enter the patient height: ");

            double height = init.nextDouble();

            StatsTwo element = new StatsTwo(weight, height);

            

            System.out.println(element);

        }

    }

}
