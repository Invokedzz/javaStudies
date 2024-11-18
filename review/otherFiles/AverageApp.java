package review.otherFiles;

import review.otherFiles.AverageEntity;

import java.util.Scanner;

import java.util.Locale;

public class AverageApp {

    public static void main (String[] args) {

        Locale.setDefault(Locale.GERMAN);

        ourApplication();

    }

    private static void ourApplication () {

        Scanner init = new Scanner (System.in);

        int valueForArrays = init.nextInt();

        double [] height = new double[valueForArrays];

        char [] genders = new char[valueForArrays];

        AverageEntity product = new AverageEntity(height, genders);

         for (int i = 0; i < valueForArrays; i++) {

             System.out.println("Enter the height: ");

             height[i] = init.nextDouble();

             System.out.println("Enter the gender: ");

             genders[i] = init.next().charAt(0);

         }

         double lowHeight = 0;

         double highHeight = 0;

         for (int i = 1; i < valueForArrays; i++) {
             if (height[i] > highHeight) highHeight = height[i];
             else if (height[i] < lowHeight) lowHeight = height[i];
         }

         int qtyMen, qtyWomen, averageTotal;

         qtyMen = 0;

         qtyWomen = 0;

         averageTotal = 0;

         for (int i = 1; i < valueForArrays; i++) {

             if (genders[i] == 'M') qtyMen++;

             else {
                 qtyWomen++;
                 averageTotal += (int) height[i];
             }

        }

    }

}
