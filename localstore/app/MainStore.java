package localstore.app;

import localstore.entities.classes.Worker;

import localstore.entities.enums.StoreOrders;

import localstore.entities.classes.Store;

import localstore.status.verifyWorker;

import localstore.status.verifyOrder;

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

            WorkerStatus receiveValue = verifyWorker.displayWorkerStatus(periodChoice);

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

     private static int returnWorkerPosition (List <Worker> workerList, int workerId) {

        for (int i = 0; i < workerList.size(); i++) {

            if (workerList.get(i).getWorkerId().equals(workerId)) return i;

        }

        return -1;

     }

}
