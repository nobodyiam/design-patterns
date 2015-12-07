package memento;

import utility.MyUtility;
import memento.impl.CareTaker;
import memento.impl.OriginatorImpl;
import memento.interfaces.Originator;

public class Client {
	
	public void test(){
		CareTaker careTaker = new CareTaker();
		Originator originator = new OriginatorImpl();
		originator.setState("s1");
		originator.setState("s2");
		careTaker.addMemento(originator.createMemento());
		originator.setState("s3");
		originator.setMemento(careTaker.getMemento(0));
		MyUtility.myPrint("After set memento, the state is: " + originator.getState());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
