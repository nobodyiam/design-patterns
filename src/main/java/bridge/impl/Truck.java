package bridge.impl;

import utility.MyUtility;
import bridge.interfaces.Car;
import bridge.interfaces.Engine;

public class Truck implements Car {
	private Engine engine;
	
	public Truck(Engine engine){
		this.engine = engine;
	}
	
	public void startEngine() {
		MyUtility.myPrint("Truck with engine " + this.engine.getEngineName() + " started.");
	}

}
