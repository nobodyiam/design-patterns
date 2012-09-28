package template_method.interfaces;

import utility.MyUtility;

public abstract class Algorithm1 implements Algorithm {
	
	//template method
	public abstract void calc1();
	public abstract void calc2();
	public abstract void calc3();
	
	public void calc(){
		MyUtility.myPrint("begin doing calc in Algorithm1");
		MyUtility.myPrint("calling calc1 in Algorithm1");
		this.calc1();
		MyUtility.myPrint("calling calc2 in Algorithm1");
		this.calc2();
		MyUtility.myPrint("calling calc3 in Algorithm1");
		this.calc3();
		MyUtility.myPrint("end doing calc in Algorithm1");
	}

}
