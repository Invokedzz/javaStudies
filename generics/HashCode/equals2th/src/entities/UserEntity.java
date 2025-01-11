package generics.HashCode.equals2th.src.entities;

public class UserEntity implements Comparable < UserEntity > {

    private String username;

    private String email;

    public UserEntity () {}

    public UserEntity ( String username, String email ) {

        this.username = username;

        this.email = email;

    }

    public String getUsername () {

        return username;

    }

    public String getEmail () {

        return email;

    }

    @Override
    public int compareTo( UserEntity o ) {

        return getUsername().compareTo( o.getUsername() );

    }

}
