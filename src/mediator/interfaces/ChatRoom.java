package mediator.interfaces;

public interface ChatRoom {
	public void register(Participant participant);
	public void send(String from, String to, String message);
}
