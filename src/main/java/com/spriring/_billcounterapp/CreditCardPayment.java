package com.spriring._billcounterapp;

public class CreditCardPayment implements IPayment {
	public CreditCardPayment() {
		System.out.println("***** CreditCard payment :: Constructor**");
		
	}

	@Override
	public boolean payBill(Double billAmt) {
	
		return false;
	}

}
