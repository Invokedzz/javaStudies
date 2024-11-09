package arrays.entities;

public class SixthExerciseEntity {

    private String name;

    private double age;

    private double height;

    public SixthExerciseEntity (String name, double age, double height) {

        this.name = name;

        this.age = age;

        this.height = height;

    }

    public String toString () {
        return name
                + " " + age
                + " " + height;
    }

    public String getName () {
        return name;
    }

    public double getAge () {
        return age;
    }

    public double getHeight () {
        return height;
    }

}
