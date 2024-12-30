package interfaces.src.model.entities;

import java.time.LocalDate;

import java.util.List;

import java.util.ArrayList;

public class Contract {

    private LocalDate date;

    private Integer number;

    private Double totalValue;

    List < Installment > installmentList = new ArrayList<>();

    public Contract () {}

    public Contract ( LocalDate date, Integer number, Double totalValue ) {

        this.date = date;

        this.number = number;

        this.totalValue = totalValue;

    }

    public LocalDate getDate () {

        return date;

    }

    public Integer getNumber () {

        return number;

    }

    public Double getTotalValue () {

        return totalValue;

    }

    public List < Installment > getInstallmentList () {

        return installmentList;

    }

}
