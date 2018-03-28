/*
PRINT THE PATTERN ->
1 3 5 7
1 3 5 7
1 3 5 7
*/

class Pattern3
{
	public static void main(String[] args)
	{
		int n = 7;
		for (int i = 1 ;i<=3 ;i++ ) {
			for (int j = 1 ;j<=n ;j++ ) {
				System.out.print(j+" ");
				j+=1;
			}
			System.out.println("");
		}
	}
}