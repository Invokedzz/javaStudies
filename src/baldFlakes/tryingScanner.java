package src.baldFlakes;

import java.util.Scanner;

import java.util.Locale;

public class tryingScanner {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        String x = sc.next();

        System.out.println("We received: " + x);

        main2(args);

        sc.close();

    }

    public static void main2 (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sorocaba = new Scanner(System.in);

        System.out.println("Okay. Type a number, pal");

        int randomValue = sorocaba.nextInt();

        double anotherRandomValue = sorocaba.nextDouble();

        System.out.printf("We received: %s and %s", randomValue, anotherRandomValue);

        main3(args);

        sorocaba.close();

    }

    public static void main3 (String[] args) {

        Scanner vascoGama = new Scanner(System.in);

        System.out.println("Okay, type 3 random things (int, string, double): ");

        int firstValue = vascoGama.nextInt();

        String secondValue = vascoGama.next();

        double thirdValue = vascoGama.nextDouble();

        System.out.println(firstValue + secondValue + thirdValue);

        vascoGama.close();

    }

}
