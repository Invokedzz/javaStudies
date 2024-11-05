package POO.application;

import java.util.Scanner;

import java.util.Locale;

import POO.entity.OverloadEntity;

import POO.entity.FunctionsComments;

public class OverloadApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.GERMAN);

        ourApplication();

    }

    public static void ourApplication () {

        Scanner initSc = new Scanner (System.in);

        FunctionsComments init = new FunctionsComments();

        init.insertYourName();

        OverloadEntity.name = initSc.next();

        init.insertTotalObtained();

        OverloadEntity.receivedValue = initSc.nextDouble();

        init.insertYourCurrentValue();

        OverloadEntity.totalValueObtained = initSc.nextDouble();

        receiveInfo(OverloadEntity.name, OverloadEntity.receivedValue, OverloadEntity.totalValueObtained);

    }

    public static void receiveInfo (String name, double receivedValue, double totalValueObtained) {

        OverloadEntity product = new OverloadEntity();

        product.constructorOverloadEntity(name, receivedValue, totalValueObtained);

        System.out.println(product.addedValuesTotal(receivedValue, totalValueObtained));

    }

}
