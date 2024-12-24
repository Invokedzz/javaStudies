package filejava.fifth.model.entities;

public class Worker {

    private String worker;

    private Integer id;

    private String department;

    public Worker () {}

    public Worker ( String worker, Integer id, String department ) {

        this.worker = worker;

        this.id = id;

        this.department = department;

    }

    public String getWorker () {

        return worker;

    }

    public Integer getId () {

        return id;

    }

    public String getDepartment () {

        return department;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( getWorker() )
                .append( " id: " ).append( getId() )
                .append( " Department: " ).append( getDepartment() ).append( "//" );

        return sb.toString();

    }

}
