package generics.map.secondencounter.src.model.entities;

import java.util.Objects;

public class Candidate {

    private String candidateName;

    private Integer id;

    public Candidate () {}

    public Candidate ( String candidateName, Integer id ) {

        this.candidateName = candidateName;

        this.id = id;

    }

    public String getCandidateName () {

        return candidateName;

    }

    public Integer getId () {

        return id;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Candidate candidate)) return false;
        return Objects.equals(getCandidateName(), candidate.getCandidateName());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getCandidateName());
    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( getCandidateName() ).append( ", " ).append( getId() );

        return sb.toString();

    }

}
