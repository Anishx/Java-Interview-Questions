/*

USE SKELETON IN LEGENDS-ALPHABET FOR UNDERSTANDING 

output->

*             *
*           *
*         *
*       *
*     *
*   *
* *
*
* *
*   *
*     *
*       *
*         *
*           *
*             *

*/
class K
{
	public static void main(String[] args)
	{
		int n=15;
		for (int row=0;row<n ;row++ ) 
		{
			for (int col=n/2;col<n;col++ ) 
			{
				
				if(col == n/2 || row == col || row + col == n-1 )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}