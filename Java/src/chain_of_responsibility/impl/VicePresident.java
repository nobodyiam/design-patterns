package chain_of_responsibility.impl;

import utility.MyUtility;
import chain_of_responsibility.interfaces.Approver;
import chain_of_responsibility.interfaces.Purchase;

public class VicePresident implements Approver {
	private Approver successor;
	
	public void prosessRequest(Purchase purchase) {
		if(purchase.getAmount() < Approver.VP_LIMIT){
			MyUtility.myPrint( this.getClass().getSimpleName() + " approved request: " + purchase.getNumber());
		} else if (this.successor != null){
			this.successor.prosessRequest(purchase);
		} else {
			MyUtility.myPrint( "No one could approve request: " + purchase.getNumber());
		}
	}

	public void setSuccessor(Approver approver) {
		this.successor = approver;
	}

}
