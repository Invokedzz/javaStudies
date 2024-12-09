package POO.control.app;

import POO.control.entities.StudentEntity;

import POO.control.entities.status.StudentStatus;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class StudentApp {

    public static void main ( String[] args ) {

        Scanner init = new Scanner( System.in );

        mainApplication(init);

    }

    private static void mainApplication ( Scanner init ) {

        int numberOfStudents = init.nextInt();

        List < StudentEntity > list = new ArrayList<>();

        for ( int i = 0; i < numberOfStudents; i++ ) {

            System.out.println( "Enter the student name: " );

            String name = init.next();

            System.out.println( "Enter the student last name: " );

            String lastName = init.next();

            System.out.println( "Enter the student id: " );

            int studentId = init.nextInt();

            System.out.println( "Enter the student grade: " );

            double studentGrade = init.nextDouble();

            double getAllGrades = gradesCalculus( studentGrade, numberOfStudents );

            StudentStatus status = verifyStudentsGrade( studentGrade );

            StudentEntity student = new StudentEntity( name, lastName, studentId, studentGrade, status );

            list.add(student);

            System.out.println(list);

            System.out.println( getAllGrades );

        }

    }

    private static StudentStatus verifyStudentsGrade ( double grades ) {

        if ( grades >= 7.0 ) return StudentStatus.valueOf( "APPROVED" );

        return StudentStatus.valueOf( "FAILED" );

    }

    private static double gradesCalculus ( double grades, int students ) {

        double element = 0;

        int size = 0;

        while ( size < students ) {

            element += grades;

            size++;

        }

        return element / students;

    }

}
