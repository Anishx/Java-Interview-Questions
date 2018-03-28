/*

USE SKELETON IN LEGENDS-ALPHABET FOR UNDERSTANDING 

output->

*                           *
* *                       * *
*   *                   *   *
*     *               *     *
*       *           *       *
*         *       *         *
*           *   *           *
*             *             *
*                           *
*                           *
*                           *
*                           *
*                           *
*                           *
*                           *

*/
class M
{
	public static void main(String[] args)
	{
		int n=15;
		for (int row=0;row<n ;row++ ) 
		{
			for (int col=0;col<n;col++ ) 
			{
				
				if(col == 0
				   || col == n-1 
				   || row == col && row <= n/2
				   || row + col == n-1 && col >= n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}