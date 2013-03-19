package bridge;

import bridge.impl.Bus;
import bridge.impl.Engine1;
import bridge.impl.Engine2;
import bridge.impl.Truck;
import bridge.interfaces.Car;
import bridge.interfaces.Engine;

public class Client {
	
	private void test(Engine engine){
		Car car = new Bus(engine);
		car.startEngine();
		car = new Truck(engine);
		car.startEngine();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Engine engine1 = new Engine1();
		Engine engine2 = new Engine2();
		
		Client client = new Client();
		
		client.test(engine1);
		client.test(engine2);
	}

}
