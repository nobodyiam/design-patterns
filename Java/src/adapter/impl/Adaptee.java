package adapter.impl;

import utility.MyUtility;

public class Adaptee {
	public void sendSpecificMail(){
		MyUtility.myPrint("Sending Specific mail from Adaptee");
	}
}
