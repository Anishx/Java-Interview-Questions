import java.util.Scanner;

class AntiClockwiseCyclic
{
	public static void cycle(int x)
	{
		int ar[][] = new int[x][x];
		int count = 1;
		
		for (int start = ar.length-1 ,end = 0 ;start>end ;start--,end++) 
		{
			for (int i = start ;i<end ;i++ ) 
			{
				ar[start][i]=count++;
			}

			for (int i = start ;i<end ;i++ ) 
			{
				ar[i][end]=count++;
			}

			for (int i = end ;i>start ;i-- ) 
			{
				ar[end][i]=count++;
			}

			for (int i = end;i>start ;i-- ) 
			{
				ar[i][start]=count++;
			}
		}
		if(ar.length%2!=0)
				ar[ar.length/2][ar.length/2] = count++;

		PrintMatrix(ar,x);
	}
	
	public static void PrintMatrix(int[][] ar,int x)
	{
		System.out.println("The matrix");
		for (int i = 0;i<x;i++ ) 
		{
			for (int j = 0;j<x ;j++ ) 
			{
				System.out.print(ar[i][j]+"	");
			}	
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the rows and col ");
		int x = sc1.nextInt();

		cycle(x);
	}
}