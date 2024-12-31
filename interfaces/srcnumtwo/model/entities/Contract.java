package interfaces.srcnumtwo.model.entities;

import java.time.LocalDate;

import java.util.ArrayList;

import java.util.List;

public final class Contract {

    // number (Integer), date (LocalDate), totalValue (Double)

    private Integer number;

    private LocalDate date;

    private Double totalValue;

    List < Installment > installmentList = new ArrayList<>();

    public Contract () {}

    public Contract ( Integer number, LocalDate date, Double totalValue ) {

        this.number = number;

        this.date = date;

        this.totalValue = totalValue;

    }

    public Integer getNumber () {

        return number;

    }

    public LocalDate getDate () {

        return date;

    }

    public Double getTotalValue () {

        return totalValue;

    }

    public List < Installment > getInstallmentList () {

        return installmentList;

    }

}
