package arrays.Exercises;

import java.util.Scanner;

import java.util.Locale;

public class SecondArray {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        Scanner initSc = new Scanner (System.in);

        int controlValue = initSc.nextInt();

        String [] vector = new String [controlValue];

        double [] vectorForProducts = new double[controlValue];

        for (int x = 0; x < controlValue; x ++) {

            System.out.println("Enter the product name");

            vector [x] = initSc.next();

            System.out.println("Enter the values for each product");

            vectorForProducts [x] = initSc.nextDouble();

            System.out.printf("%s and %s\n", vector[x], vectorForProducts[x]);

        }

        double receiveAllProductsValues = 0.0;

        for (int y = 0; y < controlValue; y ++) {

            receiveAllProductsValues += vectorForProducts[y];

        }

        double finalResult = receiveAllProductsValues / controlValue;

        System.out.println(finalResult);

    }

}
