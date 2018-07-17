public class Problem5 {

	// finds the largest number that is evenly divisible by 1-20
	
	public static void main(String[] args) {
		long currentNumber = 20;
		long startTime = System.currentTimeMillis();
		
		while(!isValid(currentNumber)){
			currentNumber = currentNumber + 20;
			System.out.println("Checking: " + currentNumber);
		}
		
		System.out.println("The largest number that is evenly divisible by 1-20 is: "
				+ currentNumber + ". (" + (System.currentTimeMillis() - startTime) + "ms)");
		
	}
	
	// returns true if the number is evenly divisible by 1-20 
	public static boolean isValid(long number){
		if(	number % 20 == 0
		&& 	number % 19 == 0
		&& 	number % 18 == 0
		&& 	number % 17 == 0
		&& 	number % 16 == 0
		&& 	number % 15 == 0
		&& 	number % 14 == 0
		&& 	number % 13 == 0
		&& 	number % 12 == 0
		&& 	number % 11 == 0){		
			return true;
		}
		return false;
	}

}
