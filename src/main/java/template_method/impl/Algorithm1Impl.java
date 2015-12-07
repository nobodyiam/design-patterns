package template_method.impl;

import template_method.interfaces.Algorithm1;
import utility.MyUtility;

public class Algorithm1Impl extends Algorithm1 {

	@Override
	public void calc1() {
		MyUtility.myPrint("doing calc1 in Algorithm1Impl");
	}

	@Override
	public void calc2() {
		MyUtility.myPrint("doing calc2 in Algorithm1Impl");
	}

	@Override
	public void calc3() {
		MyUtility.myPrint("doing calc3 in Algorithm1Impl");
	}

	public void showResult() {
		MyUtility.myPrint("show result is implemented in Algorithm1Impl");
	}

}
