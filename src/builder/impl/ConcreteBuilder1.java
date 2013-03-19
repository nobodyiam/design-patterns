package builder.impl;

import builder.interfaces.Builder;

public class ConcreteBuilder1 implements Builder {
	private String product;
	
	public ConcreteBuilder1(){
		product = "";
	}
	
	public void buildPartA() {
		this.product += " A1";
	}

	public void buildPartB() {
		this.product += " B1";

	}

	public void buildPartC() {
		this.product += " C1";

	}

	public String getResult() {
		
		return this.product;
	}

}
