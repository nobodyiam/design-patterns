package adapter;

import adapter.impl.Adapter;
import adapter.interfaces.Target;

public class Client {
	private void test(){
		Target target = new Adapter();
		target.SendMail();
	}
	
	public static void main(String args[]){
		new Client().test();
	}
}
