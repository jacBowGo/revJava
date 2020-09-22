package operators_demo;

public class ArithmeticOpsDemo {
	
	/*
	 * +
	 * -
	 * *
	 *  //
	 * %
	 * 
	 * ++
	 * --
	 */
			

	public static void main(String[] args) {
		ArithmeticOpsDemo calc = new ArithmeticOpsDemo();
		calc.add();
		calc.subtract();
		calc.multiply();
		calc.divide();
		calc.remainder();
		calc.plus();
		calc.minus();
	}
	
	int x = 4;
	int y = 3;
	
	public void add() {
		
		int a = x + y;
		System.out.println("Adding " + x + " & " + y + " = " + a);
	}
	
	public void subtract() {

		int b = x - y;
		System.out.println("Subtracting " + x + " & " + y + " = " + b);
	}
	
	public void multiply() {

		int c = x * y;
		System.out.println("Multiplying " + x + " & " + y + " = " + c);
	}
	
	public void divide() {

		int d = x / y;
		System.out.println("Dividing " + x + " & " + y + " = " + d);
	}
	
	public void remainder() {

		int e = x % y;
		System.out.println("The remainder of dividing " + x + " & " + y + " = " + e);
	}
	
	public void plus() {
		
		int f = x;
		f++;
		System.out.println( x + " plus one = " + f);
	}
	
	public void minus() {
		
		int g = y;
		g--;
		System.out.println( y + " minus one = " + g);
	}
	
	
}
