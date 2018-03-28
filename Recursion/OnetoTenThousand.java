/*

Assignmnment ->

Write a program to display the strong numbers from one to 10,000 


*/

class OnetoTenThousand 
{
	public static int isFact(int num)
	{
		int fact = 1;
		while(num>1)
		{
			fact = fact * num--;
		}
		return fact;
	}
	public static void main(String[] args)
	{
		for(int i = 0 ; i<=10000;i++)
		{	
			int num = i;

			int sum = 0;
			int temp = num;
			while(num>0)
			{
				int rem = num%10;
				sum = sum + isFact(rem);
				num = num/10;
			}
			if(temp == sum)
			{
				System.out.print(i+" ");
			}
		}
	}
}

