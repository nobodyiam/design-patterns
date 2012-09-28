package factory_method.impl;

import factory_method.interfaces.Product;

public class ConcreteProduct implements Product {

	public String getProductName() {
		return "Concrete Product.";
	}

}
