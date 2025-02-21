package content.POO.EntityFour;

public class FarmEntity {

    private String animalsName;

    private double animalsHumor;

    private double animalsBoredom;

    private double animalsHappiness;

    public FarmEntity (String animalsName) {

        this.animalsName = animalsName;

        this.animalsBoredom = 50.0;

        this.animalsHumor = 50.0;

        this.animalsHappiness = 50.0;

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

    public void feedAllOfThem (double foodQty) {

        animalsHappiness += foodQty + (animalsHappiness * 0.05);
        animalsHumor += 5.25;

    }

    public void playWithThem (double animalsHappiness, double playTime) {

        animalsBoredom -= (playTime + animalsHappiness) - playTime * 0.70;

    }

}
