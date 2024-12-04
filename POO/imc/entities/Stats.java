package POO.imc.entities;

public class Stats {

    private final double weight;

    private final double height;

    private final Patient patient;

    public Stats (double weight, double height, Patient patient) {

        this.weight = weight;

        this.height = height;

        this.patient = patient;

    }

    public double calculusImc (double weight, double height) {

        return weight / (height * height);

    }

    @Override
    public String toString () {

        return "Weight: " + weight +
                "kg" + " Height: " + height
                + "m " + patient;

    }

}
