package ex1;

public class ValidateIdInfo {
	
	/*
	 * Validate all the IDs you have
	 * -SSN
	 * -DLNo
	 * -Area pin code
	 * -Car License plate
	 */
	
	public static void main(String[] args) {
		
		String ssn = "123-12-1234";
		String dLNum = "C 345 345 2345";
		String zip = "98765";
		String plate = "BHI 456";
		
		// Bad inputs
//		String ssn = "12312-1234";
//		String dLNum = "345 345 2345";
//		String zip = "98765p";
//		String plate = "BHI 4563";
		
//		if(isValidSSN(ssn)) {
//			System.out.println(ssn+" VALIDATED");
//		}else {
//			System.out.println(ssn+" is INVALID");
//		}
		
		//reduced repeated code
		validate(isValidSSN(ssn),ssn);
		validate(isValidDL(dLNum),dLNum);
		validate(isValidZip(zip),zip);
		validate(isValidPlate(plate),plate);
		
	}
	
	public static boolean isValidSSN (String ssn) {
		if(ssn.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidDL (String dLNum) {
		if(dLNum.matches("[A-Za-z]{1}\\s[0-9]{3}\\s[0-9]{3}\\s[0-9]{4}")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidZip (String zip) {
		if(zip.matches("[0-9]{5}")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidPlate (String plate) {
		if(plate.matches("[A-Z]{3} [0-9]{3}")) {
			return true;
		} else {
			return false;
		}
	}
	
	public static void validate(boolean b, String info) {
		if(b) {
			System.out.println(info +" VALIDATED");
		}else {
			System.out.println(info +" is INVALID");
		}
		
	}
	
	
	
}
