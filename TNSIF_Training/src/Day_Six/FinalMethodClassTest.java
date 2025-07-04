package Day_Six;

public class FinalMethodClassTest extends Final_Method_Class{
	
//	@Override
//	void show(){
//		System.out.println("This is final Merthod of a parent class");
//	}  We cannot Overide final method 
	
	void display() {
		System.out.println("Method created in the Final Method Class Test ");
	}
	
	public static void main(String[] args) {
		FinalMethodClassTest F2 =new FinalMethodClassTest();
		F2.display();
		F2.show();
	}
}
