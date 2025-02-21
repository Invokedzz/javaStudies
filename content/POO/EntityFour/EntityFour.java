package content.POO.EntityFour;

public class EntityFour {

    private final String vehicleName;

    private double totalGasInTheVehicle;

    private double literUsed;

    public EntityFour (String vehicleName, double totalGasInTheVehicle) {

        this.vehicleName = vehicleName;

        this.totalGasInTheVehicle = 0;

    }

    public String toString () {

        return vehicleName
                + " " + totalGasInTheVehicle;

    }

    public void useGasInATrip (double literUsed, double kmsUsed) {

        totalGasInTheVehicle -= kmsUsed / literUsed;

    }

    public void addGasAfterATrip (double literUsed) {

        totalGasInTheVehicle += literUsed;

    }

    public String getVehicleName () {
        return vehicleName;
    }

    public double getTotalGasInTheVehicle () {
        return totalGasInTheVehicle;
    }

    public double getLiterUsed () {
        return literUsed;
    }

}
