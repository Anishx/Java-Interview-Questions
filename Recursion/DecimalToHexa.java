/*
DecimalTohexa -> mathematically done through LCM method 

Through
Succesive division 
*/

import java.util.Scanner;

class DecimalToHexa
{
	static double rem = 1.0;
	static int hex = 0 ;
	static String res = "";

	public static String hexa(int num)
	{
		//1128
		if(num>0)
		{
			 double quo = num /16;   // 1128/16 = 70.5 - double
			 num = num /16;		     // 1128/16 = 70   - int

			 rem = quo - num; // 70.5-70 = 0.5
			 hex = (int)(rem * 16);	 //0.5*16 	= 8	
			 res = hex+res; 		 // res = 8 + ""
			 hexa(num);
		}
		return res; 
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the number->");

		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();

		String x = hexa(num);
		System.out.println("The Hexadecimal of the number is = 0x"+x);

	}
}