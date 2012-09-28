package iterator.impl;

import iterator.interfaces.Book;
import iterator.interfaces.BookList;
import iterator.interfaces.BookListIterator;

public class BookListIteratorImpl implements BookListIterator {
	private BookList bookList;
	private int index;
	
	public BookListIteratorImpl(BookList bookList){
		this.bookList = bookList;
		this.index = -1;
	}
	
	public Book currentItem() {
		return this.bookList.get(index);
	}

	public Book first() {
		return this.bookList.get(0);
	}

	public boolean isDone() {
		return this.index >= this.bookList.Count();
	}
	
	public boolean hasNext() {
		return this.index < this.bookList.Count() - 1;
	}
	
	public Book next() {
		this.index += 1;
		if(this.isDone()){
			return null;
		}else{
			return this.currentItem();
		}		
	}
}
