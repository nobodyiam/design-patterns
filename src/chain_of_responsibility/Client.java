package chain_of_responsibility;

import chain_of_responsibility.impl.*;
import chain_of_responsibility.interfaces.*;

public class Client {
	
	public void test(){
		Approver director = new Director();
		Approver vp = new VicePresident();
		Approver president = new President();
		
		director.setSuccessor(vp);
		vp.setSuccessor(president);
		
		Purchase purchase = new Purchase1(001, 9999.00, "item 1");
		director.prosessRequest(purchase);
		
		purchase = new Purchase1(002, 19999.00, "item 2"); 
		director.prosessRequest(purchase);
		
		purchase = new Purchase1(003, 99999.00, "item 3"); 
		director.prosessRequest(purchase);
		
		purchase = new Purchase1(004, 199999.00, "item 4"); 
		director.prosessRequest(purchase);
	}
	
	public static void main(String args[]){
		new Client().test();
	}
}
