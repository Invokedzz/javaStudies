package POO.ApplicationThree;

import java.util.Scanner;

import java.util.Locale;

import POO.EntitiesThree.EntitiesThree;

public class ApplicationThree {

    public static void main (String[] args) {

        Locale.setDefault(Locale.GERMAN);

        carPatterns();

    }

    public static void carPatterns () {

        EntitiesThree carInfo;

        Scanner initSc = new Scanner (System.in);

        int carID = initSc.nextInt();

        String carBrand = initSc.next();

        String carColor = initSc.next();

        carInfo = new EntitiesThree(carID, carBrand, carColor);

        System.out.println(carInfo);

    }

}
