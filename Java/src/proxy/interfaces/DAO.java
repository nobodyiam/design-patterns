package proxy.interfaces;

public interface DAO {
	public void create();
	public void read();
	public void update();
	public void delete();
	
	public final static int READ = 0;
	public final static int CREATE = 1;
	public final static int MODIFY = 2;
}
