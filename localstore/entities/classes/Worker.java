package localstore.entities.classes;

import localstore.entities.enums.WorkerStatus;

public class Worker {

    private String workerName;

    private Integer workerId;

    private WorkerStatus workerPeriod;

    public Worker (String workerName, Integer workerId, WorkerStatus workerPeriod) {

        this.workerName = workerName;

        this.workerId = workerId;

        this.workerPeriod = workerPeriod;

    }

    public Integer getWorkerId () {

        return workerId;

    }

    @Override
    public String toString () {

        return "Name: " + workerName
                + " Id: " + workerId
                + " Period: " + workerPeriod;

    }

}
