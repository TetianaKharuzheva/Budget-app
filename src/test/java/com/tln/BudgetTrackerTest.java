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
        // FIXME
        budgetTracker.addTransaction();
        assertThat(budgetTracker.getTransactions()).hasSize(1);
        assertThat(budgetTracker.getBalance()).isEqualTo(1000.0);
    }

    @Test
    public void testDeleteTransaction() {
        // FIXME
        budgetTracker.addTransaction();
        int id = budgetTracker.getTransactions().get(0).getId();
        budgetTracker.deleteTransaction();
        assertThat(budgetTracker.getTransactions()).isEmpty();
        assertThat(budgetTracker.getBalance()).isEqualTo(0.0);
    }

    @Test
    public void testUpdateTransaction() {
        // FIXME
        budgetTracker.addTransaction("Salary", 1000.0);
        int id = budgetTracker.getTransactions().get(0).getId();
        budgetTracker.updateTransaction(id, "Bonus", 500.0);
        assertThat(budgetTracker.getTransactions()).hasSize();
        assertThat(budgetTracker.getBalance()).isEqualTo();
        assertThat(budgetTracker.getTransactions().get(0).getDescription()).isEqualTo();
    }

    @Test
    public void testViewBalance() {
        // FIXME
        budgetTracker.addTransaction("Salary", 1000.0);
        budgetTracker.addTransaction("Grocery", -200.0);
        assertThat(budgetTracker.getBalance()).isEqualTo();
        // TODO one more assert
    }

    @Test
    public void testEmptyTransactionList() {
        // FIXME
        assertThat(budgetTracker.getTransactions()).is
    }
}


