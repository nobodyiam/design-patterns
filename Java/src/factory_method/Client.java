package factory_method;

import utility.MyUtility;
import factory_method.impl.ConcreteCreator;
import factory_method.interfaces.Creator;
import factory_method.interfaces.Product;

public class Client {
	
	public void test(){
		Creator creator = new ConcreteCreator();
		Product product = creator.GetProduct();
		MyUtility.myPrint(product.getProductName());
	}
	
	public static void main(String args[]){
		new Client().test();
	}
}
