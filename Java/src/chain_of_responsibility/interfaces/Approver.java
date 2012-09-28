package chain_of_responsibility.interfaces;

public interface Approver {
	public void setSuccessor(Approver approver);
	public void prosessRequest(Purchase purchase);
	
	public static final double DIRECTOR_LIMIT = 10000.00;
	public static final double VP_LIMIT = 20000.00;
	public static final double PRESIDENT_LIMIT = 100000.00;
}
