package content.LambdaJavaDoc.src.Example4th.src.model.entities;

public class Person {

    public enum SayGex {

        MALE,

        FEMALE,

    }

    private String name;

    private Integer age;

    private SayGex sex;

    public Person () {}

    public Person ( String name, Integer age, SayGex sex ) {

        this.name = name;

        this.age = age;

        this.sex = sex;

    }

    public Integer getAge () {

        return age;

    }

    public SayGex getSex () {

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
