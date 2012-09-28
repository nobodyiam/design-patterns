package prototype.impl;

import prototype.interfaces.Prototype;

public class ConcretePrototype1 implements Prototype {
	private int number;
	
	public ConcretePrototype1(){
		this.number = 0;
	}
	
	public ConcretePrototype1(int number){
		this.number = number + 1;
	}
	
	public Prototype Clone() {		
		return new ConcretePrototype1(this.number);
	}

	public String GetID() {		
		return "ConcretePrototype1 - " + this.number;
	}

}
