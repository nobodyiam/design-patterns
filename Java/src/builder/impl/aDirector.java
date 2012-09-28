package builder.impl;

import builder.interfaces.Builder;
import builder.interfaces.Director;

public class aDirector implements Director {
	private Builder builder;
	
	public aDirector(){
		
	}
	
	public aDirector(Builder builder){
		this.builder = builder;
	}
	
	public void Construct() {
		this.builder.buildPartA();
		this.builder.buildPartB();
		this.builder.buildPartC();
	}
}
