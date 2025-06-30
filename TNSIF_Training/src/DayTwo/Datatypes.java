package DayTwo;

public class Datatypes {
	public static void main(String [] args) {
		/*There are 2 types of datatype
		Datatype : 1. It is a container which store the data.  2.Type of data a variable can hold 3.How Much Memory is Allocate
		1.Primitive Datatype : 1.Fixed Size Memory Allocated 2.Fixed Range 
		2.Non-Primitive Datatype : 1.Dynamic Size 2. Range is not define
		
		Primitive Datatype 
		There are 4 Types in these
		1.Integer
			1.byte: 1 byte data can store 	range : -128 to 127
			2.short: 2 byte data can store 	range : -32,768 to 32767
			3.int: 4 byte data can store 	range : -2,147,483,648 to 2,147,483,647
			4.long: 8 byte data can store 	range : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		2.Float 
			1.float : 4 Byte data can store    range:-3.4 × 10³⁸ (approx) to 3.4 × 10³⁸ (approx)
			2.Decimal:8 Byte data can store    range:-1.7 × 10³⁰⁸ (approx) to 1.7 × 10³⁰⁸ (approx)
		3.Character 
			1.char : 2 byte of data 
		4.Boolean
		 	1.boolean : 1 bit of data.
		*/
		
		int value = 9/2;
		System.out.println(value);
		
		float value1 = 93543f/22f;
		System.out.println(value1);
		
		double value2 = 90d/0.45d;
		System.out.println(value2);
		
		int radius = 21;
		double area = 3.14 * radius * radius;
		System.out.println(area);
		
		char ch ='a';
		System.out.println(ch);
		
		char ch2 = 69;
		System.out.println(ch2);
		
		// Assigning Unicode to character 
		char ch1 ='\u0905';
		System.out.println(ch1);
	}

}
