package state.impl;

import state.interfaces.AccountState;

public class GoldState implements AccountState {
	private Account account;
	private double balance;
	
	public GoldState(double balance, Account account){
		this.balance = balance;
		this.account = account;
		this.stateCheck();
	}
	
	public void deposit(double amount) {
		if(amount < 0){
			return;
		}
		this.balance += amount;
		this.stateCheck();
	}

	public double getFee() {		
		return AccountState.GOLD_FEE;
	}

	public void withDraw(double amount) {
		if(amount < 0){
			return;
		}
		this.balance -= amount;
		this.stateCheck();
	}
	
	public void stateCheck(){
		if(this.balance >= AccountState.GOLD_LEVEL){
			return;
		} else if(this.balance < AccountState.SILVER_LEVEL){
			this.account.setState(new NormalState(this.balance, this.account));
		} else {
			this.account.setState(new SilverState(this.balance, this.account));
		}
	}
}
