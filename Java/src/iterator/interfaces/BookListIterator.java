package iterator.interfaces;

public interface BookListIterator {
	public Book first();
	public Book next();
	public boolean isDone();
	public boolean hasNext();
	public Book currentItem();
}
