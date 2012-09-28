package prototype;

import prototype.impl.*;
import prototype.interfaces.Prototype;
import utility.MyUtility;

public class Client {
	
	public void test(Prototype prototype){
		MyUtility.myPrint(prototype.Clone().GetID());
	}
	
	public static void main(String args[]){
		Client client = new Client();
		
		Prototype prototype = new ConcretePrototype1();
		
		MyUtility.myPrint("Start testing ConcretePrototype1");
		MyUtility.myPrint(prototype.GetID());
		client.test(prototype);
		client.test(prototype);
		MyUtility.myPrint("End testing ConcretePrototype1");
		
		prototype = new ConcretePrototype2();
		MyUtility.myPrint("Start testing ConcretePrototype2");
		MyUtility.myPrint(prototype.GetID());
		client.test(prototype);
		client.test(prototype);
		MyUtility.myPrint("End testing ConcretePrototype2");
	}
}
