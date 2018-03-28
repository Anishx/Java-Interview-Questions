/*

output of code
logic is entirely diff.

	        *
	      *   *
	    *       *
	  *           *
	*               *
	  *           *
	    *       *
	      *   *
	        *

*/
class Pattern7
{
	public static void main(String[] args)
	{
		int n = 5;
		for (int rows = 0 ;rows<n ;rows++ ) 
		{
			for (int s = 0 ; s<n-1-rows ;s++ ) 
			{
				System.out.print("  ");
			}
			for (int col =0 ; col <=2*rows ; col++ ) 
			{
				if(col == 0 || col == 2*rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

		for (int rows = n-2 ;rows>=0 ;rows-- ) 
		{
			for (int s = 0 ; s<n-1-rows ;s++ ) 
			{
				System.out.print("  ");
			}
			for (int col =0 ; col<=2*rows ; col++ ) 
			{
				if(col == 0 || col == 2*rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}