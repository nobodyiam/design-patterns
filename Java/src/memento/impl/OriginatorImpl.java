package memento.impl;

import memento.interfaces.Memento;
import memento.interfaces.Originator;

public class OriginatorImpl implements Originator {
	private String state;
	
	public Memento createMemento() {
		return new MementoImpl(this.getState());
	}

	public void setMemento(Memento m) {
		this.setState(m.getState());
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

}
