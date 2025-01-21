package Stream.second.model.services;

import Stream.second.model.entities.EmployeeStream;

import Stream.second.util.EmployeePredicate;

import java.util.List;

import java.io.*;

public class FilterEmployees implements EmployeeContract {

    @Override
    public void filter ( List<EmployeeStream> emp, EmployeePredicate employeePredicate ) {

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/Stream/second/files/EmployeeAccounts" );

        try (BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String line = bufferedReader.readLine();

            while (line != null) {

                String [] fields = line.split( "," );

                emp.add( new EmployeeStream( fields[0], fields[1], Double.parseDouble( fields[2] )));

                line = bufferedReader.readLine();

            }

            emp.removeIf( employees -> !employeePredicate.test(employees) );

            getFilteredEmployees(emp);


        } catch ( IOException exception ) {

            System.out.println( exception.getMessage() );

        }

    }

    private void getFilteredEmployees ( List <EmployeeStream> emp ) {

        Double getTotal = emp.stream()
                .map( EmployeeStream::getSalary )
                .reduce( 0.0, Double::sum );

        for (EmployeeStream employees : emp) {

            System.out.println( employees );

        }

        System.out.println( "Value spent with employees: " + getTotal );

    }

}
