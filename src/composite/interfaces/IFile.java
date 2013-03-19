package composite.interfaces;

public interface IFile {
	public void print(String indent);
	public boolean add(IFile file);
	public boolean remove(IFile file);
	public IFile getChild(int index);
	
	public final static String INDENT = "  ";
	public final static String FOLDER = " + ";
	public final static String FILE = " - ";
}
