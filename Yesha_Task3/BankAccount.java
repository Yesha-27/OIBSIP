package org.example;

public class BankAccount {

    private double balance;
    private Transaction transaction;

    public BankAccount(double balance) {

        this.balance = balance;
        transaction = new Transaction();
    }

    public void deposit(double amount) {

        balance += amount;

        transaction.addTransaction("Deposited ₹" + amount);

        System.out.println("Deposit Successful.");
    }

    public void withdraw(double amount) {

        if (amount > balance) {

            System.out.println("Insufficient Balance.");

            return;
        }

        balance -= amount;

        transaction.addTransaction("Withdrawn ₹" + amount);

        System.out.println("Withdrawal Successful.");
    }

    public void transfer(String receiver, double amount) {

        if (amount > balance) {

            System.out.println("Insufficient Balance.");

            return;
        }

        balance -= amount;

        transaction.addTransaction("Transferred ₹" + amount + " to Account " + receiver);

        System.out.println("Transfer Successful.");
    }

    public void checkBalance() {

        System.out.println("Current Balance : ₹" + balance);
    }

    public void showHistory() {

        transaction.showHistory();
    }
}
