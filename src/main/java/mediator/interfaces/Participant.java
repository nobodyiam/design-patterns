package mediator.interfaces;

public interface Participant {
	public void send(String to, String message);
	public void receive(String from, String message);
	public String getName();
	public void setChatRoom(ChatRoom chatRoom);
}
