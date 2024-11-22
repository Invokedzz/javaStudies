package arrays.ArrayList.entities;

public class ExeArrayListPartTwo {

    private String workAs;

    private String carModel;

    private Integer carId;

    public ExeArrayListPartTwo (String workAs, String carModel, Integer carId) {

        this.workAs = workAs;

        this.carModel = carModel;

        this.carId = carId;

    }

    @Override
    public String toString () {

        return workAs + " "
                + carModel + " "
                + carId;

    }

    public Integer getCarId () {
        return carId;
    }

}
