package POO.applicationTwo;

import java.util.Scanner;

import java.util.Locale;

import POO.entitiesTwo.EntityOverload;

public class ApplicationOverload {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        ourTamFunction();

    }

    public static void ourTamFunction () {

        Scanner initScanner = new Scanner (System.in);

        EntityOverload product = new EntityOverload();

        EntityOverload.name = initScanner.next();

        EntityOverload.age = initScanner.nextInt();

        EntityOverload.health = initScanner.nextDouble();

        EntityOverload.hungry = initScanner.nextDouble();

        EntityOverload.viewAllElements(EntityOverload.name, EntityOverload.age, EntityOverload.health,
                EntityOverload.hungry);

        System.out.println(product.toString());

        System.out.println(product.analyzeItsHappiness());


    }

}
