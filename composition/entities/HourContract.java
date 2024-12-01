package composition.entities;

import java.time.LocalDate;

public class HourContract {

    private LocalDate date;

    private Double valuePerHour;

    private Integer hours;

    public HourContract (LocalDate date, Double valuePerHour, Integer hours) {

        this.date = date;

        this.valuePerHour = valuePerHour;

        this.hours = hours;

    }

    public Integer getHours () {
        return hours;
    }

    public Double getValuePerHour () {
        return valuePerHour;
    }

    public LocalDate getDate () {
        return date;
    }

    public void setDate (LocalDate date) {
        this.date = date;
    }

    public void setHours (Integer hours) {
        this.hours = hours;
    }

    public void setValuePerHour (Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

}