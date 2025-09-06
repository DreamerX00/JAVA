package Practicals;

import java.util.Scanner;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class SavingsAccount {
    private int accountNumber;
    private double balance;

    public SavingsAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully.");
    }
    public void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance in the account.");
        }
        balance -= amount;
        System.out.println("Amount withdrawn successfully.");
    }

    public double getBalance() {
        return balance;
    }
}

public class p14_exception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();

        System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        SavingsAccount account = new SavingsAccount(accountNumber, initialBalance);
        System.out.println("Initial balance: " + account.getBalance());

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.depositAmount(depositAmount);
        System.out.println("Balance after deposit: " + account.getBalance());

        System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        try {
            account.withdrawAmount(withdrawalAmount);
            System.out.println("Balance after withdrawal: " + account.getBalance());
        } catch (InsufficientBalanceException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }
}

