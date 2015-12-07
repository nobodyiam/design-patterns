package state;

import state.impl.Account;
import utility.MyUtility;

public class Client {
	
	public void test(){
		Account account = new Account("Sam");
		
		account.deposit(999);
		MyUtility.myPrint("The current service fee for " + account.getOwner() + " is: " + account.getServiceFee());
		account.deposit(1999);
		MyUtility.myPrint("The current service fee for " + account.getOwner() + " is: " + account.getServiceFee());
		account.deposit(199999);
		MyUtility.myPrint("The current service fee for " + account.getOwner() + " is: " + account.getServiceFee());
		account.withDraw(199999);
		MyUtility.myPrint("The current service fee for " + account.getOwner() + " is: " + account.getServiceFee());
		account.withDraw(1999);
		MyUtility.myPrint("The current service fee for " + account.getOwner() + " is: " + account.getServiceFee());
		account.withDraw(999);
		MyUtility.myPrint("The current service fee for " + account.getOwner() + " is: " + account.getServiceFee());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
