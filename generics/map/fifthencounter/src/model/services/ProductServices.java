package generics.map.fifthencounter.src.model.services;

import generics.map.fifthencounter.src.model.entities.Client;

import generics.map.fifthencounter.src.model.entities.Novel;

import java.util.Map;

public interface ProductServices {

    Map < ?, ? > createMapList ();

    default Double payment ( Client client, Novel novel ) {

        if ( client.getBalance() < novel.getPrice() ) return client.getBalance();

        System.out.println( "Payment successful!" );

        return client.getBalance() - novel.getPrice();

    }

}
