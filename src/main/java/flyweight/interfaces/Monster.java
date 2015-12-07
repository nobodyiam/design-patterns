package flyweight.interfaces;

public interface Monster {
	public void display(int position);
	public int getLevel();
	
	public final static int HARD = 0;
	public final static int MEDIUM = 1;
	public final static int EASY = 2;
	public final static int UNKNOWN = 3;
}
