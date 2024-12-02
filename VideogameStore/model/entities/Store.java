package VideogameStore.model.entities;

import VideogameStore.model.enums.DeliveryStatus;

public class Store {

    private final UserProfile profile;

    private final GamesOverlook overlook;

    private DeliveryStatus status;

    public Store (UserProfile profile, GamesOverlook overlook, DeliveryStatus status) {

        this.profile = profile;

        this.overlook = overlook;

        this.status = status;

    }

    public Store canShip (DeliveryStatus stats) {

        if (DeliveryStatus.PROCESSING_PAYMENT.equals(stats)) {

            System.out.println("The game can be shipped");

            status = DeliveryStatus.CAN_BE_SHIPPED;

            return new Store(profile, overlook, status);

        }

        status = DeliveryStatus.CANNOT_BE_SHIPPED;

        return new Store(profile, overlook, status);

    }

    @Override
    public String toString () {

        return "Profile: " + profile
                + " General Information: " + overlook
                + " Delivery status: \n" + status;

    }

}
