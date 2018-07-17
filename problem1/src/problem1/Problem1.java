package problem1;

public class Problem1 {
	
	// sum of multiples of 3 and 5 under 1000

	public static void main(String[] args) {
		
		int som = 0;
		
		for(int j = 1; j < 1000; j++){
			if(j % 3 == 0 || j % 5 == 0){
				som = som + j;
			}
		}
		
		System.out.println("Sum of multiples of 3 or 5 under 1000: " + som);

	}

}
