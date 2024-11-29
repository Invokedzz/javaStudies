package localstore.entities.classes;

import localstore.entities.enums.StoreOrders;

import java.time.LocalDate;

public class Store {

    // name, id, time, status;

    private final String PRODUCT_NAME;

    private final Integer PRODUCT_ID;

    private final LocalDate TIME;

    private final StoreOrders STATUS;

    public Store (String PRODUCT_NAME, Integer PRODUCT_ID, LocalDate TIME, StoreOrders STATUS) {

        this.PRODUCT_NAME = PRODUCT_NAME;

        this.PRODUCT_ID = PRODUCT_ID;

        this.TIME = TIME;

        this.STATUS = STATUS;

    }

    public Integer getProductId () {

        return PRODUCT_ID;

    }

    @Override
    public String toString () {

        return "Name: " + PRODUCT_NAME
                + " Id: " + PRODUCT_ID
                + " Time: " + TIME
                + " Status: " + STATUS;

    }

}
