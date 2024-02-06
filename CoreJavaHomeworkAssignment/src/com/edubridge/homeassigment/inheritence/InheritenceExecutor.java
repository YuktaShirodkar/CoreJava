package com.edubridge.homeassigment.inheritence;

import java.util.Scanner;

public class InheritenceExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       System.out.println("Bank Details:");
			
	        BankAccount b = new BankAccount("1023", 500);

	        
			System.out.println("Deposit 500 into account :");
	        b.deposit(500);
	        System.out.println("New balance after depositing " + b.getBalance());
	        
	        System.out.println("Withdraw Rs700 from account BA1221:");
	        b.withdraw(600);
	        System.out.println("New balance after withdrawing Rs600: Rs" + b.getBalance());

	        // Create a SavingsAccount
			System.out.println("\nCreate a SavingsAccount:");
	        SavingsAccount s = new SavingsAccount("SA1212",450);

	        
	        s.withdraw(400);
	        System.out.println("Balance after trying to withdraw 300: Rs" + s.getBalance());

	     
			

	        
		
		

	}

}
