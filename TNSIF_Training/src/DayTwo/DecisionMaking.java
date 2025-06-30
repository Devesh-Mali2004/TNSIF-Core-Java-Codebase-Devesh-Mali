package DayTwo;

public class DecisionMaking {
	public static void main(String [] args) {
		// if loop
		int x1=3;
		if(x1 == 4 ) {
			System.out.println("Value of x1 is 4");
		}	
		
		//if - else loop
		int age =55;
		
		if(age >= 18)
		{ 
			System.out.println("you are eligible for voting ");
		}
		else
		{
			System.out.println("Sorry ! You need to wait more ");
		}
		
		//Nested if-else loop
		int a=110, b=20, c=5;
		System.out.print("The largest no is :");
		if(a>b )
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else 
			{
				System.out.println(c);
			}
		}
		else
		{
			if(c>b)
			{
				System.out.println(c);
			}
			else {
				System.out.println(b);
			}
		}
		
		//Decision Making Statements 
		
		int x=8, y =7;
		int a1=10, b1=11;
		
		if(x>=y)
		{
			System.out.println("true ");
		}
		else
		{
			System.out.println("False");
		}
		//   a>b
		if(!(a1<b1) || (a1==b1))
		{
			System.out.println("condition is true ");
		}
		else
		{
			System.out.println("Condition is false");
		}

	}
}
