package content.POO.entitiesTwo;

public class WorkerEntity {

    public String workerName;

    public double workerSalary;

    public double checkSalary;

    public void workerConstructor (String workerName, double workerSalary, double checkSalary) {

        this.workerName = workerName;
        this.workerSalary = workerSalary;
        this.checkSalary = checkSalary;

    }

    public String returnWorkerName () {

        return workerName;

    }

    public String returnWorkerSalary () {

        return "$ " + workerSalary;

    }

    public double reviewSalary (double checkSalary) {

        return workerSalary * (checkSalary / 100) + workerSalary;

    }

}
