using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Problem17
{
    class Program
    {
        static void Main(string[] args)
        {
            DateTime starttime = DateTime.Now;
            int sum = 0;

            for (int i = 1; i <= 1000; i++)
            {
                sum = sum + length(i);
            }

            Console.WriteLine("The number of letters used to write the numbers 1-1000 is " + sum + ". (" + (DateTime.Now - starttime).TotalMilliseconds.ToString() + " ms)");

            Console.Read();
        }

        // returns the number of letters used to write a number up to including 9999
        public static int length(int i)
        {
            int result = -1;

            if (i == 1 || i == 2 || i == 6 || i == 10)
            {
                result = 3;  
            }
            else if (i == 4 || i == 5 || i == 9)
            {
                result = 4;
            }
            else if (i == 3 || i == 7 || i == 8 || i == 40 || i == 50 || i == 60)
            {
                result = 5;
            }
            else if (i == 11 || i == 12 || i == 20 || i == 30 || i == 80 || i == 90)                
            {
                result = 6;
            }
            else if (i == 15 || i == 16 || i == 70 )
            {
                result = 7;
            }
            else if (i == 13 || i == 14 || i == 18 || i == 19)
            {
                result = 8;
            }
            else if (i == 17)
            {
                result = 9;
            }
            // general two-digit numbers above 20
            else if (i < 100 && i % 10 != 0)
            {
                result = length(
                    Int32.Parse( (i.ToString().Substring(0,1) + "0") ) )
                       + length(
                    Int32.Parse(  i.ToString().Substring(1,1)        ) );                    
            }
            // multiple of 100 under 1000
            else if (i >= 100 && i % 100 == 0 && i < 1000)
            {
                result = length(
                    Int32.Parse(i.ToString().Substring(0, 1))) + 7;                  
            }
            // general three digit numbers above 100
            else if (i > 100 && i < 1000)
            {
                result = length(
                    Int32.Parse(i.ToString().Substring(0, 1) + "00"))
                       + 3 // for the word "and"
                       + length(
                    Int32.Parse(i.ToString().Substring(1, 2)) );                           
            }
            // multiples of 1000 under 100000
            else if( i % 1000 == 0 && i < 100000)
            {
                result = length(
                    Int32.Parse(i.ToString().Substring(0, 1))) + 8;
            }
            else if (i >= 1000 && i < 10000)
            {
                result = length(
                    Int32.Parse(i.ToString().Substring(0,1) + "000") )
                       + length(
                    Int32.Parse(i.ToString().Substring(1,3))         );                    
            }
            return result;
        }


    }
}
