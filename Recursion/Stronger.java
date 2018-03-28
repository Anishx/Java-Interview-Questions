/*
   if 1! + 4! + 5! = 1 4 5
		Then this is a strong a number 

		/*
		// 1 4 5
		System.out.println("Enter a number: \n");
		
		//input
		Scanner sc1 = new Scanner(System.in); 
		Int i = sc1.nextInt();

		//extract units place of a number

		int units = i % 10;
		System.out.println("units digit = "+units);

		//extract 10s place of the number 

		int tens = ((i - units)/10)%10;     //   1 4 5 - 5 == 140 /10 == 14 == 14%10 

		//extract 100s place 
		.
		.
		.
		.
		*/
*/

import java.util.Scanner;

public class Stronger
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
		System.out.println("Enter the number:");
		Scanner sc1 = new Scanner(System.in); 
		Int num = sc1.nextInt();
		while(num > 0)
		{
			int rem = num%10;
			sum     = sum + isFact(rem);
			num = num / 10; 
		}

	}

}
