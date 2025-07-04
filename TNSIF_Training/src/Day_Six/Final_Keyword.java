package Day_Six;

public class Final_Keyword {
	//final int a; //Final instance variable Must be initialized
	
	final int x = 100;
	
	//declare a static blank final variable
	
	final static int y;
	final static int z =200;
	
	//instance Method
	void change() {
		//x=30; Final variable value cannot be change or reassign 
		//z=20;
	}

	@Override
	public String toString() {
		return "Final_Keyword [x=" + x + " y= "+y +" z = "+z+"]";
	}
	
	static {
		y=190;
		// z=123; We cannot change final static variable value in static block also 
	}
	
}
