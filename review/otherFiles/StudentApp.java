package review.otherFiles;

import review.otherFiles.StudentEntity;

import java.util.Scanner;

import java.util.Locale;

public class StudentApp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.JAPANESE);

        ourApplication();

    }

    private static void ourApplication () {

        Scanner init = new Scanner (System.in);

        int receiveInitialValue = init.nextInt();

        String [] studentsName = new String[receiveInitialValue];

        double [] firstGrade = new double[receiveInitialValue];

        double [] secondGrade = new double[receiveInitialValue];

        StudentEntity product = new StudentEntity(studentsName, firstGrade, secondGrade);

        for (int y = 0; y < receiveInitialValue; y++) {

            System.out.println("Enter the measure for the " + y + " student");

            studentsName[y] = init.next();

            System.out.println("Enter the first grade: ");

            firstGrade[y] = init.nextDouble();

            System.out.println("Enter the second grade: ");

            secondGrade[y] = init.nextDouble();

            double average = product.studentAverage(firstGrade[y], secondGrade[y]);

            if (average >= 6.0) {

                System.out.println("Approved students: " + studentsName[y]);

            }

        }

    }

}
