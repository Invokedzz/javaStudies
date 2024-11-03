package logicExercises.testingClasses.application;

import logicExercises.testingClasses.entities.WorkerEntity;

import java.util.Scanner;

import java.util.Locale;

public class WorkerApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        insertingTheProperties();

    }

    public static void insertingTheProperties () {

        WorkerEntity receptValues = new WorkerEntity();

        Scanner initSc = new Scanner (System.in);

        System.out.println("Name: ");

        receptValues.Name = initSc.nextLine();

        System.out.println("Salary: ");

        receptValues.GrossSalary = initSc.nextDouble();

        System.out.println("Tax: ");

        receptValues.Tax = initSc.nextDouble();

        System.out.println(receptValues.netInformation());

        System.out.println("Insert the measures for its salary");

        double por = initSc.nextDouble();

        receptValues.netSalary(por);

        System.out.println(receptValues.newValue());

    }

}
