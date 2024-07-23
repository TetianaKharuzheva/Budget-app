package com.tln;

public class Transaction {
    private static int idCounter = 1;

    private int id;
    private String description;
    private double amount;

    public Transaction(String description, double amount) {
        this.id = idCounter++;
        this.description = description;
        this.amount = amount;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
