package com.collection.map.scenario;
/*. Bank Balance Tracker:
        - Use computeIfAbsent, merge, getOrDefault for transactions.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question21
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name="";
        String bankAccountNumber="";
        double balance=0;
        Bank bank=new Bank();
        while (true) {
            System.out.println("Enter your choice:");
            System.out.println("1. open account");
            System.out.println("2. deposit");
            System.out.println("3. withdraw");
            System.out.println("4.Display All accounts");
            System.out.println("5.Check Balance");
            System.out.println("6.Exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                {
                    System.out.println("Enter Your Name:");
                    scanner.nextLine();
                    name=scanner.nextLine();
                    System.out.println("Enter Your Account no:");
                    bankAccountNumber=scanner.nextLine();
                    bank.openAccount(name, bankAccountNumber);
                    break;
                }
                case 2:
                {
                    System.out.println("Enter Account Number:");
                    scanner.nextLine();
                    bankAccountNumber=scanner.nextLine();
                    System.out.println("Enter amount to deposit");
                    balance=scanner.nextDouble();
                    bank.deposit(bankAccountNumber,balance);
                    break;
                }
                case 3:
                {
                    System.out.println("Enter Account Number:");
                    scanner.nextLine();
                    bankAccountNumber=scanner.nextLine();
                    System.out.println("Enter amount to withdraw");
                    balance=scanner.nextDouble();
                    bank.withdraw(bankAccountNumber,balance);
                    break;
                }
                case 4:
                {
                    bank.display();
                    break;
                }
                case 5:
                {
                    System.out.println("Enter Account number:");
                    scanner.nextLine();
                    bankAccountNumber=scanner.nextLine();
                    bank.checkBalance(bankAccountNumber);
                    break;
                }
                case 6:
                {
                    return;
                }
                default:
                    System.out.println("Please select choice from 1 to 6");
            }
        }

    }
}
class BankAccount {
    private String name;
    private  String bankAccountNumber;
    private  double balance;

    public BankAccount(String name, String bankAccountNumber ) {
        this.name = name;
        this.bankAccountNumber = bankAccountNumber;
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(String bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Bank Account: " + bankAccountNumber + ", Balance: " + balance;
    }
}
class Bank
{
    private Map<String, BankAccount> bankAccountMap = new HashMap<>();
    public void openAccount(String name, String bankAccountNumber) {
        if(!isNumber(bankAccountNumber))
        {
            System.out.println("Account number must be in digit please try again later");
            return;
        }
        if(name==null || bankAccountNumber==null)
            return;
//        bankAccountMap.computeIfAbsent(name, k -> new BankAccount(name, bankAccountNumber));
        if(bankAccountMap.containsKey(bankAccountNumber))
        {
            System.out.println("User already opened account: " + name+" Bank details:"+bankAccountMap.get(bankAccountNumber));
            return;
        }
        BankAccount bankAccount = new BankAccount(name, bankAccountNumber);
        bankAccountMap.put(bankAccountNumber, bankAccount);
        System.out.println("Account opened successfully" + name);
    }
    public void deposit(String accountNumber,double amount)
    {
        if(!isNumber(accountNumber))
        {
            System.out.println("Account number must be 12 digits. Please try again.\n");
            return;
        }
        if(accountNumber==null)
        {
            System.out.println("Invalid account number");
            return;
        }
        if(amount<=0)
        {
            System.out.println("Invalid amount please try again!!!!!!!");
            return;
        }
        BankAccount temp=bankAccountMap.get(accountNumber);
        if(temp==null)
        {
            System.out.println("Account not found");
            return;
        }
        temp.setBalance(temp.getBalance() + amount);
        System.out.println("Amount deposited: " + amount);
    }
    public void withdraw(String accountNumber,double amount)
    {
        if(!isNumber(accountNumber))
        {
            System.out.println("Account number must be in digit please try again later");
            return;
        }
        if(accountNumber==null)
        {
            System.out.println("Invalid account number");
            return;
        }
        if(amount<=0)
        {
            System.out.println("Invalid amount please try again!!!!!!!");
            return;
        }
        BankAccount temp=bankAccountMap.get(accountNumber);
        if(temp==null)
        {
            System.out.println("Account not found");
            return;
        }
        if(temp.getBalance()<amount)
        {
            System.out.println("Insufficient balance please try with different amount!!!!!!!");
            System.out.println("Available balance: " +temp.getBalance());
            return;
        }
        temp.setBalance(temp.getBalance() - amount);
        System.out.println("Amount withdrawn: " + amount);
        System.out.println("Available Balance: " + temp.getBalance());
    }
    public  void display()
    {
        bankAccountMap.forEach( (accountNumber,bankAccount) -> {
            System.out.println("Account number: " + accountNumber + ", Bank account: " + bankAccount);
        });
    }
    public boolean isNumber(String accountNumber)
    {
       return accountNumber.matches("\\d{12}");
    }
    public void checkBalance(String accountNumber)
    {
        if(accountNumber==null)
        {
            System.out.println("Invalid account number");
            return;
        }
        BankAccount temp=bankAccountMap.get(accountNumber);
        if(temp==null)
        {
            System.out.println("Account not found");
            return;
        }
        System.out.println("Account balance: " + temp.getBalance());
    }


}
