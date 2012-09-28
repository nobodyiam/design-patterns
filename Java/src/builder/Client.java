package builder;

import utility.MyUtility;
import builder.impl.*;
import builder.interfaces.*;

public class Client {
	
	public void test(Builder builder){
		Director director = new aDirector(builder);
		director.Construct();
		MyUtility.myPrint(builder.getResult());
	}
	
	public static void main(String args[]){
		Builder builder = null;
		Client client = new Client();
		
		MyUtility.myPrint("Start building product using ConcreteBuild1");
		builder = new ConcreteBuilder1();
		client.test(builder);
		MyUtility.myPrint("End building product using ConcreteBuild1");
		
		MyUtility.myPrint("Start building product using ConcreteBuild2");
		builder = new ConcreteBuilder2();
		client.test(builder);
		MyUtility.myPrint("End building product using ConcreteBuild2");
	}
}
