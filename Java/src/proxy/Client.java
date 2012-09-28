package proxy;

import proxy.impl.DAOProxy;
import proxy.impl.Permission;
import proxy.interfaces.DAO;

public class Client {
	
	public void test(){
		Permission permission = new Permission(DAO.READ);
		this.testProxy(permission);
		permission = new Permission(DAO.CREATE);
		this.testProxy(permission);
		permission = new Permission(DAO.MODIFY);
		this.testProxy(permission);
	}
	
	private void testProxy(Permission permission){
		DAOProxy proxy = new DAOProxy(permission);
		proxy.create();
		proxy.read();
		proxy.update();
		proxy.delete();
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
