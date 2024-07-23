package com.tln;

import java.util.Scanner;

public class BudgetTrackerApp {
    public static void main(String[] args) {
        BudgetTracker budgetTracker = new BudgetTracker();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Budget Tracker Menu:");
            System.out.println("1. Add Transaction");
            System.out.println("2. Delete Transaction");
            System.out.println("3. Update Transaction");
            System.out.println("4. View Balance");
            System.out.println("5. Display All Transactions");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter description: ");
                    String description = scanner.nextLine();
                    System.out.print("Enter amount: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    budgetTracker.addTransaction(description, amount);
                    System.out.println("Transaction added.");
                    break;
                case 2:
                    System.out.print("Enter transaction ID to delete: ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    budgetTracker.deleteTransaction(deleteId);
                    System.out.println("Transaction deleted.");
                    break;
                case 3:
                    System.out.print("Enter transaction ID to update: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new description: ");
                    String newDescription = scanner.nextLine();
                    System.out.print("Enter new amount: ");
                    double newAmount = scanner.nextDouble();
                    scanner.nextLine(); // Consume newline
                    budgetTracker.updateTransaction(updateId, newDescription, newAmount);
                    System.out.println("Transaction updated.");
                    break;
                case 4:
                    System.out.println("Current balance: $" + budgetTracker.getBalance());
                    break;
                case 5:
                    System.out.println("Transaction History:");
                    for (Transaction transaction : budgetTracker.getTransactions()) {
                        System.out.println("ID: " + transaction.getId() + ", Description: " + transaction.getDescription() + ", Amount: $" + transaction.getAmount());
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

