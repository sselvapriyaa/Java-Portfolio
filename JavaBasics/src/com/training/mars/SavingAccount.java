package com.training.mars;

//public class SavingAccount extends Account {
public class SavingAccount implements DomesticAccount{
	
	/*@Override
	public double getBalanceAmount() {
		return 0;
	}*/
	@Override
	public void getLocation() {
		System.out.println("Chicago location");
	}

}
