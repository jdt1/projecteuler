public class Problem3 {

	// finds the largest prime factor of the number 600851475143
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();		
		long start = (long)600851475143.0;
		long number = start;
		boolean finished = false;
		long current = 2;		
		
		while(!finished){
			if(number % current == 0){
				number = number/current;
				System.out.println("Current number is " + number + ".");
			}
			current++;
			if(current == number){
				finished = true;
			}
		}
		
		System.out.println("The largest prime factor of " + start + " is " + current +
				". (calculated in " + (System.nanoTime() - startTime)/1000 + " ms)");
	}
}
