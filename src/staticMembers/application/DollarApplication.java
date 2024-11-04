package src.staticMembers.application;

import java.util.Scanner;

import java.util.Locale;

import src.staticMembers.entities.DollarEntity;

public class DollarApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveDollar();

    }

    private static void receiveDollar () {

        DollarEntity receptor = new DollarEntity();

    }

}
