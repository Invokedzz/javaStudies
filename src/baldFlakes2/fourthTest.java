package src.baldFlakes2;

import java.util.Scanner;

public class fourthTest {

    public static void main (String[] args) {

        fTest(args);

    }

    public static void fTest (String[] args) {

        Scanner init = new Scanner(System.in);

        double inBetween;

        inBetween = init.nextDouble();

        if (inBetween >= 0 && inBetween <= 25) System.out.println("First interval");

        else if (inBetween > 25 && inBetween <= 50) System.out.println("Second interval");

        else if (inBetween > 50 && inBetween <= 75) System.out.println("Third interval");

        else if (inBetween > 75 && inBetween <= 100) System.out.println("Fourth Interval");

        else System.out.println("Invalid. Plague");

        init.close();

    }

}
