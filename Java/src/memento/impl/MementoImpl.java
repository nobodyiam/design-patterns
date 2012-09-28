package memento.impl;

import memento.interfaces.Memento;

public class MementoImpl implements Memento {
	private String state;
	
	public MementoImpl(String state){
		this.setState(state);
	}
	
	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
