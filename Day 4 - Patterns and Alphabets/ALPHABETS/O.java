/*

USE SKELETON IN LEGENDS-ALPHABET FOR UNDERSTANDING 

output->

  * * * * * * *
*               *
*               *
*               *
*               *
*               *
*               *
*               *
  * * * * * * *

*/
class O
{
	public static void main(String[] args)
	{
		int n=9;
		for (int row=0;row<n ;row++ ) 
		{
			for (int col=0;col<n;col++ ) 
			{
				
				if(   col == 0   && row!=0   && row!=n-1
				   || row == 0   && col!=0   && col!=n-1
				   || row == n-1 && col!=n-1 && col!=0
				   || col == n-1 && row!=n-1 && row!=0
				  )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}