package src.staticMembers.application;

import src.staticMembers.entities.CircumferenceEntity;

import java.util.Scanner;

import java.util.Locale;

public class CircumferenceApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveCircumference();

    }

    public static void receiveCircumference () {

        Scanner initSc = new Scanner (System.in);

        CircumferenceEntity receptor = new CircumferenceEntity();

        receptor.radius = initSc.nextDouble();

        System.out.println(CircumferenceEntity.circumference(receptor.radius));

        System.out.println(CircumferenceEntity.volume(receptor.radius));

    }

}
