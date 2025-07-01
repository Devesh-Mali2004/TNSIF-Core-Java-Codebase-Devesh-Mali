package Day_three;

import java.util.Scanner;

public class NestedForLoops {
	public static void main(String []args) {
//		int start=5,end=20;
//		for(int i = start; i<=end;i++) {
//			for(int j =1; j<=10;j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}System.out.println();
//		}
//		
		System.out.println("Enter a number of rows");
		Scanner sc = new Scanner(System.in);
		int Rows = sc.nextInt();
		for(int i =1;i<=Rows;i++) {
			for(int j =1;j<=i;j++) {
				if(j ==1|| j==i||i==Rows) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
