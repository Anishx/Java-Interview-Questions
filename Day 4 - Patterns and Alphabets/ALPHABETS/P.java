/*

USE SKELETON IN LEGENDS-ALPHABET FOR UNDERSTANDING 

output->

* * * * * * *
*             *
*             *
*             *
*             *
*             *
*             *
* * * * * * *
*
*
*
*
*
*
*

*/
class P
{
	public static void main(String[] args)
	{
		int n=15;
		for (int row=0;row<n ;row++ ) 
		{
			for (int col=n/2;col<n;col++ ) 
			{
				
				if(col == n/2  
					|| row == 0 && col!=n-1
					|| col == n-1 && row < n/2 && row !=n/2 && row != 0
					|| row == n/2 && col != n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}