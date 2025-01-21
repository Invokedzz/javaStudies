package Stream.second.application;

import Stream.second.model.entities.*;

import Stream.second.model.services.FilterEmployees;

import Stream.second.util.EmployeePredicate;

import java.util.ArrayList;

import java.util.List;

public class Program {

    public static void main (String[] args) {

        run();

    }

    private static void run () {

        FilterEmployees filteredEmployees = new FilterEmployees();

        List <EmployeeStream> employees = new ArrayList<>();

        EmployeePredicate predicate = ( employee )
                ->  employee.getName().length() >= 3
                && employee.getSalary() >= 2000.0
                && !employee.getEmail().isEmpty();

        filteredEmployees.filter( employees, predicate );

    }

}
