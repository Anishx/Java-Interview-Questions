/*

output 1 
* * * * * * * * *
*       *
*       *
*       *
* * * * * * * * *
*       *
*       *
*       *
*       *
To eliminate the right half of the pattern we use the for loop which can be 
reduced to n/2 from n so that the right half of the pattern is eliminated 
from printing 

Final output
* * * * * * * *
*             *
*             *
*             *
*             *
*             *
*             *
* * * * * * * *
*             *
*             *
*             *
*             *
*             *
*             *
*             *

*/
class A
{
	public static void main(String[] args)
	{
		int n=15;
		for (int i=0;i<n ;i++ ) 
		{
			for (int j=0;j<=n/2 ;j++ ) 
			{
				// WE NEED HALF COLUMN
				if(j == 0 || j == n/2 || i == 0 || i == n/2)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}