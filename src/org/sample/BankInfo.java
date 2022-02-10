package org.sample;

public class BankInfo extends AxisBank {
	public void saving()
	{
		System.out.println("My saving is Rs.500");
		
	}
	public void deposit()
	{
		System.out.println("My deposit is Rs.5000");
		
	}
	public static void main(String[] args)
	{
	BankInfo e=new BankInfo();
	e.saving();e.deposit();
	e.deposits();
	
	}
}
