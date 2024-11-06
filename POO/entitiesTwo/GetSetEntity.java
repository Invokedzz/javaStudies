package POO.entitiesTwo;

public class GetSetEntity {

    private String receiveUsername;

    private double currentSalary;

    public GetSetEntity (String receiveUsername, double currentSalary) {

        this.receiveUsername = receiveUsername;

        this.currentSalary = currentSalary;

    }

    public String getUsername () {

        return receiveUsername;

    }

    public double getCurrentSalary () {

        return currentSalary;

    }

    public void setUsername (String receiveUsername) {

        this.receiveUsername = receiveUsername;

    }

    public void setSalary (double currentSalary) {

        this.currentSalary = currentSalary;

    }

}
