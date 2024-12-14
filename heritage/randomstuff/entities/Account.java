package heritage.randomstuff.entities;

public abstract class Account {

    private String holder;

    private Integer number;

    private double balance;

    public Account () {}

    public Account ( String holder, Integer number, double balance ) {

        this.holder = holder;

        this.number = number;

        this.balance = balance;

    }

    public String getHolder () {

        return holder;

    }

    public Integer getNumber () {

        return number;

    }

    public double getBalance () {

        return balance;

    }

    public double withdraw ( double amount ) {

        return balance -= amount;

    }

    public double deposit ( double amount ) {

        return balance += amount;

    }

}
