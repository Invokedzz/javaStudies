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

            StudentEntity student = new StudentEntity( name, lastName, studentId, studentGrade );

            list.add(student);

            System.out.println(list);

        }

    }

}
