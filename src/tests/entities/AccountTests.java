package tests.entities;


import entities.Account;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import tests.factory.AccountFactory;

public class AccountTests {
    @Test
    public void depositShouldIncreaseBalanceWhenPositiveAmount() {
        double amount = 200.0;
        double expectedValue = 196.0;
        Account acc = AccountFactory.createEmptyAccount();
        acc.deposit(amount);
        Assertions.assertEquals(expectedValue, acc.getBalance());

    }

    @Test
    public void depositShouldDoNothingWhenNegativeAmount() {
        double expectedValue = 100.00;
        Account acc = AccountFactory.createAccount(expectedValue);
        double amount = -200.0;
        acc.deposit(amount);
        Assertions.assertEquals(expectedValue, acc.getBalance());
    }
}
