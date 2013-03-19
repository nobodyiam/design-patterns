package abstract_factory;

import utility.MyUtility;
import abstract_factory.impl.ConcreteFactory1;
import abstract_factory.impl.ConcreteFactory2;
import abstract_factory.interfaces.*;

public class Client {
	
	private AbstractFactory factory;
	
	public void setFactory(AbstractFactory factory) {
		this.factory = factory;
	}

	public void test(){
		if(this.factory == null){
			MyUtility.myPrint("no factory available!");
			return;
		}
		
		AbstractProductA a = factory.createProductA();
		MyUtility.myPrint(a.actionA());
		AbstractProductB b = factory.createProductB();
		MyUtility.myPrint(b.actionB());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = new Client();
		
		MyUtility.myPrint("Ready to test ConcreteFactory1");
		//ConcreteFactory1		
		client.setFactory(new ConcreteFactory1());
		client.test();
		MyUtility.myPrint("End of testing ConcreteFactory1");
		
		MyUtility.myPrint("Ready to test ConcreteFactory2");
		//ConcreteFactory2		
		client.setFactory(new ConcreteFactory2());
		client.test();
		MyUtility.myPrint("End of testing ConcreteFactory2");
	}

}
