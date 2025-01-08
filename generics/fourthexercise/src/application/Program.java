package generics.fourthexercise.src.application;

import generics.fourthexercise.src.model.services.*;

import generics.fourthexercise.src.model.entities.*;

import java.util.Scanner;

public class Program {

    public static void main ( String[] args ) {

        Scanner sc = new Scanner( System.in );

        run ( sc );

    }

    private static void run ( Scanner sc ) {

        NormalEmployee normalEmployee = new NormalEmployee( "Paolo", "2635", 1600.0 );

        VipEmployee vipEmployee = new VipEmployee( "Mr.Goose", "8374", 2400.0 );

        GenerateSalary generateSalary = new GenerateSalary( new EmployeeSalaryPerYear() );

        generateSalary.calculateSalaryForNormalEmployees( sc, normalEmployee );

        generateSalary.calculateSalaryForVipEmployees( sc, vipEmployee );

    }

}
