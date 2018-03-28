class Inc3
{
	public static void main(String[] args)
	{
		byte b = 2;
		System.out.println("b ="+b++);
		System.out.println("b(re) ="+b);
		System.out.println();

		//byte c = c+1; wont work bc higher dt = higher dt + lower dt which doesn't follow

		int c = b+1;
		System.out.println("c = "+c); 
	}
}