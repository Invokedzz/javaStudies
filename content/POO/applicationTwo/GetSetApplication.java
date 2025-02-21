package content.POO.applicationTwo;

import java.util.Scanner;

import java.util.Locale;

import content.POO.entitiesTwo.GetSetEntity;

public class GetSetApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveGetSetValues();

    }

    public static void receiveGetSetValues () {

        Scanner init = new Scanner (System.in);

        String workerName = init.next();

        double currentSalary = init.nextDouble();

        double newValueSentByUser = init.nextDouble();

        GetSetEntity product = new GetSetEntity(workerName, currentSalary);

        System.out.println(product.getUsername());

        product.setSalary(newValueSentByUser); // Changes the 1st value sent by the user

        System.out.println(product.changeCurrentValue());

    }

}
