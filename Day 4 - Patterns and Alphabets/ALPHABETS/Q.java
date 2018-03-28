/*

USE SKELETON IN LEGENDS-ALPHABET FOR UNDERSTANDING 

output->

  * * * * * * * * * *
*                     *
*                     *
*                     *
*                     *
*                     *
*           *         *
*             *       *
*               *     *
*                 *   *
*                   * *
  * * * * * * * * * * *
                        *
                          *
                            *

*/
class Q
{
	public static void main(String[] args)
	{
		int n=9;
		for (int row=0;row<n ;row++ ) 
		{
			for (int col=0;col<n;col++ ) 
			{
				
				if(row == 0            && col <((3*n)/4)			&& col !=((3*n)/4)	&& col != 0
				   || col == 0         && row < ((3*n)/4)			&& row !=((3*n)/4)  && row != 0
				   || row == ((3*n)/4) && col < ((3*n)/4)+1			&& col !=0
				   || col == ((3*n)/4) && row < ((3*n)/4)+1 		&& row !=0
				   || row == col       && row + col > ((3*n)/4)+1	
				  )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}