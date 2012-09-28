package factory_method.impl;

import factory_method.interfaces.Creator;
import factory_method.interfaces.Product;

public class ConcreteCreator implements Creator {
	private Product product;
	
	public Product FactoryMethod() {		
		return new ConcreteProduct();
	}

	public Product GetProduct() {
		if(product == null){
			product = FactoryMethod();
		}
		return product;
	}

}
