package content.POO.application;

import java.util.Scanner;

import java.util.Locale;

import content.POO.entity.OverloadEntity;

import content.POO.entity.FunctionsComments;

import content.POO.entity.IfElseOverload;

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

        validateElementsSentByUser(OverloadEntity.name, OverloadEntity.receivedValue, OverloadEntity.totalValueObtained);

        receiveInfo(OverloadEntity.name, OverloadEntity.receivedValue, OverloadEntity.totalValueObtained);

    }

    public static void receiveInfo (String name, double receivedValue, double totalValueObtained) {

        OverloadEntity product = new OverloadEntity();

        product.overloadConstructor(name, totalValueObtained);

        product.constructorOverloadEntity(name, receivedValue, totalValueObtained);

        product.currentValueAccount(totalValueObtained);

        System.out.println(product.addedValuesTotal(receivedValue, totalValueObtained));

    }

    public static void validateElementsSentByUser (String name, double receivedValue, double totalValueObtained) {

        boolean receiveValues = IfElseOverload.validationForElements(name, receivedValue, totalValueObtained);

        if (receiveValues) System.out.println("Values ok");

    }

}
