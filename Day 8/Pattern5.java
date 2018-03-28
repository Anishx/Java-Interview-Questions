/*

output of code
logic is entirely diff.

* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *

*/
class Pattern5 
{
	public static void main(String[] args)
	{
		int n = 3;
		for (int rows = n-1 ;rows>=0 ;rows-- ) 
		{
			for (int s = 0 ; s<n-1-rows ;s++ ) 
			{
				System.out.print("  ");
			}
			for (int col =0 ; 2*rows>=col ; col++ ) 
			{
					System.out.print("* ");
			}
			System.out.println();
		}
	}
}