/*
DecimalToBinary -> mathematically done through LCM method 

Through
Succesive division 
*/

import java.util.Scanner;

class DecimalToOctal 
{
	static int rem = 1;
	public static int binary(int num)
	{
		String res = "";
		while(num>0)
		{
			int rem = num % 8; // reminder
			res = rem + res ;
			num = num/8; 
		}
		int n1 = Integer.parseInt(res);
		return n1; 
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number->");

		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();

		int x = binary(num);
		System.out.println("The Binary number is = "+x);

	}
}