package singleton.impl;

import singleton.interfaces.Factory;

public final class SingletonFactory implements Factory {
	private int count;
	
	private static SingletonFactory instance = new SingletonFactory();
	
	private SingletonFactory(){
		this.count = 0;
	}
	
	public static SingletonFactory getInstance(){
		return SingletonFactory.instance;
	}
	
	public int getCount() {
		return this.count++;
	}

}
