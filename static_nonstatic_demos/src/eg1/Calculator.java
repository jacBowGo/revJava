package eg1;

public class Calculator {
	
	//treat entire java file like one project, so one file should only have one main

	
	public static void calculatorStatic() {
		System.out.println("Hello from Calculator's class calculatorStatic()");
		
	}
	
	public void calculatorNonStatic() {
		System.out.println("Hello from Calculator's class non-static");
		
	}
	
	public int add(int a, int b) {
		int res = a + b;
		return res;
		//could also be without "res"
		//return a + b;
		
	}
	
	public int add(int a, int b, int c) {
		return a + b + c;
		
	}
	
	//can have diff datatype in parameters, called casting, but if parameters match other class of same name (even with different "float/void/int" at beginning, it'll complain
	public float add(float a, float b) {
		//int res = a + b;
		return a + b;
		
	}
}

//add is overloaded above - 3 types of add with unique argument