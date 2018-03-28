/*

USE SKELETON IN LEGENDS-ALPHABET FOR UNDERSTANDING 

output->

*               *
  *           *
    *       *
      *   *
        *
      *   *
    *       *
  *           *
*               *

*/
class X
{
	public static void main(String[] args)
	{
		int n=9;
		for (int row=0;row<n ;row++ ) 
		{
			for (int col=0;col<n;col++ ) 
			{
				
				if(  row + col == n-1 || row == col
				  )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}