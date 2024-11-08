package POO.EntityFour;

public class EntityFour {

    private String vehicleName;

    private double totalGasInTheVehicle;

    private double reduceOrObtainGas;

    public EntityFour (String vehicleName, double totalGasInTheVehicle) {

        this.vehicleName = vehicleName;

        this.totalGasInTheVehicle = 0;

    }

    public String toString () {

        return vehicleName
                + " " + totalGasInTheVehicle;

    }

    public void useGasInATrip () {

    }

    public void addGasAfterATrip () {
        
    }

}
