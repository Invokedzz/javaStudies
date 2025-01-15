package generics.map.fifthencounter.src.model.services;

import generics.map.fifthencounter.src.model.entities.Client;

import generics.map.fifthencounter.src.model.entities.Novel;

import java.util.LinkedHashMap;

import java.util.List;

import java.util.Map;

public class NovelServices implements ProductServices {

    private Client client;

    private Novel novel;

    public NovelServices () {}

    public NovelServices ( Client client, Novel novel ) {

        this.client = client;

        this.novel = novel;

    }

    public Client getClient () {

        return client;

    }

    public Novel getNovel () {

        return novel;

    }

    @Override
    public Map <?, ?> createMapList() {

        Map < Client, List < Novel > > map = new LinkedHashMap<>();

        map.put( getClient(), List.of( getNovel() ) );

        for ( Map.Entry < Client, List <Novel> > entry : map.entrySet() ) {

            System.out.printf( entry.getKey().getName() + " " );

            for ( Novel novel : entry.getValue() ) {

                System.out.println( novel.getName() );

            }

        }

        return map;

    }

    @Override
    public Double receivePaymentCredits () {

        Map < ?, ? > map = createMapList();

        if ( map.containsValue( List.of( getNovel() ) ) && map.containsKey( getClient() )) return payment( getClient(), getNovel() );

        return 0.0;

    }

}
