package LambdaJavaDoc.src.SecondExample.src.model.entities;

public class Person {

    public enum Sex {

        MALE, FEMALE;

    }

    private String name;

    private Integer age;

    private Sex sex;

    public Person () {}

    public Person ( String name, Integer age, Sex sex ) {

        this.name = name;

        this.age = age;

        this.sex = sex;

    }

    public String getName () {

        return name;

    }

    public Integer getAge () {

        return age;

    }

    public Sex getSex () {

        return sex;

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

}
