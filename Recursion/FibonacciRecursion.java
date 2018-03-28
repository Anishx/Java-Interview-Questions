// first 10 fib series using recursion 
import java.util.Scanner;
class FibonacciRecursion 
{
	static int count = 8;
	public static void fib(int x,int y)
	{
		if(count>0)
		{
			int z = x+y;
			System.out.println(x);
			x = y;
			y = z;
			count--;
			fib(x,y);
		}
	}
	public static void main(String[] args)
	{
		fib(0,1);
	}
}
