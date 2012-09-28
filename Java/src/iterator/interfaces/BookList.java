package iterator.interfaces;

public interface BookList {
	public BookListIterator iterator();
	public Book get(int index);
	public void add(Book book);
	public int Count();
}
