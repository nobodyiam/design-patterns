package composite;

import composite.impl.File;
import composite.impl.Folder;
import composite.interfaces.IFile;

public class Client {
	public void test(){
		IFile root = new Folder("C:\\");
		IFile folder1 = new Folder("level1");
		root.add(folder1);
		IFile file1 = new File("level1.txt");
		root.add(file1);
		
		IFile folder2 = new Folder("level2");
		folder1.add(folder2);
		file1 = new File("level2.txt");
		folder1.add(file1);
		
		file1 = new File("level3.txt");
		folder2.add(file1);
		
		root.print("");
	}
	
	public static void main(String args[]){
		new Client().test();
	}
}
