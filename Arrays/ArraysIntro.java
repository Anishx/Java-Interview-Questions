class ArraysIntro 
{
	public static void main(String[] args)
	{
		//declaration
		int []ar;

		//creation of array 
		ar = new int[5];

		//utilization
		System.out.println("ar 0 = "+ar[0]);
		System.out.println("ar 1 = "+ar[1]);
		System.out.println("ar 2 = "+ar[2]);
		System.out.println("ar 3 = "+ar[3]);
		System.out.println("ar 4 = "+ar[4]);

		//initialization
		ar[0] = 15;
		ar[1] = 25;
		ar[2] = 35;
		ar[3] = 45;
		ar[4] = 55;

		//simplifying utilization
		//length variable is a final, non-static variable which cannot be re-initialized
		for(int i = 0;i<ar.length;i++)
		{
			System.out.println("ar["+i+"]="+ar[i]);
		}

	}
}