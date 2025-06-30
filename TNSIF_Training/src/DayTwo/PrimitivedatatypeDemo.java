package DayTwo;

public class PrimitivedatatypeDemo {

	public static void main(String[] args) {
		// Byte Takes 1 byte 
		// 1 byte = 8 bits mean 2^8 = 256
		// 256/2 =128
		
		byte ByteMin = -128;
		byte ByteMax = 127;
		System.out.println("Min Range of byte is: " + ByteMin + " Max Range of byte is: "+ByteMax);
		
		// Short takes 2 bytes
		// 2 byte = 16 bits mean 2^16
		short shortmin = -32768;
		short shortmax = 32767;
		System.out.println("Min Range of Short is: " + shortmin + " Max Range of Short is: "+ shortmax);
		
		// int takes 4 bytes
		// 4 byte = 32 bits mean 2^32
		int minInt = -2147483648;
		int maxInt = 2147483647;
		System.out.println("Min Range of Int is: " + minInt + " Max Range of Int is: "+ maxInt);
		
		// long takes 8 bytes
        // 8 bytes = 64 bits = 2^64 values
        long minLong = -9223372036854775808L;
        long maxLong = 9223372036854775807L;
        System.out.println("Min Range of long is: " + minLong + " Max Range of long is: " + maxLong);

        // float takes 4 bytes
        // 4 bytes = 32 bits, approx range: ±3.4e38
        float minFloat = -3.4e38f;
        float maxFloat = 3.4e38f;
        System.out.println("Min Range of float is: " + minFloat + " Max Range of float is: " + maxFloat);

        // double takes 8 bytes
        // 8 bytes = 64 bits, approx range: ±1.7e308
        double minDouble = -1.7e308;
        double maxDouble = 1.7e308;
        System.out.println("Min Range of double is: " + minDouble + " Max Range of double is: " + maxDouble);
        
        boolean minBoolean = false;
        boolean maxBoolean = true;
        System.out.println("Min Value of boolean: " + minBoolean + " Max Value of boolean: " + maxBoolean);
    }

}
