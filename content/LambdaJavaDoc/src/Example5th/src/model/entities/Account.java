package content.LambdaJavaDoc.src.Example5th.src.model.entities;

public class Account {

    private String name;

    private String id;

    private Double balance;

    public Account () {}

    public Account ( String name, String id, Double balance ) {

        this.name = name;

        this.id = id;

        this.balance = balance;

    }

    public Double getBalance() {

        return balance;

    }

    public void setBalance ( Double balance ) {

        this.balance = balance;

    }

    public String getId() {

        return id;

    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", balance=" + balance +
                '}';
    }

}
