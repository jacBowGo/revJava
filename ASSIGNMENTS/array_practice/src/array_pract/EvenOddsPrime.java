package array_pract;

import java.util.Arrays; //ctrl spaced after typing "Arrays" to get the import

public class EvenOddsPrime {
	
	/*
	 * Practice with arrays, searched for all:
	 * -- even numbers
	 * -- odd numbers
	 * -- prime numbers
	 * -- palindromes in an array
	 */

	public static void main(String[] args) {
		
		EvenOddsPrime p = new EvenOddsPrime();
		
		p.setArray();
		//System.out.println(Arrays.toString(ar1));
		System.out.println(" ");
		p.evenArray();
		System.out.println(" ");
		p.oddArray();
		System.out.println(" ");
		p.primeArray();
		System.out.println(" ");
		p.palinArray();
		
	}
	
	int[] ar1 = new int[50];
	String[] ar2 = {"anna", "happy", "bus", "racecar", "peace", "noon"};
	int[] ar3 = {33, 4, 6, 23, 43, 100, 56, 7, 9};
	
	
	public void setArray() {
		
		for (int i = 0; i < ar1.length; i++) {
			ar1[i] = i+1;
			System.out.print(ar1[i] + " ");
		}
	}
	
	public void evenArray() {
		
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 == 0) {
				System.out.print(ar1[i] + " ");
			}
		}
	}
		
	public void oddArray() {
			
		for (int i = 0; i < ar1.length; i++) {
			if (ar1[i] % 2 != 0) {
				System.out.print(ar1[i] + " ");
			}
		}
	}
	
	public void primeArray() {
		
		int arr[] = ar1;
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean prime = true;
			
			if (arr[i] == 1) prime = false;
			else {
				for (int j = 2; j <= arr[i] / 2; j++) {
					if (arr[i] % j == 0) {
						prime = false;
						break;
					}
				}	
			}
			if (prime) System.out.print(arr[i] + " ");
		}
	}
	
	public void palinArray() {
		
		String strArr[] = ar2;
		int palinCounter = 0;
		
		for (int i = 0; i < strArr.length; i++) {
			
			String word = strArr[i];
			int counter = 0;
			
			for (int j = 0, k = word.length() - 1; j <= word.length()/2; j++, k--) {
				if (word.charAt(j) != word.charAt(k)) break;
				else counter++;
			}
			
			if (counter > 0) {
				System.out.println(strArr[i] + " is a palindrome");
				palinCounter++;
			}
		}

		System.out.println("There are " + palinCounter + " palindromes in this array.");
	}	
}
