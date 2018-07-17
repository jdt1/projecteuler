using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Numerics;

namespace Problem16
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime starttime = DateTime.Now;
            BigInteger number = new BigInteger(Math.Pow(2, 1000));
            int sum = 0;

            foreach (char s in number.ToString().ToArray())
            {
                sum = sum + int.Parse(s.ToString());   
            }

            Console.WriteLine("The sum of the digits of 2^1000 is " + sum +". (" + (DateTime.Now - starttime).TotalMilliseconds.ToString() + " ms)" );

            Console.Read();
        }
    }
}
