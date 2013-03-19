package adapter.impl;

import utility.MyUtility;
import adapter.interfaces.Target;

public class Adapter implements Target {
	private Adaptee adaptee;
	
	public Adapter(){
		this.setAdaptee(new Adaptee());
	}
	
	public void SendMail() {
		if(this.adaptee == null){
			return;
		}
		MyUtility.myPrint("Sending mail from Adapter");
		this.adaptee.sendSpecificMail();
	}

	public void setAdaptee(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

}
