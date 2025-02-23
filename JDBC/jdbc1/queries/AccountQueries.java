package JDBC.jdbc1.queries;

import JDBC.jdbc1.db.DB;
import JDBC.jdbc1.db.DbException;
import JDBC.jdbc1.entities.Accounts;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AccountQueries {

    private Accounts accounts;

    public AccountQueries () {}

    public AccountQueries (Accounts accounts) {

        this.accounts = accounts;

    }

    public void insert () {

        Connection connection = null;

        PreparedStatement statement = null;

        try {

            connection = DB.getConnection();

            statement = connection.prepareStatement(
                    "INSERT INTO public.accounts (name, email, salary) " +
                            "VALUES (?, ?, ?)"
            );

            statement.setString(1, accounts.getName());

            statement.setString(2, accounts.getEmail());

            statement.setDouble(3, accounts.getSalary());

            statement.executeUpdate();

            System.out.println("Query was completed successfully!");

        } catch (SQLException exception) {

            throw new DbException(exception.getMessage());

        } finally {

            DB.closeConnections(connection);

            DB.closeStatements(statement);

        }

    }

    public void update () {

        Connection connection = null;

        Statement statement;

        try {

            // AutoCommit, Commit, Rollback -> transactions.
            // They're used to execute the operations without any break

            connection = DB.getConnection();

            connection.setAutoCommit(false);

            statement = connection.createStatement();

            statement.executeUpdate("UPDATE public.accounts SET salary = 4000 WHERE name = 'Paul'");

            statement.executeUpdate("UPDATE public.accounts SET salary = 4000 WHERE name = 'Mr.Duck'");

            connection.commit();

        } catch (SQLException exception) {

            try {

                connection.rollback();

            } catch (SQLException exception2) {

                throw new DbException(exception2.getMessage());

            }

            throw new DbException(exception.getMessage());

        }

    }

}
