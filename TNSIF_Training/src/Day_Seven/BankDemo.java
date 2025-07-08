package Day_Seven;

public class BankDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingsAccounts s1 = new SavingsAccounts("Devesh", "Pune", 9752436, 36000);
		s1.deposit(23789);
		System.out.println(s1);
		s1.withdraw(42373);
		System.out.println(s1);
	}

}
