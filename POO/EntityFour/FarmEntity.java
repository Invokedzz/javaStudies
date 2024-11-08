package POO.EntityFour;

public class FarmEntity {

    private String animalsName;

    private double animalsHumor;

    private double animalsBoredom;

    private double animalsHappiness;

    public FarmEntity (double animalsHumor, double animalsBoredom, double animalsHappiness) {

        this.animalsBoredom = animalsBoredom;

        this.animalsHumor = animalsHumor;

        this.animalsHappiness = animalsHappiness;

    }

    public FarmEntity (String animalsName) {

        this.animalsName = animalsName;

    }

    public String toString () {

        return animalsName
                + " " +
                animalsHappiness
                + " " +
                animalsHumor
                + " " +
                animalsBoredom;

    }

    public void feedAllOfThem () {

    }

    public void playWithThem () {

    }

}
