package proxy.impl;

public class Permission {
	private int accessLevel;
	
	public Permission(int accessLevel){
		this.accessLevel = accessLevel;
	}
	
	public int getAccessLevel(){
		return this.accessLevel;
	}
}
