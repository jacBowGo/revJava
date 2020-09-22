package data_types_demo;

public class Demo1 {

	public static void main(String[] args) {
		/*
		 * Data type - where you are asking java to allocate some memory for you to hold some values within it
		 * 
		 * Java provides 8 primitive data types with default values to it...
		 * 
		 * dataType				size				defaultValue
		 * -------------------------------------------------------
		 * byte					1byte					0
		 * short				2bytes					0
		 * int					4bytes					0
		 * long					8bytes					0
		 * 
		 * float				4bytes					0.0000f
		 * double				8bytes					0.0000d  in java any decimal values will by default be considered as double
		 * 
		 * char					2bytes					'\u00000'  (uni-code charset) supports 17 country languages (supports a lot of different symbols, go to unicode-table.com)
		 * boolean				1byte					false
		 * 
		 * String & Date are a class/object, they're not a datatype, they point to address of where the data is stored
		 * primitive datatypes holds the values within itself
		 */
		
		int x = 100;
		System.out.println("value of x = " + x);
		
		float f1 = 12.344f;
		System.out.println("value of f1 = " + f1);
		
		double d1 = 889.99;
		System.out.println("value of d1 = " + d1);
		
		String s = "Jac";
		System.out.println("Hellooooo " + s);
		
		char c = 'B';
		System.out.println("value of c = " + c);
		
		long l = 13246576L;
		System.out.println("value of l = " + l);
		
		boolean b = true;
		System.out.println("value of b = " + b);
		
	}
}
