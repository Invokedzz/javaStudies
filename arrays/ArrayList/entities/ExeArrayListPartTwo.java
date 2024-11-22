package arrays.ArrayList.entities;

public class ExeArrayListPartTwo {

    private String workAs;

    private String carModel;

    private final Integer carId;

    public ExeArrayListPartTwo (String workAs, String carModel, Integer carId) {

        this.workAs = workAs;

        this.carModel = carModel;

        this.carId = carId;

    }

    public ExeArrayListPartTwo (Integer carId) {
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

    public String giveVipToACertainCarId (int carId) {
        return "ID: " + carId + ". You received VIP!";
    }

}
