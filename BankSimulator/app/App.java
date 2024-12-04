package BankSimulator.app;

import BankSimulator.entities.Bank;
import BankSimulator.entities.UserAccount;

public class App {

    public static void main (String[] args) {

        initProgram();

    }

    private static void initProgram () {

        UserAccount saygex = new UserAccount("flaji", 10293, 1000);

        Bank bank = new Bank("bradesco", 10291, saygex);

        System.out.println(bank);

    }

}
