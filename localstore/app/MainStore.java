package localstore.app;

import localstore.entities.classes.Worker;
import localstore.entities.enums.StoreOrders;

import localstore.entities.classes.Store;

import localstore.entities.enums.WorkerStatus;

import java.util.Scanner;

import java.util.ArrayList;

import java.util.List;

public class MainStore {

    public static void main (String[] args) {

        Scanner init = new Scanner (System.in);

        workerAnalysis(init);

    }

    /* private static void storeOrdersApp () {

    } */

    private static void workerAnalysis (Scanner init) {

        List <Worker> workerList = new ArrayList<>();

        int defineWorkersQty = init.nextInt();

        for (int i = 0; i < defineWorkersQty; i++) {
            // name, id, period

            System.out.println("Enter the worker name: ");

            String workerName = init.next();

            System.out.println("Enter the worker id: ");

            int workerId = init.nextInt();

            while (findWorkerId(workerList, workerId)) {

                System.out.println("This id already exists. Try again! ");

                workerId = init.nextInt();

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

}
