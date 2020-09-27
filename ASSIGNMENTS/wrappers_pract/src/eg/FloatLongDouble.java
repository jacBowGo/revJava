package eg;

public class FloatLongDouble {

	public static void main(String[] args) {
		
		Integer i5 = 5;
		Integer i6 = new Integer(10);
		Float f5 = 8.23f;
		Float f6 = new Float(7.45);
		Long L5 = 9234L;
		Long L6 = new Long(23420);
		Double d5 = 2349.234;
		Double d6 = new Double(2349.234);
		Double d7 = 2349.234;
		
		System.out.println("d5 == d6: " + (d5 == d6)); 
		System.out.println("d5 == d7: " + (d5 == d7)); //is false, should be true
		System.out.println("d5 equals d6 : "+d5.equals(d6));
		System.out.println("d5 equals d7 : "+d5.equals(d7));
		
		System.out.println("d5: " + d5);
		System.out.println("d6: " + d6);
		System.out.println("d7: " + d7);
		
		System.out.println(" ");
		
		Float f8 = 23.4f;
		System.out.println("f8.compareTo(23.4) : " + f8.compareTo(23.4f));
		System.out.println("i4.compareTo(24) : " + f8.compareTo(24f));
		System.out.println("i4.compareTo(23) : " + f8.compareTo(23f));
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		System.out.println(" ");
		
		Long L8 = 5267L;
		System.out.println("i4.compareTo(5267) : " + L8.compareTo(5267L));
		System.out.println("i4.compareTo(34567) : " + L8.compareTo(34567L));
		System.out.println("i4.compareTo(345) : " + L8.compareTo(345L));
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		
		System.out.println(" ");
		
		Double d8 = 3672.3;
		System.out.println("d8.compareTo(3672.3) : " + d8.compareTo(3672.3));
		System.out.println("d8.compareTo(3673) : " + d8.compareTo(3673d));
		System.out.println("d8.compareTo(3672) : " + d8.compareTo(3672d));
		
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		
		System.out.println(" ");
		
		String s = "65421.32";
		
		double a = d8;
		System.out.println("a: " + a);
		
		a = 2462;
		d8 = a;
		System.out.println("d8: " + d8);
		
		double x = Double.parseDouble(s);
		System.out.println("x = " + x);
		
		System.out.println(" ");
		
		float b = f8;
		System.out.println("b: " + b);
		
		b = 22;
		f8 = b;
		System.out.println("f8: " + f8);
		
		float y = Float.parseFloat(s);
		System.out.println("y = " + y);
		
		System.out.println(" ");
		
		long c = L8;
		System.out.println("c: " + c);
		
		a = 24235222;
		L8 = c;
		System.out.println("L8: " + L8);
		
		String s2 = "362";
		
		long z = Long.parseLong(s2);
		System.out.println("z = " + z);
		
		System.out.println(" ");
		
		x = 24673.2;
		s = x + "";
		System.out.println("s: " + s);
		
		System.out.println(" ");
		
		
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
