package iterator.impl;

import java.util.ArrayList;

import iterator.interfaces.Book;
import iterator.interfaces.BookList;
import iterator.interfaces.BookListIterator;

public class BookListImpl implements BookList {
	private ArrayList<Book> bookList;
	
	public BookListImpl(){
		this.bookList = new ArrayList<Book>();
	}
	
	public BookListIterator iterator() {
		return new BookListIteratorImpl(this);
	}

	public Book get(int index) {
		if(index < this.Count())
			return this.bookList.get(index);
		return null;
	}
	
	public void add(Book book){
		this.bookList.add(book);
	}

	public int Count() {
		return this.bookList.size();
	}

}
