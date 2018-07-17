package problem2;
import java.util.Vector;

// calculate the sum of even numbers in the fibonacci
// sequence under 4 million
public class Problem2 {
	
	public static void main(String[] args) {	
			
		Vector<Integer> fibonacci = new Vector<Integer>();
		int limit = 4000000;
		int j = 1;
		int som = 0;
	
		fibonacci.add(1);
		fibonacci.add(2);
		
		while(fibonacci.get(j) < limit){
			fibonacci.add(fibonacci.get(j-1) + fibonacci.get(j));
			j++;
		}
		
		// please note: last value in the Vector fibonacci is not used
		for(int i = 0; i < j; i++){
			if(fibonacci.get(i) % 2 == 0){
				som = som + fibonacci.get(i);
			}			
		}
		
		System.out.println("Sum of even numbers in the fibonacci sequence under 4 million: " + som);
	
	}
	
}
