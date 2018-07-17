import java.util.ArrayList;

public class Problem7 {

	// find the 10001th prime number	
	
	static ArrayList<Integer> primes = new ArrayList<Integer>();
	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int currentNumber = 1;	
		System.out.println("Started...");
		while(primes.size() < 10001){
			currentNumber++;
			if(isPrime(currentNumber)){
				primes.add(currentNumber);				
			}
		}	
		
		System.out.println("The 10001th prime number is: " + primes.get(10000)
				+ " (" + (System.currentTimeMillis() - startTime) + "ms)");
	
	}
	
	// returns true if currentNumber is a prime number
	public static boolean isPrime(int currentNumber){
		boolean isPrime = true;
		for(int i = 2; i <= Math.round(Math.sqrt(currentNumber)); i++){
			if(currentNumber % i == 0){
				isPrime = false;
			}
			if(i > 2){
				i++;
			}
		}
		return isPrime;
	}		

}
