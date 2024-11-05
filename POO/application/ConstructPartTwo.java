package POO.application;

import POO.entity.DestroyPartTwo;

import java.util.Scanner;

import java.util.Locale;

public class ConstructPartTwo {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveBothValues();

    }

    public static void receiveBothValues () {

        Scanner initSc = new Scanner (System.in);

        String receiveName = initSc.next();

        double totalValue = initSc.nextDouble();

        double addValueTo = initSc.nextDouble();

        DestroyPartTwo productConstructor = new DestroyPartTwo(receiveName, totalValue, addValueTo);

        System.out.println(DestroyPartTwo.returnFinalValues(totalValue, addValueTo));

        System.out.println(productConstructor);

    }

}
