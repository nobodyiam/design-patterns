package visitor;

import utility.MyUtility;
import visitor.impl.Clerk;
import visitor.impl.IncomeVisitor;
import visitor.impl.Manager;
import visitor.interfaces.Employee;
import visitor.interfaces.EmployeeVisitor;

public class Client {
	
	public void test(){
		Employee manager = new Manager();
		Employee clerk = new Clerk();
		EmployeeVisitor visitor = new IncomeVisitor();
		
		manager.accept(visitor);
		clerk.accept(visitor);
		clerk.accept(visitor);
		
		MyUtility.myPrint("Current income for manager is: " + manager.getIncome());
		MyUtility.myPrint("Current income for clerk is: " + clerk.getIncome());
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Client().test();
	}

}
