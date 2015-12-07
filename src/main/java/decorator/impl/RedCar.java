package decorator.impl;

import utility.MyUtility;
import decorator.interfaces.Car;
import decorator.interfaces.ColorfulCarDecorator;

public class RedCar implements ColorfulCarDecorator {
	private Car car;
	
	public RedCar(Car car){
		this.car = car;
	}
	
	public void drawColor() {
		this.car.drawColor();
		this.drawMoreColors();
	}
	
	public void drawMoreColors(){
		MyUtility.myPrint("Drawing color red...");
	}
}
