package builder.impl;

import builder.interfaces.Builder;

public class ConcreteBuilder2 implements Builder {
	private String product;
	
	public ConcreteBuilder2(){
		product = "";
	}
	
	public void buildPartA() {
		this.product += " A2";
	}

	public void buildPartB() {
		this.product += " B2";

	}

	public void buildPartC() {
		this.product += " C2";

	}

	public String getResult() {
		
		return this.product;
	}

}
