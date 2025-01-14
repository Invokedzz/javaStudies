package generics.map.fifthencounter.src.model.entities;

import java.util.Objects;

import java.util.concurrent.ThreadLocalRandom;

public abstract class General {

    private String name;

    private Long id;

    public General () {}

    public General ( String name, Long id ) {

        this.name = name;

        this.id = ThreadLocalRandom.current().nextLong( 0, 10_000 );

    }

    public String getName () {

        return name;

    }

    public Long getId () {

        return id;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof General general)) return false;
        return Objects.equals(getId(), general.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

}
