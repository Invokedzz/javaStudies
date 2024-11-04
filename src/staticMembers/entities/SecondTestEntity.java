package src.staticMembers.entities;

public class SecondTestEntity {

    public double radius;

    public static double PI = 3.14;

    public static double circumference(double radius) {

        return PI * radius * 2.00;

    }

    public static double volume(double radius) {

        return Math.pow(radius, 3) * 4.00 * PI;

    }

}
