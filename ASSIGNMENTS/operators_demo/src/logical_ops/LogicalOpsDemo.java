package logical_ops;

public class LogicalOpsDemo {
	
	/*
	 * Practice use the logical operators ( && AND, || OR, and ! Reverse )
	 */
	
	public static void main(String[] args) {
		LogicalOpsDemo logic = new LogicalOpsDemo();
		logic.and();
		logic.or();
		logic.not();
	}
	
	boolean x = true;
	boolean y = false;
	
	public void and() {
		if (x && y) {
			System.out.println("Both are true");
		} else {
			System.out.println("One or both of them are false");
		}
	}
	
	public void or() {
		if (x || y) {
			System.out.println("One or both of them are true");
		} else {
			System.out.println("Neither are true");
		}
	}
	
	public void not() {
		if (!(x && y)) {
			System.out.println("One or both of them are false");
		} else {
			System.out.println("Both are true");
		}
	}

}
