class StrongMod 
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
		int num = 145;
		int sum = 0;
		int temp = num;
		while(num>0)
		{
			int rem = num%10;
			sum = sum + isFact(rem);
			num = num/10;
		}

		System.out.println(sum);

		if(temp == sum)
			System.out.println("Strong number");
		else
			System.out.println("Not Strong number");
	}
}

/*

Assignmnment

Write a program to display the strong numbers from one to 10,000 


*/