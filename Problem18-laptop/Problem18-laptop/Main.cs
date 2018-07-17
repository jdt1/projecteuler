using System;

namespace Problem18laptop
{
	class MainClass
	{
		public static void Main (string[] args)
		{
			Console.WriteLine ("Hello World!");
			
			TextReader reader = File.OpenText("input.txt");
			
			
			reader.Close();
			
			Console.Read ();
		}
	}
}
