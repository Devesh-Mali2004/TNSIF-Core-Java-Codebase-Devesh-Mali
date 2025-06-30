package DayTwo;

public class Typecasting {
	public static void main(String[] args) {
		//Widening or implicit 
			byte  b =20;
			int i =b;
			System.out.println(i);
			
			float f = 22.14f;
			double d = f;
			System.out.println(d);
		//Narrowing or explicit
			double d1 = 32.14356d;
			long l1 = (long) d1;
			System.out.println(l1);
			
			long l2= 9699148505L;
			int i1 = (int) l2;
			System.out.println(i1);
			
	}
}
