/*

output of the program 

* * * * *
* * * *
* * *
* *
*
* *
* * *
* * * *
* * * * *


*/
class Pattern2 
{
	public static void main(String[] args)
	{
		int n = 5;
		for (int rows=0 ; rows<n-1 ; rows++) 
		{
			for (int col = 0 ; col<n ; col++ ) 
			{
				if (rows<=col) {
					System.out.print("* ");	
				}
			}
			System.out.println();
		}
		for (int rows=0 ; rows<n ; rows++) 
		{
			for (int col = 0 ; col<n ; col++ ) 
			{
				if (rows + col >= n-1) {
					System.out.print("* ");	
				}
			}
			System.out.println();
		}
	}
}