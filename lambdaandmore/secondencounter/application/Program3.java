package lambdaandmore.secondencounter.application;

import lambdaandmore.secondencounter.services.RandomEmployeesInterface;

import lambdaandmore.secondencounter.entities.EmployeeX;

import java.util.ArrayList;

import java.util.List;

public class Program3 {

    public static void main ( String[] args ) {

        ImGoingCRAZY();

    }

    private static void ImGoingCRAZY () {

        RandomEmployeesInterface employees = () -> {

            List < EmployeeX > listOfEmployees = new ArrayList<>();

            listOfEmployees.add( new EmployeeX("Paul Mr", "28374"));

            listOfEmployees.add( new EmployeeX("Alex Mr", "438203"));

            for ( EmployeeX items : listOfEmployees ) {

                System.out.println( items );

            }

            return listOfEmployees;

        };

        employees.createListWithEmployees();

    }

}
