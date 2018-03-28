import java.util.Scanner;

class BiggestInTriangle
{
	public static void big(int[][] ar)
	{
		int ubig = ar[0][1];
		int lbig = ar[1][0]; 
		int dbig = ar[0][0];
		for (int i = 0;i<ar.length ;i++ ) 
		{
			for (int j = 0;j<ar.length ;j++ ) 
			{
				if(i==j) 
				{
					if(dbig<ar[i][j])
						dbig = ar[i][j];		
				}	
				else if(i>j) 
				{
					if(lbig<ar[i][j])
						lbig = ar[i][j];
				}
				else if (i<j) 
				{
					if (ubig<ar[i][j]) 
					{
						ubig = ar[i][j];	
					}
				}
			}
		}
		System.out.println("The diagonal big = "+dbig+"\nlower big = "+lbig+"\nupper big = "+ubig);
	}
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the rows ");
		int x = sc1.nextInt();
		System.out.println("ENter the columns");
		int y = sc1.nextInt();

		int[][] a = new int[x][y];

		for (int i = 0;i<x;i++ ) 
		{
			for (int j = 0;j<y ;j++ ) 
			{
				System.out.print("Enter the row = "+i+" & col = "+j+"th element: ");
				a[i][j]=sc1.nextInt();
				System.out.println();
			}	
		}
		System.out.println();
		System.out.println("The Scanned matrix: ");
		for (int i = 0;i<x;i++ ) 
		{
			for (int j = 0;j<y ;j++ ) 
			{
				System.out.print(a[i][j]+" ");
			}	
			System.out.println();
		}
		big(a);
	}
}