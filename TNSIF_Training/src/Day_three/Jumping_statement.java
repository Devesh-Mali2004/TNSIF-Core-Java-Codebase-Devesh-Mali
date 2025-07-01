package Day_three;

public class Jumping_statement {

	public static void main(String[] args) {
		
		//Continue
		for(int i=1;i<=20;i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println(i);
		}
		
		//Break
		for(int i=1;i<=10;i++) {
			if(i==5) {
				System.out.println(i);
				System.out.println("Hello Guys");
				break;
			}
		}
		
		
		//Switch case
		
		int userinput=1;
		switch(userinput)
		{
		case 1:System.out.println("Current Recharge Details");
		break;
		case 2:System.out.println("Current Recharge expiry");
		break;
		case 3:System.out.println("New Offers");
		break;
		case 4:System.out.println("Talk to pour customer support team");
		break;
		default:
			System.out.println(userinput+"is not valid input is given by you");
			break;
		}
		
	}

}
