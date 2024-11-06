package POO.applicationTwo;

import java.util.Scanner;

import java.util.Locale;

import POO.entitiesTwo.GetSetEntity;

public class GetSetApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveGetSetValues();

    }

    public static void receiveGetSetValues () {

        Scanner init = new Scanner (System.in);

        String workerName = init.next();

        double currentSalary = init.nextDouble();

        GetSetEntity product = new GetSetEntity(workerName, currentSalary);

        System.out.println(product.getUsername());

        System.out.println(product.getCurrentSalary());

    }

}
