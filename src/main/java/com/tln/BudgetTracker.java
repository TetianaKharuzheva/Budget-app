package com.tln;

import java.util.ArrayList;
import java.util.List;

public class BudgetTracker {
    private List<Transaction> transactions;
    private double balance;

    public BudgetTracker() {
        transactions = new ArrayList<>();
        balance = 0.0;
    }

    public void addTransaction(String description, double amount) {
        transactions.add(new Transaction(description, amount));
        balance += amount;
    }

    public void deleteTransaction(int id) {
        for (Transaction transaction : transactions) {
            if (transaction.getId() == id) {
                balance -= transaction.getAmount();
                transactions.remove(transaction);
                return;
            }
        }
    }

    public void updateTransaction(int id, String newDescription, double newAmount) {
        for (Transaction transaction : transactions) {
            if (transaction.getId() == id) {
                balance -= transaction.getAmount();
                transaction.setDescription(newDescription);
                transaction.setAmount(newAmount);
                balance += newAmount;
                return;
            }
        }
    }

    public double getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

