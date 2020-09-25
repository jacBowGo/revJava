package last_capital;

//import java.util.Arrays;

public class LastCapitalized {

	public static void main(String[] args) {
		
		String p = "how to change the last letters only";
		
		String arr[] = p.split(" ");
		
		//System.out.println(Arrays.toString(arr));
		
		StringBuilder ps = new StringBuilder();
		
		for (int i = 0; i < arr.length; i++) {
			
			int e = arr[i].length() - 1;
			
			ps.append(arr[i].substring(0, e)).append(Character.toUpperCase(arr[i].charAt(e))).append(" ");
		}
		
		System.out.println(ps.toString().trim());
		
	}
	
}
