package singleton;

import singleton.impl.SingletonFactory;
import singleton.impl.TestSingleton;
import singleton.interfaces.Factory;
import utility.MyUtility;

public class Client {
	
	public void test(){
		Factory factory = SingletonFactory.getInstance();
		MyUtility.myPrint("count: " + factory.getCount());
	}
	
	public void testSingleton(){
		TestSingleton test = TestSingleton.getInstance();
		test.printCount();
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client client = new Client();
		for(int i = 0;i<10;i++){
			client.test();
		}
		client.testSingleton();
	}

}
