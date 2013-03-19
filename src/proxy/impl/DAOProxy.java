package proxy.impl;

import proxy.interfaces.DAO;
import utility.MyUtility;

public class DAOProxy implements DAO {
	private Permission permission;
	private DAO daoImpl;
	
	public DAOProxy(Permission permission){
		this.permission = permission;
		this.daoImpl = new DAOImpl(); 
	}
	
	public void create() {
		MyUtility.myPrint("Doing create in DAOImpl");
		if(this.permission.getAccessLevel() >= DAO.CREATE ){
			MyUtility.myPrint("Access authorized, calling real create.");
			this.daoImpl.create();
		} else {
			MyUtility.myPrint("Access denied, because current permission not allowed.");
		}
	}

	public void delete() {
		MyUtility.myPrint("Doing delete in DAOProxy");
		if(this.permission.getAccessLevel() >= DAO.MODIFY ){
			MyUtility.myPrint("Access authorized, calling real delete.");
			this.daoImpl.delete();
		} else {
			MyUtility.myPrint("Access denied, because current permission not allowed.");
		}
	}

	public void read() {
		MyUtility.myPrint("Doing read in DAOProxy");
		if(this.permission.getAccessLevel() >= DAO.READ ){
			MyUtility.myPrint("Access authorized, calling real read.");
			this.daoImpl.read();
		} else {
			MyUtility.myPrint("Access denied, because current permission not allowed.");
		}
	}

	public void update() {
		MyUtility.myPrint("Doing update in DAOProxy");
		if(this.permission.getAccessLevel() >= DAO.MODIFY ){
			MyUtility.myPrint("Access authorized, calling real update.");
			this.daoImpl.update();
		} else {
			MyUtility.myPrint("Access denied, because current permission not allowed.");
		}
	}
}
