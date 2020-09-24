package bitwise_ops;

public class BitwiseOpsDemo {
	
	/*
	 * & bitwise AND
	 * | bitwise OR
	 * ^ bitwise XOR
	 * 
	 * 
	 * bitwise AND (&), bitwise exclusive OR (^), and bitwise inclusive OR (|)
	 * 
	 * need to understand gates
	 * 
	 * https://www.w3schools.com/java/java_operators.asp
	 * 
	 * &
	 * | bitwise inclusive OR
	 * ~ bitwise complement
	 * ^ bitwise exclusive OR
	 * << left shift
	 * 			Zero-fill left shift - Shift left by pushing zeroes in from the right and letting the leftmost bits fall off
	 * >> right shift
	 * 			Signed right shift - Shift right by pushing copies of the leftmost bit in from the left and 
	 * 			letting the rightmost bits fall off
	 * >>> unsigned right shift
	 * 			Zero-fill right shift - Shift right by pushing zeroes in from the left and letting the rightmost bits fall off
	 * 
	 * https://www.geeksforgeeks.org/operators-in-java/#Bitwise%20Operators
	 * Bitwise Operators : These operators are used to perform manipulation of individual bits of a number. 
	 * 					   They can be used with any of the integer types. 
	 * 					   They are used when performing update and query operations of Binary indexed tree.
	 *	&, Bitwise AND operator: returns bit by bit AND of input values.
	 * 	|, Bitwise OR operator: returns bit by bit OR of input values.
	 *	^, Bitwise XOR operator: returns bit by bit XOR of input values.
	 *	~, Bitwise Complement Operator: This is a unary operator which returns the one’s compliment representation of the input value, 
	 *									i.e. with all bits inversed.
	 *
	 * 101 011 = false false true = 001
	 * 5&3 = 001 = 1
	 * 
	 * 101 011 = true true true = 111 = 7
	 * 5|3 = 7
	 * 
	 * 0000 0101 = 1111 1010 = -6 by two's complement
	 * ~5 = 2
	 * 
	 * 101 011 = true true false = 110 = 2
	 * 5^3 = 2
	 * 
	 * 
	 * 5<<1 = 0101 = 1010 = 10
	 * 
	 * 5<<2 = 0101 = 0001 0100 = 20
	 * 
	 * 5>>1 = 0101 = 1010 = 10 ??
	 * 
	 * 5>>>1 = 0101 = 0010 = 2
	 * 
	 * don't get the last two difference
	 * 
	 * functions on the bit by bit level
	 */
	
	public static void main(String[] args) {
		
		BitwiseOpsDemo bits = new BitwiseOpsDemo();
		bits.and();
		bits.or();
		bits.complement();
		bits.xor();
		bits.leftShiftOnce();
		bits.leftShiftTwice();
		bits.rightShift();
		bits.rightShiftUnsigned();
		
	}
	
	int x = 5;
	int y = 3;
	
	 // & AND
	public void and() {
		int a = x & y;
		/*
		 * This compares the digits of the binary version of each number and if both digits are '1' it comes out as true.
		 * True = 1
		 * False = 0
		 * The resulting true and falses will create a new binary number, which will be converted back into a base 10 number.
		 */
		System.out.println( x + "&" + y + " = " + a);
	}
	
	
	 // | bitwise inclusive OR
		public void or() {
			int b = x | y;
			System.out.println( x + "|" + y + " = " + b);
	}
	
	
	 // ~ bitwise complement
		public void complement() {
			int c = ~x;
			System.out.println( "~" + x + " = " + c);
	}
	
	 // ^ bitwise exclusive OR , XOR
		public void xor() {
			int d = x ^ y;
			System.out.println( x + "^" + y + " = " + d);
	}
	
	
	 // << left shift
		public void leftShiftOnce() {
			int e = x << 1;
			System.out.println( x + " shifted to the left once is " + e);
	}
		
		public void leftShiftTwice() {
			int f = x << 2;
			System.out.println( x + " shifted to the left twice is " + f);
	}
	
	 // >> right shift
		public void rightShift() {
			int g = x >> 1;
			System.out.println( x + " shifted to the right once is " + g);
	}
	
	 // >>> unsigned right shift
		public void rightShiftUnsigned() {
			int h = x >>> 1;
			System.out.println( x + " shifted to the right is " + h);
	}

}
