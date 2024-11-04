package src.staticMembers.application;

import src.staticMembers.entities.ConesEntity;

import java.util.Scanner;

import java.util.Locale;

public class ConesApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveAllTheValues();

    }

    public static void receiveAllTheValues () {

        Scanner initSc = new Scanner(System.in);

        ConesEntity.radius = initSc.nextDouble();

        ConesEntity.g = initSc.nextDouble();

        ConesEntity.calculateTheArea(ConesEntity.g, ConesEntity.radius);

        ConesEntity.showTheArea();

    }

}
