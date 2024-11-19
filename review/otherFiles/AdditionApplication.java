package review.otherFiles;

import review.otherFiles.AdditionEntity;

import java.util.Scanner;

public class AdditionApplication {

    public static void main (String[] args) {

        startMainProject();

    }

    private static void startMainProject () {

        Scanner initSc = new Scanner (System.in);

        int valueForArraysParameters = initSc.nextInt();

        Integer [] controlVariable = new Integer[valueForArraysParameters];

        Double [] valuesSentByUsers = new Double[valueForArraysParameters];

        for (int i = 0; i < controlVariable.length; i++) {

            System.out.println("Enter a value: ");

            valuesSentByUsers[i] = initSc.nextDouble();

            AdditionEntity product = new AdditionEntity(valuesSentByUsers[i]);

            double saveValues = product.addValuesToVariable(valuesSentByUsers[i]);

            System.out.println(saveValues);

        }

    }

}
