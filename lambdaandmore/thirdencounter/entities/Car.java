package lambdaandmore.thirdencounter.entities;

public class Car {

    private String model;

    private String color;

    private Integer date;

    public Car () {}

    public Car ( String model, String color, Integer date ) {

        this.model = model;

        this.color = color;

        this.date = date;

    }

    public String getModel() {
        return model;
    }

    public Integer getDate() {
        return date;
    }

    public String getColor() {
        return color;
    }
}
