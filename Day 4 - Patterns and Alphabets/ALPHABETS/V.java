/*

USE SKELETON IN LEGENDS-ALPHABET FOR UNDERSTANDING 

output->

*                           *
  *                       *
    *                   *
      *               *
        *           *
          *       *
            *   *
              *

*/
class V
{
	public static void main(String[] args)
	{
		int n=15;
		for (int row=0;row<n ;row++ ) 
		{
			for (int col=0;col<n;col++ ) 
			{
				
				if( row + col == n-1 && row < n/2
					|| row == col    && col < n/2+1
				  )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}