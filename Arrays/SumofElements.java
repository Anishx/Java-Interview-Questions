//sum of array elements

import java.util.Scanner;

class SumofElements 
{
	public static int add(int[] ar)
	{
		int sum = 0;
		for (int j = 0;j<ar.length;j++ ) 
		{
				sum = sum + ar[j];	
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number of elements ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] ar = new int[num];

		System.out.println("Enter the array elemets : ");
		for (int i = 0  ;i<ar.length; i++) 
		{
			ar[i] = sc.nextInt();
		}

		int sum = add(ar);
		System.out.println("The sum is = "+sum);
	}
}