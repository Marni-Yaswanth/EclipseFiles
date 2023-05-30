package com.Amit.BankAssignment;

public class UserApplication {

	public static void main(String[] args) {

		
		BankAccount bankAccount = new CurrentAccount(123, "hello", 10000);
		bankAccount.Deposit(1000);
		
		bankAccount.WithDraw(12000);
		
		bankAccount.WithDraw(17000);
		bankAccount.Deposit(2000);
		
		
		
		
		
		
	}

}
