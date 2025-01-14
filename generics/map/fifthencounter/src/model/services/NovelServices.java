package generics.map.fifthencounter.src.model.services;

import generics.map.fifthencounter.src.model.entities.Client;

import generics.map.fifthencounter.src.model.entities.Novel;

import java.util.LinkedHashMap;

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

        Map < Client, Novel > map = new LinkedHashMap<>();

        map.put( getClient(), getNovel() );

        for ( Object key : map.keySet() ) {

            System.out.printf( "%s\n%s", key, map.keySet() );

        }

        return Map.of();

    }

}
