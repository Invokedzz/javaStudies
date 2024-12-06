package POO.somexercises.app;

import POO.somexercises.entities.EntityEmployee;

public class MainEmployee {

    public static void main ( String[] args ) {

        mainOperations();

    }

    private static void mainOperations () {

        EntityEmployee employee = new EntityEmployee("Walter", "White", 1200.0);

        String getWholeElement = employee.changeCurrentSalary();

        System.out.printf("%s and %s", employee, getWholeElement);

    }

}
