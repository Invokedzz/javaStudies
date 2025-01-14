package generics.map.fifthencounter.src.model.entities;

import java.util.concurrent.ThreadLocalRandom;

public class Client extends General {

    private Double balance;

    public Client () {

        super ();

    }

    public Client ( String name, Long id, Double balance ) {

        super ( name, id );

        this.balance = balance;

    }

    public Double getBalance () {

        return balance;

    }


    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: ").append( getName() )
                .append( ", Id: " ).append( getId() )
                .append( ", Balance: $").append( getBalance() );

        return sb.toString();

    }

}
