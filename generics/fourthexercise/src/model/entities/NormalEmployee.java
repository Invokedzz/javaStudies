package generics.fourthexercise.src.model.entities;

public class NormalEmployee <T> extends Employee <T> {

    public NormalEmployee () {

        super ();

    }

    public NormalEmployee ( String name, String id, Double salary ) {

        super ( name, id, salary );

    }


}
