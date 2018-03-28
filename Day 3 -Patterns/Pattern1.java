/*
PRINT THE PATTERN 

1 2 3 4 
1 2 3 4 
1 2 3 4 
1 2 3 4 

*/

class Pattern4x4 
{
	public static void main(String[] args)
	{
		int n = 4;
		for (int i = 1 ;i<=n ;i++ ) {
			for (int j = 1 ;j<=n ;j++ ) {
				System.out.print(j+" ");
			}
			System.out.println("");
		}
	}
}