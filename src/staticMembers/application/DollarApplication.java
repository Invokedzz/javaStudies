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

        Scanner initSc = new Scanner (System.in);

        DollarEntity.dollarCurrentValue = initSc.nextDouble();

        DollarEntity.productBoughtByUser = initSc.nextDouble();

        DollarEntity.returnValues(DollarEntity.dollarCurrentValue, DollarEntity.productBoughtByUser);

        System.out.println(DollarEntity.taxesUponTheValue());
    }

}
