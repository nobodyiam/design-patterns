package memento.interfaces;

public interface Originator {
	public void setMemento(Memento m);
	public Memento createMemento();
	public void setState(String state);
	public String getState();
}
