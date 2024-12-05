package POO.randomstuff.entities;

public class RandomEntitiesForRandomTests {

    private String writeSomethingHere;

    public RandomEntitiesForRandomTests (String writeSomethingHere) {

        this.writeSomethingHere = writeSomethingHere;

    }

    public String getWriteSomethingHere () {

        return writeSomethingHere;

    }

    public void setWriteSomethingHere (String writeSomethingHere) {

        this.writeSomethingHere = writeSomethingHere;

    }

    public String returnSomeKindOfDumbText (String writeSomethingHere) {

        return "Dumb shit: " + writeSomethingHere;

    }

}
