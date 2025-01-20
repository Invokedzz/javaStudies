package LambdaJavaDoc.SmallExerciseReview.src.model.services;

import LambdaJavaDoc.SmallExerciseReview.src.model.entities.EmployeeMain;

import LambdaJavaDoc.SmallExerciseReview.src.model.enums.EmployeeStats;

import LambdaJavaDoc.SmallExerciseReview.src.util.EmployeePredicate;

import java.util.List;

public class DistributeEmployeeSalary implements EmployeeContract {

    @Override
    public Double filterSalary ( List < EmployeeMain > employeeList, EmployeePredicate predicate ) {

        double total = 0.0;

        for ( EmployeeMain employeeMain : employeeList ) {

            if (predicate.test( employeeMain )) total += employeeMain.getSalary();

        }

        return total;

    }

}
