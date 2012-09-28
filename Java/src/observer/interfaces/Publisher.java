package observer.interfaces;

public interface Publisher {
	public void addSubscriber(Subscriber s);
	public void removeSubscriber(Subscriber s);
	public void notifySubscriber();
	public void setContent(String contents);
	public String getContent();
}
