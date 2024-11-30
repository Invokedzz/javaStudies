package composition.application;

import composition.entities.Worker;

import composition.entities.HourContract;

import composition.entities.Department;

import composition.entities.enums.WorkerLevel;

import java.util.Scanner;

import java.text.SimpleDateFormat;

import java.text.ParseException;

import java.time.LocalDate;

import java.util.Locale;

public class Program {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        mainApp();

    }

    private static void mainApp () {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();
        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base salary: ");
        double baseSalary = sc.nextDouble();

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

    }

}
