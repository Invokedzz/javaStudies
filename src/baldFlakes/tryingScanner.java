package src.baldFlakes;

import java.util.Scanner;

public class tryingScanner {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        System.out.println("We received: " + x);

        main2(args);

        sc.close();

    }

    public static void main2 (String[] args) {

        Scanner sorocaba = new Scanner(System.in);

        System.out.println("Okay. Type a number, pal");

        int randomValue = sorocaba.nextInt();

        double anotherRandomValue = sorocaba.nextDouble();

        System.out.println("We received: " + randomValue + " " + anotherRandomValue);

        sorocaba.close();

    }

}
