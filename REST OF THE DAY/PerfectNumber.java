// wap to determine wheather a given number is PERFECT NUMBER or NOT

import java.util.Scanner;

class PerfectNumber 
{
	public static boolean perfect(int num)
	{
		int sum =0;
		for (int i =1;i<=num/2 ;i++ ) 
		{
			if(num%i == 0)
				sum = sum+i;
		}
		if(sum == num)
			return true;
		
		else
			return false;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the Number ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		boolean y = perfect(x);
		System.out.println("is it a perfect Number ? ");
		System.out.println(y);
	}
}