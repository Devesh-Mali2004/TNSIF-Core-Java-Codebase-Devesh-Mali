package Day_Eleven;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		super("Insufficient baklance in your account");
	}
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
