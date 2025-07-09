package Day_Eight.Arrays;

public class Student {
	
	//Data Members 
	private int Roll_no;
	private String Name;
	
	//Parameterized constructor
	public Student(int roll_no, String name) {
		super();
		Roll_no = roll_no;
		Name = name;
	}
	
	//getter and setter method 
	public int getRoll_no() {
		return Roll_no;
	}
	
	public void setRoll_no(int roll_no) {
		Roll_no = roll_no;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setName(String name) {
		Name = name;
	}
	
}
