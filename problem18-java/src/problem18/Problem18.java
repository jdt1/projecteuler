package problem18;

import java.io.File;
import java.util.Scanner;

public class Problem18 {
	
	static int n = 15; // number of rows
	
	public static void main(String[] args) 
	{			
		int[][] m = read("input.txt");		
		final long startTime = System.nanoTime();
		int result = solve(m);
		final long endTime = System.nanoTime();
		System.out.println("Maximum path sum: " + result + ". (" + (double)(endTime - startTime)/1000000 + " ms)");		
	}
	
	public static int[][] read(String path)
	{
		int[][] m = new int[n][n];
		try
		{			
			Scanner scanner = new Scanner( new File(path) );
			for(int j = 0; j < n; j++)
			{
				for(int i = 0; i <= j; i++)
				{
					int t = scanner.nextInt();
					m[i][j] = t;					
				}
			}			
			scanner.close();
		} 
		catch (Exception e)
		{
			System.out.println( e.getMessage() );
		}
		return m;	
	}
	
	public static int solve(int[][] m)
	{
		int[][] t = m;
		for(int y = n-2; y >= 0; y--)
		{
			for(int x = 0; x <= y; x++)
			{				
				//System.out.print(t[x][y] + Math.max(t[x][y+1], t[x+1][y+1]) + " ");				
				t[x][y] = t[x][y] + Math.max(t[x][y+1], t[x+1][y+1]);
			}
			//System.out.println();
		}		
		return t[0][0];		
	}
		
	
}
