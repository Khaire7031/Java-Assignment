
/*
        @  Design a bank account class with constructor and methods to deposit, 
           to withdraw from, change the name, charge a fee and print a summary
           of the account using toString() method. Derive saving and current 
           account from Account, overrides method and print summary of saving 
           and current account. Use Final.
 */


import java.util.*;

class Account {
    protected String accountHolderName;
    protected double balance;

    public Account(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void changeName(String newName) {
        this.accountHolderName = newName;
        System.out.println("Account holder name changed to: " + newName);
    }

    public void chargeFee(double fee) {
        balance -= fee;
        System.out.println("Fee charged: $" + fee);
    }

    public void printSummary() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Balance: $" + balance);
    }

    @Override
    public String toString() {
        return "Account [accountHolderName : " + accountHolderName + ", balance : $" + balance + "]";
    }
}

final class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountHolderName, double initialBalance, double interestRate) {
        super(accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void printSummary() {
        super.printSummary();
        System.out.println("Type: Savings Account");
        System.out.println("Interest Rate : " + interestRate + "%");
    }
}

final class CurrentAccount extends Account {
    private double overdraftLimit;

    public CurrentAccount(String accountHolderName, double initialBalance, double overdraftLimit) {
        super(accountHolderName, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public void printSummary() {
        super.printSummary();
    }
}
public class Assignment4 {
    public static void main(String[] args) {
        
    }
}


/*
    @ Output 


 
 */