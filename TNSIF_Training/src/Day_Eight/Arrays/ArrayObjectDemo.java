package Day_Eight.Arrays;

public class ArrayObjectDemo {
	public static void main(String[] args) {
		//Student s = new Student(0, null);
		Student [] arr;
		
		//Declared memory for 5 object or type students
		arr =new Student [5];
		
		arr[0] = new Student(101,"Dev");
		arr[1] = new Student(102,"om");
		arr[2] = new Student(103,"jay");
		arr[3] = new Student(104,"sai");
		arr[4] = new Student(105,"ram");
		//arr[5] = new Student(106,"sham");
		
		for(int i =0;i<arr.length;i++) {
			System.out.println("Elements at"+i+": "+arr[i].getRoll_no()+"\t"+arr[i].getName());
		}
	}
}	
