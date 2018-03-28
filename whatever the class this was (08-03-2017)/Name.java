class Name
{
	public static void methda()
	{
		int a=1, i, j;
		for (i=0; i<=4; i++)
		{
			for (j=0; j<=i; j++)
			{
				if (j>=1)
					System.out.print("*");
				System.out.print(a);
				a++;
			}
			System.out.println();
		}
		a = 11;
		for (i=4; i>=0; i--)
		{
			for (j=i;j>=0; j--)
			{
				System.out.print(a);
				if (j>0)
					System.out.print("*");
				a++;
			}
			a-=2*i-1;
			System.out.println();
		}
		return;
	}
	public static void main(String[] args)
	{
		methda();
	}
}
