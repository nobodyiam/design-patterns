package state.interfaces;

public interface AccountState {
	public void deposit(double amount);
	public void withDraw(double amount);
	public double getFee();
	public void stateCheck();
	
	public static final double GOLD_FEE = 0;
	public static final double SILVER_FEE = 10;
	public static final double NORMAL_FEE = 100;
	
	public static final double GOLD_LEVEL = 100000;
	public static final double SILVER_LEVEL = 1000;
}
