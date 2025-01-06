package interfaces.test.services;

public interface ExecData {

    void load ();

    default boolean isUserValid ( String user ) {

        if ( !user.isEmpty() ) return true;

        return false;

    }

}
