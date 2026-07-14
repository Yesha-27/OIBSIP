package org.example;

import java.util.ArrayList;

public class Transaction {

    private ArrayList<String> history = new ArrayList<>();

    public void addTransaction(String message) {
        history.add(message);
    }

    public void showHistory() {

        if (history.isEmpty()) {
            System.out.println("\nNo Transactions Yet.");
            return;
        }

        System.out.println("\n========== TRANSACTION HISTORY ==========");

        for (String transaction : history) {
            System.out.println(transaction);
        }
    }
}
