package POO.onemoreexercise.entities;

import java.time.LocalDate;

public class UsedProduct extends Product {

    private LocalDate manufactureDate;

    public UsedProduct () {

        super ();

    }

    public UsedProduct ( String name, double price, LocalDate manufactureDate ) {

        super ( name, price );

        this.manufactureDate = manufactureDate;

    }

}
