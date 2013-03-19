package composite.impl;

import java.util.ArrayList;
import java.util.List;

import utility.MyUtility;

import composite.interfaces.IFile;

public class Folder implements IFile {
	private String name;
	private List<IFile> fileList;
	
	
	public Folder(String name){
		this.name = name;
		this.fileList = new ArrayList<IFile>(); //ArrayList is not synchronized, while Vector is
	}
	
	public boolean add(IFile file) {
		if(this.fileList.contains(file)){
			return false;
		}
		this.fileList.add(file);
		return true;
	}

	public IFile getChild(int index) {		
		return this.fileList.get(index);
	}

	public void print(String indent) {
		//MyUtility.myPrint("Begin printing folder " + this.name);
		MyUtility.myPrint(indent + IFile.FOLDER + this.name);
		indent = indent + IFile.INDENT;
		for(IFile file:this.fileList ){
			file.print(indent);
		}
		//MyUtility.myPrint("End printing folder " + this.name);
	}

	public boolean remove(IFile file) {
		return this.fileList.remove(file);
	}

}
