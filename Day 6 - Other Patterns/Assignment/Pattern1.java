/*

Output of the Program

1
3  2
6  5 4
10 9 8 7

*/

class Pattern1 
{
	public static void main(String[] args)
	{
		int n = 5;
		int a = 1;
		for (int i = 1; i<n ;i++) 
		{
			for (int j = 1; j<=i ;j++) 
			{
				if(i>j)
				{
					System.out.print(a--+" ");
				}
				else
					System.out.print(a+" ");
			}
			a = a + (2*i);
			System.out.println();
		}
	}
}