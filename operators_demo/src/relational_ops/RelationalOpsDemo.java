package relational_ops;

public class RelationalOpsDemo {

	/*
	 * ==
	 * !=
	 * >
	 * <
	 * >=
	 * <=
	 */
	
	public static void main(String[] args) {
		
		RelationalOpsDemo relate = new RelationalOpsDemo();
		relate.equals();
		relate.doesntEqual();
		relate.greater();
		relate.less();
		relate.greaterOrEqual();
		relate.lessOrEqual();
		
	}
	
	int x = 6;
	int y = 9;
	
	public void equals() {
		
		if (x == y) {
			System.out.println( x + " equals " + y);
		} else {
			System.out.println( x + " does not equal " + y);
		}
	}
	
	public void doesntEqual() {
		
		if (x != y) {
			System.out.println( x + " does not equal " + y);
		} else {
			System.out.println( x + " equals " + y);
		}
	}
	
	public void greater() {
		
		if (x > y) {
			System.out.println( x + " is greater than " + y);
		} else {
			System.out.println( x + " is not greater than " + y);
		}
	}
	
	public void less() {
		
		if (x < y) {
			System.out.println( x + " is less than " + y);
		} else {
			System.out.println( x + " is not less than " + y);
		}
	}
	
	public void greaterOrEqual() {
		
		if (x >= y) {
			System.out.println( x + " is greater than or equal to " + y);
		} else {
			System.out.println( x + " is less than " + y);
		}
	}
	
	public void lessOrEqual() {
		
		if (x <= y) {
			System.out.println( x + " is less than or equal to " + y);
		} else {
			System.out.println( x + " is greater than " + y);
		}
	}
	
}
