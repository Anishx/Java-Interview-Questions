/*
RECURSION
--------------------------------------------------------------------------------------

power of a given number without using built-in function
built- in 

//static method 
math.pow(double num, double pow)

*/
import java.util.Scanner;
class PowerRec
{ 
	static double sum = 1;
	public static double pow(double num,double pwr)
	{
		if(pwr>0)
		{
			sum = sum * num;
			pwr--;
			pow(num,pwr);
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner sc1 = new Scanner(System.in);
		double num = sc1.nextDouble();

		System.out.println("Enter its power");
		double pwr = sc1.nextDouble();

		double res = pow(num,pwr);

		System.out.println("The result is = "+res);
	}
}

/*

TRACING
----------------------------------------------------------
				2>0
				sum = sum * n;    1 = 1 * 2 = 2
				p-- = 1

				1>0
				2 = 2 * 2 = 4 
				4

				0>0 !fails

				returns 4

				-----------------------------------------------------	

				3>0 

				1 = 1 * 3 = 3
				p-- = 2 

				2>0
				3 = 3 * 3 = 9 
				p-- = 1

				1>0 
				9 = 9 * 3 = 27 







			*/ 