package content.POO.entitiesTwo;

public class EntityOverload {

    public static String name;

    public static double hungry;

    public static double health;

    public static int age;

    public static void viewAllElements (String name, int age, double health, double hungry) {

        EntityOverload.name = name;
        EntityOverload.age = age;
        EntityOverload.health = health;
        EntityOverload.hungry = hungry;

    }

    public String toString () {

        return name +
                " " + age +
                " " + health +
                " " + hungry;

    }

    public String analyzeItsHappiness () {

        double happiness = (health + hungry) * hungry / health;
        return "Its happiness must be above 70: " + happiness;

    }

}
