package prototype.impl;

import prototype.interfaces.Prototype;

public class ConcretePrototype2 implements Prototype {
	private int number;
	
	public ConcretePrototype2(){
		this.number = 0;
	}
	
	public ConcretePrototype2(int number){
		this.number = number + 1;
	}
	
	public Prototype Clone() {		
		return new ConcretePrototype2(this.number);
	}

	public String GetID() {		
		return "ConcretePrototype2 - " + this.number;
	}

}
