package Day_Eleven;

public class SynchronizationDriver {
	public static void main(String[] args) throws InsufficientBalanceException {
		
		Account Neti = new Account(1001,"Neti",45000);
		
		System.out.println(Neti);
		
		//Neti.Withdraw(7865);
		
		AccountThread t[] =new AccountThread[10];
		for(int i =0;i<10;i++) {
			t[i] = new AccountThread(Neti, 5000);
		}
		try {
			for(int i =0;i<10;i++) {
				t[i].join();
				
			}
		}catch(InterruptedException e) {
			System.err.println(e.getMessage());
		}
		
		System.out.println("--------------------------------------");
		System.out.println(Neti);
	}
}
