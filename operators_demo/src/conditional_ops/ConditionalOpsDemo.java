package conditional_ops;

public class ConditionalOpsDemo {

	/*
	 * Ternary Operator
	 * The ternary operator is named so because it has three operands. 
	 * It takes in a comparison and will return a specified value if the comparison evaluates to true or 
	 * another value if it evaluates to false.
	 * 
	 * If is equivalent to the phrase, "If this, return this, otherwise return that".
	 * 
	 * comparison_statement ? value to return if true : value to return if false;
	 * 
	 * ?:
	 * 
	 */
	
	public static void main(String[] args) {
		
		ConditionalOpsDemo ternary = new ConditionalOpsDemo();
		int z = ternary.compareInt();
		System.out.println(z);
		boolean y = ternary.compareBool();
		System.out.println(y);
		
	}
	
	public int compareInt() {
		int a = 5 < 3 ? 20:8;
		return a;
	}
	
	public boolean compareBool() {
		boolean b = 5 < 3 ? true:false;
		return b;
	}
	
	// can you do it with strings?
	//public int compareString() {
		//int a = 5 < 3 ? yes:no;
		//return a;
	//}
}
