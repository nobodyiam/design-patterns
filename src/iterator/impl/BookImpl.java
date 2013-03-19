package iterator.impl;

import iterator.interfaces.Book;

public class BookImpl implements Book {
	private String name;
	
	public BookImpl(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}

}
