import java.util.Scanner;

public class Factorial {

	static long fact = 1;
	public static long fact(long num)
	{
		if(num>1)
		{
			fact = fact * num--;
			fact(num);
		}
		// else
		// 	System.out.println("factorial of the number = "+fact);
		return fact;
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		System.out.println("Enter the number:\n");
		Scanner s1 = new Scanner(System.in);
		long a = s1.nextLong();
		long x = fact(a);
		System.out.println("factorial = "+x);

	}

}
