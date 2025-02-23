package JDBC.jdbc1.src;

import JDBC.jdbc1.entities.Accounts;
import JDBC.jdbc1.queries.AccountQueries;

public class Transactions {

    public static void main (String[] args) {

        Accounts accounts = new Accounts("Mr.Washington", "washington@gmail.com", 1500.0);

        AccountQueries accountQueries = new AccountQueries(accounts);

        accountQueries.update();

    }

}
