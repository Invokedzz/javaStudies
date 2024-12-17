package exceptions.fourthclass;

public class Employees {

    private String name;

    private String id;

    public Employees () {}

    public Employees ( String name, String id ) {

        this.name = name;

        this.id = id;

    }

    public String getName () {

        return name;

    }

    public String getId () {

        return id;

    }

    @Override
    public String toString () {

        StringBuilder sb;

        sb = new StringBuilder();

        sb.append( "Name: " ).append( name )
                .append( " Id: " ).append( id );

        return sb.toString();

    }

}
