package localstore.app;

import localstore.entities.classes.Worker;

import localstore.entities.enums.StoreOrders;

import localstore.entities.classes.Store;

import localstore.validators.ScannerValidator;

import localstore.entities.enums.WorkerStatus;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class MainStore {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        workerAnalysis(init);

    }

     private static void storeOrdersApp () {

    }

    private static StoreOrders orders (char orderStatus) {

        return switch (orderStatus) {

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

    private static void chooseOptions (Scanner init, char element) {

        switch (element) {

            case 'w' | 'W':

                workerAnalysis(init);

                break;

            case 's' | 'S':

                storeOrdersApp();

                break;

            default:

                System.out.println("Enter a valid option!");

                break;

        }

    }

    private static void workerAnalysis (Scanner init) {

        List <Worker> workerList = new ArrayList<>();

        System.out.println("Enter the number of workers: ");

        int defineWorkersQty = ScannerValidator.intValidation(init);

        for (int i = 0; i < defineWorkersQty; i++) {

            // name, id, period

            System.out.println("Enter the worker name: ");

            String workerName = init.next();

            System.out.println("Enter the worker id: ");

            int workerId = ScannerValidator.intValidation(init);

            while (findWorkerId(workerList, workerId)) {

                System.out.println("This id already exists. Try again! ");

                workerId = ScannerValidator.intValidation(init);

            }

            System.out.println("Enter the worker period ('d', 'a' or 'n': ");

            char periodChoice = init.next().charAt(0);

            WorkerStatus receiveValue = verifyWorkerStatus(periodChoice);

            Worker elementsFromWorker = new Worker(workerName, workerId, receiveValue);

            workerList.add(elementsFromWorker);

            System.out.println(workerList);

        }

    }

    private static WorkerStatus verifyWorkerStatus (char periodChoice) {

        return switch (periodChoice) { // This is called "enhanced switch"

            case 'd' | 'D' -> { // Instead of ':'

                System.out.println("Daytime \n");

                yield WorkerStatus.DAY_TIME; // Yield seems like a type of return;

            }

            case 'a' | 'A' -> {

                System.out.println("Afternoon \n");

                yield WorkerStatus.AFTERNOON;

            }

            case 'n' | 'N' -> {

                System.out.println("Nighttime \n");

                yield WorkerStatus.NIGHT_TIME;

            }

            default -> {

                System.out.println("Not registered");

                yield WorkerStatus.NOT_REGISTERED;

            }

        };

    }

     private static boolean findWorkerId (List <Worker> workerList, int workerId) {

           Worker element = workerList.stream()
                   .filter(x -> x.getWorkerId().equals(workerId))
                   .findFirst().orElse(null);

           return element != null;

     }

     private static int returnWorkerPosition (List <Worker> workerList, int workerId) {

        for (int i = 0; i < workerList.size(); i++) {

            if (workerList.get(i).getWorkerId().equals(workerId)) return i;

        }

        return -1;

     }

}