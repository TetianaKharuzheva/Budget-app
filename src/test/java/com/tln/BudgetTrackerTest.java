package com.tln;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BudgetTrackerTest {

    BudgetTracker budgetTracker;

    @BeforeEach
    void setUp() {
        budgetTracker = new BudgetTracker();
    }

    @Test
    public void testAddTransaction() {
        budgetTracker.addTransaction("new", 1000.0);
        assertThat(budgetTracker.getTransactions()).hasSize(1);
        assertThat(budgetTracker.getBalance()).isEqualTo(1000.0);
    }

    @Test
    public void testDeleteTransaction() {
        budgetTracker.addTransaction("open", 2000);
        int id = budgetTracker.getTransactions().get(0).getId();
        budgetTracker.deleteTransaction(id);
        assertThat(budgetTracker.getTransactions()).isEmpty();
        assertThat(budgetTracker.getBalance()).isEqualTo(0.0);
    }

    @Test
    public void testUpdateTransaction() {
        budgetTracker.addTransaction("Salary", 1000.0);
        int id = budgetTracker.getTransactions().get(0).getId();
        budgetTracker.updateTransaction(id, "Bonus", 500.0);
        assertThat(budgetTracker.getTransactions()).hasSize(1);
        assertThat(budgetTracker.getBalance()).isEqualTo(500);
        assertThat(budgetTracker.getTransactions().get(0).getDescription()).isEqualTo("Bonus");
    }

    @Test
    public void testViewBalance() {
        budgetTracker.addTransaction("Salary", 1000.0);
        budgetTracker.addTransaction("Grocery", -200.0);
        assertThat(budgetTracker.getBalance()).isEqualTo(800.0);
        assertThat(budgetTracker.getTransactions()).hasSize(2);
    }

    @Test
    public void testEmptyTransactionList() {
        budgetTracker.addTransaction("Salary", 1000.0);
        budgetTracker.addTransaction("Grocery", -200.0);
        budgetTracker.deleteTransaction(1);
        budgetTracker.deleteTransaction(2);
        assertThat(budgetTracker.getBalance()).isEqualTo(0);
        assertThat(budgetTracker.getTransactions()).isEmpty();
    }
}


