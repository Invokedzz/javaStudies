package content.logicExercises.testingClasses.application;

import content.logicExercises.testingClasses.entities.StudentEntity;

import content.logicExercises.testingClasses.entities.StudentErrorMessage;

import java.util.Scanner;

import java.util.Locale;

public class StudentApplication {

    public static void main (String[] args) {

            Locale.setDefault(Locale.ITALIAN);

            receiveValues();

    }

    public static void receiveValues () {

        Scanner initSc = new Scanner (System.in);

        StudentEntity addValuesFor = new StudentEntity();

        addValuesFor.firstGrade = initSc.nextDouble();

        addValuesFor.secondGrade = initSc.nextDouble();

        addValuesFor.thirdGrade = initSc.nextDouble();

        controlGradesPattern(addValuesFor.firstGrade, addValuesFor.secondGrade, addValuesFor.thirdGrade);

        System.out.println(addValuesFor.receiveGrades());

        initSc.close();

    }

    public static void controlGradesPattern (double a, double b, double c) {

        StudentErrorMessage receiveErrors = new StudentErrorMessage();

        if (a > 30 || a < 0) receiveErrors.errorMessageA();

        else if (b > 35 || b < 0) receiveErrors.errorMessageB();

        else if (c > 35 || c < 0) receiveErrors.errorMessageC();

        else receiveErrors.receiveMessageElse();

    }

}
