
public class Problem6 {

	// find the difference between the sum of the squares of the first 100 numbers
	// and the square of the sum of the first 100 numbers
	
	public static void main(String[] args) {
		
		int squares = 0;
		
		for(int i = 1; i <= 100; i++){
			squares = squares + i*i;
		}
		
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum = sum + i;
		}
		int squareOfSum = sum * sum;
		
		int difference = squareOfSum - squares;
		
		System.out.println("Difference: " + difference);
		
	}

}
