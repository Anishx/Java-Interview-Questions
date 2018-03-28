/*

Using Ex- OR method

*/

class SwapWithoutTemp 
{
	public static void main(String[] args)
	{
		int a = 10;
		int b = 5;
		System.out.println("Values before swapping are "+ a +" & "+b);

		a = a ^ b ;
		b = a ^ b ;
		a = a ^ b ;

		System.out.println("Values after swapping are "+ a +" & "+b);
	}
}