package POO.onemoreexercise.entities;

public class ImportedProduct extends Product {

    private double customsFee;

    public ImportedProduct () {

        super ();

    }

    public ImportedProduct ( String name, double price, double customsFee ) {

        super( name, price );

        this.customsFee = customsFee;

    }

}
