package localstore.status;

import localstore.entities.enums.StoreOrders;

public class VerifyOrder {

    private static StoreOrders orders (char element) {

        return switch (element) {

            case 'p' | 'P' -> {

                System.out.println("Pending payment. \n");

                yield StoreOrders.PENDING_PAYMENT;

            }

            case 'a' | 'A' -> {

                System.out.println("Payment approved! \n");

                yield StoreOrders.PAYMENT_APPROVED;

            }

            case 's' | 'S' -> {

                System.out.println("Product shipped. \n");

                yield StoreOrders.PRODUCT_SHIPPED;

            }

            case 'd' | 'D' -> {

                System.out.println("Product delivered. \n");

                yield StoreOrders.DELIVERED;

            }

            default -> {

                System.out.println("Product was not found in the database");

                yield StoreOrders.NOT_FOUND;

            }

        };

    }

    public static StoreOrders displayOrders (char element) {

        return orders(element);

    }

}
