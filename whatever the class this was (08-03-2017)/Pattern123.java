
class Pattern123
{
	public static void main(String[] args)
	{
		int count=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count+"*");
				count++;
			}

			System.out.println(" ");
		}
		count=15;
		for(int k=1;k<=5;k++)
		{
			for(int l=5;l>=k;l--)
			{

				System.out.print(count+"*");
				count--;
				
			}
			System.out.println(" ");

		}
		
		
	}
}