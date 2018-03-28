/*

output of code

      A
    A * B
  A * B * C
A * B * C * D

*/

class TriAlpha 
{
	public static void main(String[] args)
	{
		int n =4;
		for (int i = 1;i<=n ;i++ ) 
		{
			for (int k =n-1-i ;k>=0 ;k-- ) 
				System.out.print("  ");	
			for (int j = 1 ;j<=i ;j++ ) 
			{
				int x = j + 64;
				char m = (char)x;
				if(j==i)
					System.out.print(m);
				else	
					System.out.print(m+" * ");
			}
			System.out.println();
		}
	}
}