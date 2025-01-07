package practice.src.model.entities;

import java.time.LocalDate;

public class Installment {

    // dueDate: LocalDate, amount: Double

    private LocalDate dueDate;

    private Double amount;

    public Installment () {}

    public Installment ( LocalDate dueDate, Double amount ) {

        this.dueDate = dueDate;

        this.amount = amount;

    }

    public LocalDate getDueDate () {

        return dueDate;

    }

    public Double getAmount () {

        return amount;

    }

    public void setAmount ( Double amount ) {

        this.amount = amount;

    }

}
