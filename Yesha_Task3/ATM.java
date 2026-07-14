package org.example;

import java.util.Scanner;

public class ATM {

    private User user;
    private BankAccount account;
    private Scanner sc;

    public ATM(User user, BankAccount account) {

        this.user = user;
        this.account = account;
        sc = new Scanner(System.in);
    }

    public void start() {

        System.out.println("=========== ATM INTERFACE ===========");

        System.out.print("Enter User ID : ");
        String id = sc.nextLine();

        System.out.print("Enter PIN : ");
        String pin = sc.nextLine();

        if (!user.login(id, pin)) {

            System.out.println("Invalid User ID or PIN.");

            return;
        }

        System.out.println("\nLogin Successful!");

        int choice;

        do {


            System.out.println("\n1. Transaction History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Check Balance");
            System.out.println("6. Exit\n");

            System.out.print("Enter Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    account.showHistory();
                    break;

                case 2:

                    System.out.print("Enter Amount : ");

                    double withdraw = sc.nextDouble();

                    account.withdraw(withdraw);

                    break;

                case 3:

                    System.out.print("Enter Amount : ");

                    double deposit = sc.nextDouble();

                    account.deposit(deposit);

                    break;

                case 4:

                    sc.nextLine();

                    System.out.print("Enter Receiver Account Number : ");

                    String receiver = sc.nextLine();

                    System.out.print("Enter Amount : ");

                    double amount = sc.nextDouble();

                    account.transfer(receiver, amount);

                    break;

                case 5:

                    account.checkBalance();

                    break;

                case 6:

                    System.out.println("\nThank You For Using Our ATM.");
                    break;

                default:

                    System.out.println("Invalid Choice.");
            }

        } while (choice != 6);

        sc.close();
    }
}
