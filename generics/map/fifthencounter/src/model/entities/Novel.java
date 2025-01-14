package generics.map.fifthencounter.src.model.entities;

public final class Novel extends General {

    private Double price;

    public Novel () {

        super ();

    }

    public Novel ( String name, Long id, Double price ) {

        super ( name, id );

        this.price = price;

    }

    public Double getPrice () {

        return price;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( getName() )
                .append( ", Id: " ).append( getId() )
                .append( ", Price: $").append( getPrice() );

        return sb.toString();

    }

}
