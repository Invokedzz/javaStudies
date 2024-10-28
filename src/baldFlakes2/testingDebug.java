package src.baldFlakes2;

import java.util.Scanner;

public class testingDebug {

    public static void main (String[] args) {

        Scanner initScanner = new Scanner (System.in);

        double height = initScanner.nextDouble();

        double width = initScanner.nextDouble();

        double area = width * height;

        double totalPrice = Math.pow(area, 2);

        System.out.println(area);

        System.out.printf("R$ %s", totalPrice);

    }

}
