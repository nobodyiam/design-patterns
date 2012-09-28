package visitor.impl;

import visitor.interfaces.Employee;
import visitor.interfaces.EmployeeVisitor;

public class Manager implements Employee {
	private double income;
	
	public Manager(){
		this(Employee.MANAGER_INCOME);
	}
	
	public Manager(double income){
		this.setIncome(income);
	}
	
	public double getIncome() {
		return this.income;
	}

	public void setIncome(double income) {
		this.income = income;
	}

	public void accept(EmployeeVisitor visitor) {
		visitor.visit(this);		
	}

}
