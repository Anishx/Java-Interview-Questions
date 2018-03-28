class Sample 
{
	static int count = 1;
	static void test()
	{
		System.out.println("Executing test with count = "+count);
		if(count<5)
		{
			count++;
			test();
		} 
	}
	public static void main(String[] args)
	{
		test();
	}
}