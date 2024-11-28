package localstore.app;

import localstore.entities.classes.Worker;

import localstore.entities.classes.Store;

import localstore.entities.enums.StoreOrders;

import localstore.status.VerifyOrder;

import localstore.status.VerifyWorker;

import localstore.validators.ScannerValidator;

import localstore.entities.enums.WorkerStatus;

import java.time.LocalDate;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class MainStore {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        System.out.println("Enter with w (worker) or s (store): ");

        char userInput = init.next().charAt(0);

        chooseOptions(init, userInput);

    }

     private static void storeOrdersApp (Scanner init) {

        List <Store> storeList = new ArrayList<>();

        System.out.println("Enter the number of products: ");

        int defineProductsQty = ScannerValidator.intValidation(init);

        for (int i = 0; i < defineProductsQty; i++) {

            // name, id, time, status

            System.out.println("Enter the product name: ");

            String productName = init.next();

            System.out.println("Enter the product id: ");

            int productId = ScannerValidator.intValidation(init);

            while (findProductId(storeList, productId)) {

                System.out.println("This id already exists. Try again. \n");

                productId = ScannerValidator.intValidation(init);

            }

            System.out.println("Enter the product status: ");

            char orderOption = init.next().charAt(0);

            LocalDate displayDate = LocalDate.now();

            StoreOrders order = VerifyOrder.displayOrders(orderOption);

            Store mainElement = new Store(productName, productId, displayDate, order);

            storeList.add(mainElement);

            System.out.println(storeList);

        }

    }

    private static void chooseOptions (Scanner init, char element) {

        switch (element) {

            case 'w' | 'W':

                workerAnalysis(init);

                break;

            case 's' | 'S':

                storeOrdersApp(init);

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

            WorkerStatus receiveValue = VerifyWorker.displayWorkerStatus(periodChoice);

            Worker elementsFromWorker = new Worker(workerName, workerId, receiveValue);

            workerList.add(elementsFromWorker);

            System.out.println(workerList);

        }

    }


     private static boolean findWorkerId (List <Worker> workerList, int workerId) {

           Worker element = workerList.stream()
                   .filter(x -> x.getWorkerId().equals(workerId))
                   .findFirst().orElse(null);

           return element != null;

     }

     private static boolean findProductId (List <Store> orderList, int productId) {

        Store element = orderList.stream()
                .filter(x -> x.getProductId().equals(productId))
                .findFirst().orElse(null);

        return element != null;

     }

     private static int returnWorkerPosition (List <Worker> workerList, int workerId) {

        for (int i = 0; i < workerList.size(); i++) {

            if (workerList.get(i).getWorkerId().equals(workerId)) return i;

        }

        return -1;

     }

     private static int returnStorePosition (List <Store> productList, int productId) {

        for (int i = 0; i < productList.size(); i++) {

            if (productList.get(i).getProductId().equals(productId)) return i;

        }

        return -1;

     }

}
