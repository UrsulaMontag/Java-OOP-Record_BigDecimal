package org.example.bank;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Client clientTest = new Client("Max", "Mustermann", "test-number-1");
        Account testAccount = new Account("test-test-001", BigDecimal.valueOf(1500), clientTest);

        System.out.println(testAccount.getBalance());
        testAccount.deposit(BigDecimal.valueOf(1500));
        System.out.println(testAccount.getBalance());
        testAccount.withdraw(BigDecimal.valueOf(500));
        System.out.println(testAccount.getBalance());
    }
}
