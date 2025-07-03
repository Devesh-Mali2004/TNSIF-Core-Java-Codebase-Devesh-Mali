package Day_Five;

public class Executor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address("1920 More wasti","Pune","Maharashtra",412062);
		
		Person p =new Person("Devesh",a);
		p.displayInfo();
		System.out.println(p);
	}

}
