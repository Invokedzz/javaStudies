package LambdaJavaDoc.SmallExerciseReview.src.application;

import LambdaJavaDoc.SmallExerciseReview.src.model.entities.EmployeeMain;

import LambdaJavaDoc.SmallExerciseReview.src.model.enums.EmployeeStats;

import LambdaJavaDoc.SmallExerciseReview.src.model.services.DistributeEmployeeSalary;

import LambdaJavaDoc.SmallExerciseReview.src.util.EmployeePredicate;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main (String[] args) {

        testThisThing();

    }

    private static void testThisThing () {

        List < EmployeeMain > employeeList = new ArrayList<>();

        DistributeEmployeeSalary employeeSalary = new DistributeEmployeeSalary();

        employeeList.add( new EmployeeMain("Paul", "1823763", 1100.0, EmployeeStats.WORKING_ON_THE_PROJECT));

        employeeList.add( new EmployeeMain("Andrew", "1823763", 900.0, EmployeeStats.WORKING_ON_THE_PROJECT));

        employeeList.add( new EmployeeMain("Garfield", "1823763", 2100.0, EmployeeStats.WORKING_ON_THE_PROJECT));

        employeeList.add( new EmployeeMain("Jeanny", "1823763", 1100.0, EmployeeStats.FIRED));

        EmployeePredicate employeePredicate = ( employee ) -> employee.getSalary() >= 1000.0
                && employee.getStats().equals(EmployeeStats.WORKING_ON_THE_PROJECT);

        double getTotal = employeeSalary.filterSalary( employeeList, employeePredicate );

        System.out.println( getTotal );

    }

}
