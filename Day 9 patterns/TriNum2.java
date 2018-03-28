/*

output of code

      1
    1 2 1
  1 2 3 2 1
1 2 3 4 3 2 1

*/

class TriNum2
{
	public static void main(String[] args)
	{
		int n =4;
		for (int rows = 1;rows<=n ;rows++ ) 
		{
			int count = 1;
			for (int k =0 ;k<=n-1-rows ;k++ ) 
			{
				System.out.print("  ");	
			}

			for (int col = 1 ;col<2*rows ;col++ ) 
			{
				if(col<rows)
					System.out.print(count++ +" ");
				else
					System.out.print(count--+" ");
			}
			System.out.println();
		}
	}
}