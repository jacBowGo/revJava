package type_casting_example;

public class TypeCastingDemo {

	public static void main(String[] args) {
		
		/*
		 * TypeCasting: Conversion of 1 data type to another
		 * 
		 * 1) Implicit Casting (taken care by compiler itself) - when we assign smaller data type to larger data type
		 * 		Please note that all the number family like (int, short, long, & byte) are considered as smaller than float and double
		 * 
		 * 2) Explicit Casting (programmer should do it) - when we convert larger type to the smaller data type, it's called as explicit casting
		 * 
		 */
		
		// 1)
		
		int x = 1000; //4bytes
		
		double d1 = x; //double is 8bytes //implicit casting done by compiler
		
		System.out.println("value of d1 = " + d1);
		
		float f1 = x; //float is 4bytes (still considered larger than int & long) //done implicitly
		System.out.println("value of f1 = " + f1);
		
		char c = 'A'; //2bytes
		
		int y = c; //4bytes implicit
		System.out.println("value of y = " + y);
		//prints out the ASCII value of the letter 'A'
		
		
		// 2)
		
		y = 100; //4bytes
		c = (char)y; //4bytes to 2bytes //explicit casting done by programmer
		System.out.println("value of c after explicit casting is " + c);
	
		float f = 99.88f;
		int z = (int)f;
		System.out.println("value of z = " + z);
		
		
	
	}
	
}
