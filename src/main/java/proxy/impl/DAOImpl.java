package proxy.impl;

import proxy.interfaces.DAO;
import utility.MyUtility;

public class DAOImpl implements DAO {

	public void create() {
		MyUtility.myPrint("Doing create in DAOImpl");		
	}

	public void delete() {
		MyUtility.myPrint("Doing delete in DAOImpl");
	}

	public void read() {
		MyUtility.myPrint("Doing read in DAOImpl");
	}

	public void update() {
		MyUtility.myPrint("Doing update in DAOImpl");
	}

}
