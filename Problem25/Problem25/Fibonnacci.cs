using System;
using System.Numerics;

namespace Problem25
{
	public class Fibonnacci
	{
		BigInteger first;
		BigInteger second;
		BigInteger third;	
		int counter;
		
		public Fibonnacci ()
		{
			first = 1;
			second =1;
			third = 2;
			counter = 3;
		}
		
		public BigInteger next(){
			BigInteger next = second + third;
			first = second;
			second = third;
			third = next;
			counter++;
			return next;
		}
		
		public BigInteger current(){
			return third;	
		}
		
		public int NumberOfDigits(){
			return third.ToString().Length;	
		}
		
		public int Counter(){
			return counter;	
		}
		
	}
}

