package content.POO.onemoreexercise.entities;

import java.time.LocalDate;

import java.time.format.DateTimeFormatter;

public final class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct () {

        super ();

    }

    public UsedProduct ( String name, double price, LocalDate manufactureDate ) {

        super ( name, price );

        this.manufactureDate = manufactureDate;

    }

    @Override
    public String priceTag() {

        return getName()
                + " (used) $ "
                + String.format("%.2f", getPrice())
                + " (Manufacture date: "
                + manufactureDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                + ")";
        
    }

}
