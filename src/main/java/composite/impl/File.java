package composite.impl;

import utility.MyUtility;
import composite.interfaces.IFile;

public class File implements IFile {
	private String name;
	
	public File(String name){
		this.name = name;
	}
	
	public boolean add(IFile file) {
		return false;
	}

	public IFile getChild(int index) {
		return null;
	}

	public void print(String indent) {
		MyUtility.myPrint(indent + IFile.FILE + this.name);
	}

	public boolean remove(IFile file) {
		return false;
	}

}
