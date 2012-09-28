package abstract_factory.impl;

import abstract_factory.interfaces.AbstractFactory;
import abstract_factory.interfaces.AbstractProductA;
import abstract_factory.interfaces.AbstractProductB;

public class ConcreteFactory1 implements AbstractFactory {

	public AbstractProductA createProductA() {		
		return new ProductA1();
	}

	public AbstractProductB createProductB() {
		return new ProductB1();
	}
}
