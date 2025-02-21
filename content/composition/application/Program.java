package content.composition.application;

import content.composition.entities.Worker;

import content.composition.entities.HourContract;

import content.composition.entities.Department;

import content.composition.entities.enums.WorkerLevel;

import java.util.Scanner;

import java.text.SimpleDateFormat;

import java.text.ParseException;

import java.time.LocalDate;

import java.util.Locale;

public class Program {

    public static void main (String[] args) throws ParseException {

        Locale.setDefault(Locale.ITALIAN);

        mainApp();

    }

    private static void mainApp () throws ParseException {

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

        System.out.println(worker);

        System.out.println("Enter the numbers of workers: ");

        int value = sc.nextInt();

        for (int i = 0; i < value; i++) {

            System.out.println("Enter date: ");

            LocalDate date = LocalDate.parse(sc.next()); // "yyyy-MM-dd"

            System.out.println("Enter the value per hours: ");

            Double valuePerHour = sc.nextDouble();

            System.out.println("Enter hours: ");

            int hours = sc.nextInt();

            HourContract hourContract = new HourContract(date, valuePerHour, hours);

            worker.addContract(hourContract);

        }

    }

}
