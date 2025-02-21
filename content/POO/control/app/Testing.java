package content.POO.control.app;

import java.util.Scanner;

public class Testing {

    public static void main ( String[] args ) {

        Scanner init = new Scanner ( System.in );

        int getResult = mainApp(init);

        System.out.println(getResult);

    }

    private static int mainApp (Scanner init) {

        int addStudentsGrades, numberOfStudents;

        int total = 0;

        int totalStudentsGrade = 0;

        numberOfStudents = 1;

        while ( numberOfStudents <= 10 ) {

            System.out.println ( "Enter the grade for this student: ");

            addStudentsGrades = init.nextInt();

            totalStudentsGrade  += addStudentsGrades;

            total = totalStudentsGrade / numberOfStudents;

            numberOfStudents++;

        }

        return total;

    }

}
