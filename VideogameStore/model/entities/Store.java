package VideogameStore.model.entities;

import VideogameStore.model.entities.UserProfile;

import VideogameStore.model.entities.GamesOverlook;

import VideogameStore.model.enums.DeliveryStatus;

public class Store {

    private final UserProfile profile;

    private final GamesOverlook overlook;

    private final DeliveryStatus status;

    public Store (UserProfile profile, GamesOverlook overlook, DeliveryStatus status) {

        this.profile = profile;

        this.overlook = overlook;

        this.status = status;

    }

    public DeliveryStatus canShip (DeliveryStatus stats) {

        if (DeliveryStatus.PROCESSING_PAYMENT.equals(stats)) {

            System.out.println("The game can be shipped");

            return DeliveryStatus.CAN_BE_SHIPPED;

        }

        return DeliveryStatus.CANNOT_BE_SHIPPED;

    }

    @Override
    public String toString () {

        return "Profile: " + profile
                + " General Information: " + overlook
                + " Delivery status: \n" + status;

    }

}
