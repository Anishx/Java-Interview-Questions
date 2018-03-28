/*
wap to reverse given string using recursion 
*/

import java.util.Scanner;

class RecursionReverse
{
	static String b = "";
	static int i = 0 ;
	public static String reverse(String a)
	{
		while(i != a.length()) 
		{
			b = a.charAt(i)+b;
			i++;
			reverse(a);	
		}
		return b;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc1 = new Scanner(System.in);
		String a = sc1.next();

		String b = reverse(a);
		System.out.println(b);
	}
}