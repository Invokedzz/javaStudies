package src.staticMembers.application;

import java.util.Scanner;

import java.util.Locale;

public class FirstTest {

    public static final double PI = 3.14;

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        initialValues();

    }

    public static void initialValues () {

        Scanner initSc = new Scanner (System.in);

        System.out.println("Insert the measures for radius");

        double radiusValue = initSc.nextDouble();

        double circumferenceCall = circumference(radiusValue);

        double volumeCall = volume(radiusValue);

        System.out.printf("Circumference: %s ", circumferenceCall);

        System.out.printf("Volume: %s ", volumeCall);

    }

    public static double circumference (double radius) {

        return 2.0 * PI * radius;

    }

    public static double volume (double radius) {

        return (Math.pow(radius, 3) * 4.0 * PI) / 3.00;

    }

}
