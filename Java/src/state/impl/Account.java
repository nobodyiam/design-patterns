package state.impl;

import state.interfaces.AccountState;

public class Account {
	private String owner;
	private AccountState state;
	
	public Account(String owner){
		this.owner = owner;
		this.state = new NormalState(0.0, this);
	}
	
	public void setState(AccountState state) {
		this.state = state;
	}
	public AccountState getState() {
		return state;
	}
	
	public void deposit(double amount) {
		this.state.deposit(amount);
	}
	
	public void withDraw(double amount) {
		this.state.withDraw(amount);
	}
	
	public double getServiceFee(){
		return this.state.getFee();
	}
	
	public String getOwner(){
		return this.owner;
	}
}
