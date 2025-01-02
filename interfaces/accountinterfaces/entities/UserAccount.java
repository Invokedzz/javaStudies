package interfaces.accountinterfaces.entities;

public class UserAccount {

    private String name;

    private String id;

    private Double balance;

    public UserAccount () {}

    public UserAccount ( String name, String id, Double balance ) {

        this.name = name;

        this.id = id;

        this.balance = balance;

    }

    public String getName () {

        return name;

    }

    public String getId () {

        return id;

    }

    public Double getBalance () {

        return balance;

    }

    public void setBalance ( Double balance ) {

        this.balance = balance;

    }

}
