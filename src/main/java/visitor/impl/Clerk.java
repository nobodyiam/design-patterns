package visitor.impl;

import visitor.interfaces.Employee;
import visitor.interfaces.EmployeeVisitor;

public class Clerk implements Employee {
	private double income;
	
	public Clerk(){
		this(Employee.CLERK_INCOME);
	}
	
	public Clerk(double income){
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
