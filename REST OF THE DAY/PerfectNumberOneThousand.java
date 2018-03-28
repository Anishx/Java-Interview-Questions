// wap to determine wheather a given number is PERFECT NUMBER or NOT from 1 - 10,000

import java.util.Scanner;

class PerfectNumberOneThousand 
{
	public static int perfect(int num)
	{
		int sum =0;

		for (int i =1;i<=num/2 ;i++ ) 
		{
			if(num%i == 0)
				sum = sum+i;
		}
			return sum;
	}
	public static void main(String[] args)
	{
		// System.out.println("Enter the Number ");
		// Scanner sc = new Scanner(System.in);
		// int x = sc.nextInt();
		for (int i = 1;i<10000 ;i++ ) 
		{
			int y = perfect(i);
			if(y == i)
				System.out.println(y + " is a perfect number");
		}
		//boolean y = perfect(x);
	}
}