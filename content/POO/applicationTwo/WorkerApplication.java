package content.POO.applicationTwo;

import java.util.Scanner;

import java.util.Locale;

import content.POO.entitiesTwo.WorkerEntity;

public class WorkerApplication {

    public static void main (String[] args) {

        Locale.setDefault(Locale.ITALIAN);

        receiveWorkerMainAttributes();

    }

    public static void receiveWorkerMainAttributes () {

        Scanner initSc = new Scanner (System.in);

        WorkerEntity product = new WorkerEntity();

        product.workerName = initSc.next();

        product.workerSalary = initSc.nextDouble();

        product.checkSalary = initSc.nextDouble();

        System.out.println(product.returnWorkerName());

        System.out.println(product.reviewSalary(product.checkSalary));

    }

}
