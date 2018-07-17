using System;
using System.Numerics;
using System.Diagnostics;

namespace Problem20
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Stopwatch sw = Stopwatch.StartNew();
			int sum = 0;
			foreach(char c in factorial(100).ToString().ToCharArray()){
				sum += Int32.Parse(c.ToString());		
			}
			sw.Stop();
			Console.WriteLine("The sum of the digits of 100! is " + sum + ". (" + sw.ElapsedMilliseconds.ToString()
				+ " ms)" );

            Console.Read();
			
		}
		
		public static BigInteger factorial(int n){
			BigInteger result = 1;	
			for(int i = 1; i <= n; i++){
				result = result * i;	
			//	Console.WriteLine("Factorial(" + i + ") = "  + result);
			}
			return result;
		}
	}
}
