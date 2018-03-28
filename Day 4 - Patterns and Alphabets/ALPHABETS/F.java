/*

USE SKELETON IN LEGENDS-ALPHABET FOR UNDERSTANDING 

output->

* * * * * * * * *
*
*
*
* * * * * * * * *
*
*
*
* 

*/
class F
{
	public static void main(String[] args)
	{
		int n=9;
		for (int row=0;row<n ;row++ ) 
		{
			for (int col=0;col<n;col++ ) 
			{
				
				if(row == 0 	 
				   || col == 0    
				   || row == n/2 
				  )
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}