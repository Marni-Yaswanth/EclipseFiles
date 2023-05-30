package com.Amit.BankAssignment;

public class CurrentAccount extends BankAccount {
	
	int Odl = balance/10;
	int od;
	

	public CurrentAccount(int id, String name, int balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}

	public int getOdl() {
		return Odl;
	}

	public void setOdl(int odl) {
		Odl = odl;
	}

	public int getOd() {
		return od;
	}

	public void setOd(int od) {
		this.od = od;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance() {
		return balance;
	}
	
	@Override
	public void Deposit(int amount)
	{
		if (od==0)
		{
			balance = balance+amount;
			setBalance(balance);
			System.out.println("balance is "+balance);
			return;
			
		}
		else if(od<0)
		{
			balance = od+amount;
			setBalance(balance);
			System.out.println("balance is "+balance);
			return;
			
		}
		
		
		
		
	}
	@Override
	public void WithDraw(int amount)
	{
		if(od<=-Odl)
		{
			System.out.println("you cannot take as you have to pay to bank yet!!");
		}
		
		else if (amount>(balance+Odl))
		{
			System.out.println("your limit for withdrawal is "+(balance+Odl));
		}
		else if(amount<(balance+Odl))
		{
			balance-=amount;
			setBalance(balance);
			System.out.println("balance is "+balance);
		}
		else if (amount>balance)
		{
			if(amount==(balance+Odl))
			{
				od=balance-amount;
				setOd(od);
				
				balance=od+Odl;
				System.out.println("od is "+od+ " balance is "+balance);
				
				
			}
		}
	}
	
}

	
	
	

