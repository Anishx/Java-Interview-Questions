/*

Make use of the LEGENDS-Other Patterns for reference 

Output of the program 

* * * * * *
*       *
*     *
*   *
* *
*

*/
class Pattern9
{
	public static void main(String[] args)
	{
		int n=6;
		for (int row=0 ;row<n ;row++ ) 
		{
			for(int col=0;col<n;col++)
			{
				if(row == 0 || col == 0 || row + col == n-1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}