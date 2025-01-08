package generics.fourthexercise.src.model.services;

import generics.fourthexercise.src.model.entities.NormalEmployee;

import generics.fourthexercise.src.model.entities.VipEmployee;

import java.util.Scanner;

public class GenerateSalary {

    private EmployeeDifferences employeeDifferences;

    public GenerateSalary () {}

    public GenerateSalary ( EmployeeDifferences employeeDifferences ) {

        this.employeeDifferences = employeeDifferences;

    }

    public EmployeeDifferences getEmployeeDifferences () {

        return employeeDifferences;

    }

    public void calculateSalaryForNormalEmployees ( Scanner sc, NormalEmployee normalEmployee ) {

        double normalEmployeeSalary = normalEmployee.getSalary();

        int months = obtainMonths( sc );

        for ( int index = 1; index <= months; index ++ ) {

            double currentSalary = getEmployeeDifferences().changeNormalEmployeeSalary( normalEmployeeSalary, index );

            System.out.printf( "Month: %s, Salary: %s\n", index, currentSalary );

        }

    }

    public void calculateSalaryForVipEmployees ( Scanner sc, VipEmployee vipEmployee ) {

        double vipEmployeeSalary = vipEmployee.getSalary();

        int months = obtainMonths( sc );

        for ( int index = 1; index <= months; index ++ ) {

            double currentSalary = getEmployeeDifferences().changeVipEmployeeSalary( vipEmployeeSalary, index );

            System.out.printf( "Month: %s, Salary: %s\n", index, currentSalary );

        }

    }

    private int obtainMonths ( Scanner sc ) {

        System.out.println( "How many months you want?" );

        return sc.nextInt();

    }

}
