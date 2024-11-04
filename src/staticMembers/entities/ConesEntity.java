package src.staticMembers.entities;

public class ConesEntity {

    public static double PI = 3.14;

    public static double radius, g, area;

    public static double calculateTheArea (double g, double radius) {

        area = PI * radius * (radius + g);

        return area;

    }

    public static void showTheArea () {

        System.out.println(area);

    }

}
