package generics.set.fourthencounter.src.entities;

import java.util.Objects;

public class Worker {

    private String workerName;

    private String workerId;

    public Worker () {}

    public Worker ( String workerName, String workerId ) {

        this.workerName = workerName;

        this.workerId = workerId;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( workerName ).append( workerId );

        return sb.toString();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Worker worker)) return false;
        return Objects.equals(workerName, worker.workerName) && Objects.equals(workerId, worker.workerId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(workerName, workerId);
    }

}
