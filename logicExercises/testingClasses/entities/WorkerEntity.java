package logicExercises.testingClasses.entities;

public class WorkerEntity {

    public String Name;

    public double GrossSalary;

    public double Tax;

    public String netInformation () {

        return Name + " " + "$" + GrossSalary + " " + "$" + Tax;

    }

    public void netSalary (double por) {

        GrossSalary += GrossSalary * (por / 100.0);

    }

    public String newValue () {

        return Name + " " + GrossSalary;

    }


}
