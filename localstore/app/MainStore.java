package localstore.app;

import localstore.entities.classes.Worker;
import localstore.entities.enums.StoreOrders;

import localstore.entities.classes.Store;
import localstore.entities.enums.WorkerStatus;

import java.time.LocalDate;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class MainStore {

    public static void main (String[] args) {

    }

    private static void storeOrdersApp () {

    }

    private static void workerAnalysis (Scanner init) {

        List <Worker> workerList = new ArrayList<>();

        int defineWorkersQty = init.nextInt();

        for (int i = 0; i < defineWorkersQty; i++) {
            // name, id, period

            System.out.println("Enter the worker name: ");

            String workerName = init.next();

            System.out.println("Enter the worker id: ");

            int workerId = init.nextInt();

            System.out.println("Enter the worker period: ");

            char periodChoice = init.next().charAt(0);

            WorkerStatus receiveValue = verifyWorkerStatus(periodChoice);

        }

    }

    private static WorkerStatus verifyWorkerStatus (char periodChoice) {

        switch (periodChoice) {
            case 'd' | 'D':

                

        }

    }

    private static int findWorkerId () {

    }

}
