package problem3;

import java.util.Vector;

public class Problem3 {

	// largest prime factor of the number 600,851,475,143
	
	public static void main(String[] args) {
		long number = (long)600851475143.0;
		long max = 0;
		Vector<Long> numbers = new Vector<Long>();
		
		// fill the vector with all the numbers 1 - 600,851,475,143 
		//  !causes an OutOfMemoryError!
		for(long j = 1; j < number; j++){			
			numbers.add(j);
		}		
		
		System.out.println("Largest prime factor of the number 600851475143: " + max);

	}

}
