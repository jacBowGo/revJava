package eg;

public class FloatLongDouble {

	public static void main(String[] args) {
		
		Integer i1 = 234;
		Float f2 = i1.floatValue();
		System.out.println("integer to float: " + f2);
		Double d3 = f2.doubleValue();
		System.out.println("float to double: " + d3);
		Long L3 = d3.longValue();
		System.out.println("double to long: " + L3);
		System.out.println(" ");
		
		Float f1 = 44f;
		Long L2 = f1.longValue();
		System.out.println("float to long: " + L2);
		Double d2 = L2.doubleValue();
		System.out.println("long to double: " + d2);
		Integer i2 = d2.intValue();
		System.out.println("double to integer: " + i2);
		System.out.println(" ");
		
		Long L1 = 20937L;
		Integer i3 = L1.intValue();
		System.out.println("long to integer: " + i3);
		Double d4 = i3.doubleValue();
		System.out.println("integer to double: " + d4);
		Float f3 = d4.floatValue();
		System.out.println("double to float: " + f3);
		System.out.println(" ");
		
		Double d1 = 239.23d;
		Float f4 = d1.floatValue();
		System.out.println("double to float: " + f4);
		Integer i4 = f4.intValue();
		System.out.println("float to integer: " + i4);
		Long L4 = i4.longValue();
		System.out.println("integer to long: " + L4);
		
	}
	
}
