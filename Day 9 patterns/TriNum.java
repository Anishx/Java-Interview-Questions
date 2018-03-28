/*

output of code

      1
    1 * 2
  1 * 2 * 3
1 * 2 * 3 * 4

*/

class TriNum 
{
	public static void main(String[] args)
	{
		int n =4;
		for (int i = 1;i<=n ;i++ ) 
		{
			for (int k =n-1-i ;k>=0 ;k-- ) 
			{
				System.out.print("  ");	
			}
			for (int j = 1 ;j<=i ;j++ ) 
			{
				if(j==i)
					System.out.print(j);
				else	
					System.out.print(j+" * ");
			}
			System.out.println();
		}
	}
}