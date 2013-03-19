package template_method;

import template_method.impl.Algorithm1Impl;
import template_method.interfaces.Algorithm;

public class Client {
	
	public void test(){
		Algorithm a1 = new Algorithm1Impl();
		a1.calc();
		a1.showResult();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
