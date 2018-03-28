/*
PRINT THE PATTERN 
7 6 5
7 6 5
7 6 5
*/

class Pattern2 
{
	public static void main(String[] args)
	{
		for (int i = 7 ;i>=5 ;i--) 
		{
			for (int j=7 ;j>=5 ;j--) 
			{
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}