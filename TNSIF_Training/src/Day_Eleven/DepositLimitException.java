package Day_Eleven;

public class DepositLimitException extends Exception {
	public DepositLimitException() {
		super("Daily limit of deposit is Exceed ....");
	}
	public DepositLimitException(String msg) {
		super(msg);
	}
}
