package Day_Seven;

public class SavingsAccounts extends Customer implements Bank {
	
	private int accNo;
	private float balance;
	
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public SavingsAccounts(String name, String city,int accNo, float balance) {
		super(name,city);
		this.accNo = accNo;
		this.balance = balance;
	}

	@Override
	public void deposit(float amount) {
		// TODO Auto-generated method stub
		if(amount < 0 || amount > Deposit_Limit ) {
			System.out.println("Please Deposit valid amount");
		}else {
			balance += amount; // balance = balance + amount
			System.out.println("Rs: "+ amount +"Is deposited Successfully.");
		}
	}

	@Override
	public void withdraw(float amount) {
		// TODO Auto-generated method stub
		if (amount <= balance -MinBal) {
			balance -= amount;
			System.out.println("Rs: "+amount+ " Withdraw is successfully");
		}else {
			System.out.println("Insufficient Balance");
		}
	}

	@Override
	public String toString() {
		return "SavingsAccounts [accNo=" + accNo + ", balance=" + balance + ", name=" + name + ", City=" + City + "]";
	}
	
	
}
