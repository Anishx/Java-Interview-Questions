/*
count the number of repeated elements in the given array 

OUTPUT style
----------------------
3 - repeated 2 times
2 - repeated 1 times
1 - repeated 0 times
*/

import java.util.Scanner;

class RepeatedElements 
{
	public static void rep(int[] ar)
	{
		int n = ar.length;
		for (int i = 0;i<n ;i++ ) 
		{
			int count = 0;

			for (int j = i+1 ;j<n ;j++ ) 
			{
				if (ar[i]==ar[j]) 
				{
					count++;
					int k = j ;
					while(k<n-1)
					{
						ar[k]=ar[k+1];
						k++;
					}
					n--;
					j--;	
				}
			}
			System.out.println("number = "+ar[i]+" repeated =  "+count);		
		}
		// System.out.println("The unique elements are ");
		// for (int i = 0;i<n ;i++ ) 
		// {
		// 	System.out.println(ar[i]+" ");
		// }
	}

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int size = s.nextInt();

		System.out.println("Enter the Values: ");
		int[] ar = new int[size];

		for (int i = 0;i<ar.length ;i++ ) 
		{
			ar[i]= s.nextInt();	
		}
		rep(ar);	
	}
}