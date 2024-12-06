package POO.somexercises.app;

import POO.somexercises.entities.EntityEmployeeUpgrade;

import POO.somexercises.entities.EntityEmployee;

public class MainEmployeeUpgrade {

    public static void main ( String[] args ) {

        mainOperator();

    }

    private static void mainOperator () {

        EntityEmployeeUpgrade entityEmployeeUpgrade = new EntityEmployeeUpgrade("Duck", "Ga", 1200);

        EntityEmployee employee = new EntityEmployee("Chico", "Bento", 3000);

        entityEmployeeUpgrade.addEmployees(employee);

        System.out.println(entityEmployeeUpgrade);

    }

}
