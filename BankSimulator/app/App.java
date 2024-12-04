package BankSimulator.app;

import BankSimulator.entities.Bank;

import BankSimulator.entities.UserAccount;

import java.util.Scanner;

public class App {

    public static void main (String[] args) {

        initProgram();

    }

    private static void initProgram () {

        Scanner init = new Scanner (System.in);

        while (true) {

            System.out.println("Main menu: ");
            System.out.println("1 - Get Initial Value");
            System.out.println("2 - Withdraw from Account");
            System.out.println("3 - Deposit to Account");
            System.out.println("4 - Exit");

            int selectAnOption = init.nextInt();

            if (selectAnOption == 4) break;

            optionsForUser(selectAnOption, init);

        }

    }

    private static void optionsForUser (int selectAnOption, Scanner init) {

        Bank bank = new Bank("Brade",
                10983,
                new UserAccount("Chico", 1092, 1000));

            switch (selectAnOption) {

                case 1:

                    double getElement = UserAccount.getInitialValue();

                    System.out.println(getElement);

                    break;

                case 2:

                    // withdraw

                    System.out.println("Enter a value to withdraw: ");

                    double valueWithdraw = init.nextDouble();

                    double resultWithdraw = bank.withdrawSomeValue(valueWithdraw, init);

                    System.out.println(resultWithdraw);

                    break;

                case 3:

                    // deposit

                    System.out.println("Enter a value to deposit: ");

                    double valueDeposit = init.nextDouble();

                    double resultDeposit = bank.depositSomeValue(valueDeposit, init);

                    System.out.println(resultDeposit);

                    break;

                default:

                    System.out.println("Enter a valid operation");

                    break;

            }
        }

    }

