package src.baldFlakes2.tests;

import java.util.Scanner;

public class gasgasgas {

    public static void main (String[] args) {

        Scanner initSc = new Scanner (System.in);

        int alcohol = 0;

        int gas = 0;

        int dies = 0;

        int typeValue = initSc.nextInt();

        while (typeValue != 4) {

            if (typeValue == 1) alcohol++;

            if (typeValue == 2) gas++;

            if (typeValue == 3) dies++;

            typeValue = initSc.nextInt();

        }

        System.out.printf("Thanks! %s, %s, %s", alcohol, gas, dies);

    }

}
