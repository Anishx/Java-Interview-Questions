/*
Delete repeated values of Array
*/

import java.util.Scanner;

class DeleteRepeatedElements 
{
	public static void del(int[] ar)
	{
		for (int i = 0;i<ar.length ;i++ ) 
		{
			for (int j = i+1 ;j<ar.length ;j++ ) 
			{
				if (ar[i]==ar[j]) 
				{
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
			//print unique elements here from a[i=0 -> n]		
		}
		return ar;
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

		del(ar);	
	}
}