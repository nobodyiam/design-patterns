package visitor.impl;

import visitor.interfaces.Employee;
import visitor.interfaces.EmployeeVisitor;

public class IncomeVisitor implements EmployeeVisitor {

	public void visit(Employee e) {
		e.setIncome(e.getIncome() * Employee.INCOME_RATE);
	}
}
