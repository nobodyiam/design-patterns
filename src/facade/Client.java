package facade;

import facade.impl.FacadeImpl;
import facade.interfaces.Facade;

public class Client {

	public void test(){
		Facade facade = new FacadeImpl();
		facade.doSomething();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}
}
