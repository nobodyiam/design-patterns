package chain_of_responsibility.impl;

import chain_of_responsibility.interfaces.Purchase;

public class Purchase1 implements Purchase {
	private int number;
	private double amount;
	private String desc;
	
	public Purchase1(int number, double amount, String desc){
		this.number = number;
		this.amount = amount;
		this.desc = desc;
	}
	
	public String getDesc() {
		return this.desc;
	}

	public double getAmount() {
		return this.amount;
	}

	public int getNumber() {
		return this.number;
	}

}
