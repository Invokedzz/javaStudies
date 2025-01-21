package Stream.second.model.services;

import Stream.first.src.model.entities.ProductStream;
import Stream.second.model.entities.EmployeeStream;

import Stream.second.util.EmployeePredicate;

import java.util.List;

import java.io.*;

public class FilterEmployees implements EmployeeContract {

    @Override
    public void filter ( List<EmployeeStream> emp, EmployeePredicate employeePredicate ) {

        employeePredicate = ( employee ) -> employee.getSalary() >= 1000.0 && !employee.getEmail().isEmpty();

        File file = new File( "/Users/samunoinv/Documents/GitHub/javaStudies/Stream/second/files/EmployeeAccounts" );

        try (BufferedReader bufferedReader = new BufferedReader( new FileReader( file ))) {

            String line = bufferedReader.readLine();

            while (line != null) {

                String [] fields = line.split( "," );

                emp.add( new EmployeeStream( fields[0], Double.parseDouble( fields[1] )));

                line = bufferedReader.readLine();

            }

            for (EmployeeStream elements : emp) {

                if ( employeePredicate.test(elements) ) {

                    getFilteredEmployees( emp );

                    return;

                }

                System.out.println("Invalid employees on the block");

            }


        } catch ( IOException exception ) {

            System.out.println( exception.getMessage() );

        }

    }

    private void getFilteredEmployees ( List <EmployeeStream> list ) {

    }

}
