package src.staticMembers.application;

import src.staticMembers.entities.SecondTestEntity;

import java.util.Scanner;

import java.util.Locale;

public class SecondTestApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveCircumference();

    }

    public static void receiveCircumference () {

        SecondTestEntity receptor = new SecondTestEntity();

        Scanner initSc = new Scanner (System.in);

        receptor.radius = initSc.nextDouble();

        System.out.println(receptor.circumference(receptor.radius));

        System.out.println(receptor.volume(receptor.radius));

    }

}
