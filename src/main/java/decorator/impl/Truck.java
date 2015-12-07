package decorator.impl;

import utility.MyUtility;
import decorator.interfaces.Car;

public class Truck implements Car {
	public void drawColor(){
		MyUtility.myPrint("Drawing basic color...");
	}
}
