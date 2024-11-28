package localstore.entities.classes;

import localstore.entities.enums.WorkerStatus;

public class Worker {

    private final String WORKER_NAME;

    private final Integer ID;

    private final WorkerStatus PERIOD;

    public Worker (String WORKER_NAME, Integer ID, WorkerStatus PERIOD) {

        this.WORKER_NAME = WORKER_NAME;

        this.ID = ID;

        this.PERIOD = PERIOD;

    }

    public Integer getWorkerId () {

        return ID;

    }

    @Override
    public String toString () {

        return "Name: " + WORKER_NAME
                + " Id: " + ID
                + " Period: " + PERIOD;

    }

}
