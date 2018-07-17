package problem19;

public class problem19 {

	public static void main(String[] args) {
		
		System.out.println("number of days between 1 jan 1900 and 1 jan 1901");
		
				
	}
		
	// returns number of days in the given month
	// days(1,1980) gives the number of days in January 1980
	public static int days(int month,int year){
		
		int[] defaultdays = {31,28,31,30,31,30,31,31,30,31,30,31};
		if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) )
		{
			defaultdays[1] = 29;
		}		
		return defaultdays[month - 1];		
	}

}
