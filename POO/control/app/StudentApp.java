package POO.control.app;

import POO.control.entities.StudentEntity;

import POO.control.entities.status.StudentStatus;

import java.util.Scanner;

public class StudentApp {

    public static void main ( String[] args ) {

        Scanner init = new Scanner( System.in );

        mainApplication(init);

    }

    private static void mainApplication ( Scanner init ) {

        int numberOfStudents = init.nextInt();

        for ( int i = 0; i < numberOfStudents; i++ ) {

            System.out.println( "Enter the student name: " );


            System.out.println( "Enter the student last name: " );


            System.out.println( "Enter the student id: " );


            System.out.println( "Enter the student grade: " );


        }

    }

}
