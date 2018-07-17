import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

	// find the largest palindromic number made from the product of two 3-digit numbers
	
	static ArrayList<Integer> palindromes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();		
		int product = 0;
		int max = 0;
		
		for(int i = 1; i < 999; i++){
			for(int j = 1; j < 999; j++){
				product = i * j;
				System.out.println("Checking: " + product);
				if(isPalindrome(product) && product > max){
					max = product;
				}
			}
		}
		
		System.out.println("The largest palindromic number made from the product of " +
				"two 3-digit numbers is: " + max + ". (" +
				(System.currentTimeMillis() - startTime) + "ms)"		);		
	}
	
		
	// returns true if the number is a six-figure palindromic number
	public static boolean isPalindrome(int number){
		String numbers = Integer.toString(number);
		if(	numbers.length()  == 6
		 &&	numbers.charAt(0) == numbers.charAt(5)
		 &&	numbers.charAt(1) == numbers.charAt(4)
		 && numbers.charAt(2) == numbers.charAt(3) ){
			return true;
		}
		return false;
	}

}
