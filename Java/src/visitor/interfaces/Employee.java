package visitor.interfaces;

public interface Employee {
	public double getIncome();
	public void setIncome(double income);
	public void accept(EmployeeVisitor visitor);
	
	public final static double MANAGER_INCOME = 10000;
	public final static double CLERK_INCOME = 5000;
	public final static double INCOME_RATE = 1.2;
}
