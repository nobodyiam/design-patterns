package iterator;

import utility.MyUtility;
import iterator.impl.BookImpl;
import iterator.impl.BookListImpl;
import iterator.interfaces.Book;
import iterator.interfaces.BookList;
import iterator.interfaces.BookListIterator;

public class Client {
	private BookList initializeBookList(){
		BookList bookList = new BookListImpl();
		
		Book book = new BookImpl("book1");
		bookList.add(book);
		
		book = new BookImpl("book2");
		bookList.add(book);
		
		book = new BookImpl("book3");
		bookList.add(book);
		
		return bookList;
	}
	
	public void test(){
		BookList bookList = this.initializeBookList();
		BookListIterator iterator = bookList.iterator();
		
		Book book;
		while(iterator.hasNext()){
			book = iterator.next();
			MyUtility.myPrint("Found book: " + book.getName());
		}
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
