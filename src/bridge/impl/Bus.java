package bridge.impl;

import utility.MyUtility;
import bridge.interfaces.Car;
import bridge.interfaces.Engine;

public class Bus implements Car {
	private Engine engine;
	
	public Bus(Engine engine){
		this.engine = engine;
	}
	
	public void startEngine() {
		MyUtility.myPrint("Bus with engine " + this.engine.getEngineName() + " started.");
	}

}
