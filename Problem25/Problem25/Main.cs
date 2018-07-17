using System;
using System.Diagnostics;

namespace Problem25
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Fibonnacci fb = new Fibonnacci();
			Stopwatch sw = Stopwatch.StartNew();
			
			while(fb.NumberOfDigits() < 1000){
				Console.WriteLine("Current term: " + fb.Counter() + ", current number of digits: " + fb.NumberOfDigits());
				fb.next();
				
			}
			
			sw.Stop();
			Console.WriteLine("The first number in the Fibonnacci sequence to have 1000 digits is " +
			                  fb.current().ToString() + ", this is the " + fb.Counter() + "th term (" + 
			                  sw.ElapsedMilliseconds.ToString() + " ms)" );
            Console.Read();
		}
		
		
		
	}
}
 