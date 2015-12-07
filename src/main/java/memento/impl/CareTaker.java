package memento.impl;

import java.util.ArrayList;
import java.util.List;

import memento.interfaces.Memento;

public class CareTaker {
	private List<Memento> mementoes;
	
	public CareTaker(){
		this.mementoes = new ArrayList<Memento>();
	}

	public void addMemento(Memento memento) {
		this.mementoes.add(memento);
	}

	public Memento getMemento(int index) {
		if(index >= this.mementoes.size()){
			return null;
		}
		return mementoes.get(index);
	}
}
