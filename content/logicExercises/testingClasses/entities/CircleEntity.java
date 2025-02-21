package content.logicExercises.testingClasses.entities;

public class CircleEntity {

    public double r;

    public double calcArea () {

        double receiveRadius = Math.pow(r, 2);

        double receivePi = Math.PI;

        return receiveRadius * receivePi;

    }

}
