package conditional_ops;

public class ConditionalOpsDemo {

	/*
	 * Practice with Conditional Operators 
	 */
	
	public static void main(String[] args) {
		ConditionalOpsDemo ternary = new ConditionalOpsDemo();
		int z = ternary.compareInt();
		System.out.println(z);
		boolean y = ternary.compareBool();
		System.out.println(y);
		boolean w = ternary.compareBool2();
		System.out.println(w);
		String v = ternary.compareString();
		System.out.println(v);
	}
	
	public int compareInt() {
		int a = 5 > 3 ? 20:8;
		return a;
	}
	
	public boolean compareBool() {
		return 5 < 3 ? true:false;
	}
	
	public boolean compareBool2() {
		boolean b = false || true ? true:false;
		return b;
	}
	
	public String compareString() {
		String c = 5 <= 3 ? "yes":"no";
		return c;
	}
}
