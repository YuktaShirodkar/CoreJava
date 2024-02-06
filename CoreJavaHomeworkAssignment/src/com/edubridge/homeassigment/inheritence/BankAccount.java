package com.edubridge.homeassigment.inheritence;

//Parent class BankAccount
public class BankAccount {
 private String accountNumber;
 private double balance;

 public BankAccount(String accountNumber, double balance) {
     this.accountNumber = accountNumber;
     this.balance = balance;
     
     System.out.println("Bank Account Number: "+accountNumber+ "\nBalance :"+balance );
 }


 public void deposit(double x) {
     balance += x;
     System.out.println(x+" Rs deposited to your account"+accountNumber+ "Your latest balance is "+balance);
 }

 public void withdraw(double x) {
     if (balance >= x) {
         balance -= x;
         System.out.println(x+" Rs withdrawn to your account "+accountNumber+ " Your latest balance is "+balance);
     } else {
         System.out.println("Insufficient balance");
     }
 }


public double getBalance() {
	// TODO Auto-generated method stub
	return balance;
}

}


