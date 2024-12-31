package interfaces.srcnumtwo.model.entities;

import java.time.LocalDate;

public final class Installment {

    // dueDate (LocalDate), Amount (Double)

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

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Due Date: " ).append( getDueDate() )
                .append( " Amount: " ).append( getAmount() );

        return sb.toString();

    }

}
