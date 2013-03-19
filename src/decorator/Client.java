package decorator;

import decorator.impl.RedCar;
import decorator.impl.Truck;
import decorator.impl.YellowCar;
import decorator.interfaces.Car;

public class Client {
	
	public void test(){
		Car truck = new Truck();
		Car yellowTruck = new YellowCar(truck);
		yellowTruck.drawColor();
		
		Car redTruck = new RedCar(truck);
		redTruck.drawColor();
	}
	
	public static void main(String args[]){
		new Client().test();
	}
}
