/*

Output of the Program

4
3 3
2 2 2
1 1 1 1

*/

class Pattern4 
{
	public static void main(String[] args)
	{
		int n = 4;
		int a = 4;
		for (int i = 1;i<=n ;i++ ) 
		{
			for (int j = 1;j<=i ;j++ ) 
			{
				System.out.print(a+" ");
			}
			a = a-1;
			System.out.println();
		}
	}
}