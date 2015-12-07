package facade.impl;

import utility.MyUtility;
import facade.interfaces.Facade;

public class FacadeImpl implements Facade {
	private A1 a1;
	private A2 a2;
	private A3 a3;
	
	public FacadeImpl(){
		this.a1 = new A1();
		this.a2 = new A2();
		this.a3 = new A3();
	}
	
	public void doSomething() {
		MyUtility.myPrint("doSomething in FacadeImpl");
		this.a1.doSomething1();
		this.a2.doSomething2();
		this.a3.doSomething3();
	}

}
