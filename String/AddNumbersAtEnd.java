/*
WRTIE A PROGRAM TO COUNT THE NUMBER OF CHARACTERS IN A WORD AND PRINT IT AFTER THE WORD

INPUT->
THIS IS A STRING

OUTPUT->
THIS4 IS2 A1 STRING6

*/

import java.util.Scanner;

class AddNumbersAtEnd
{
	public static void operation(String s1)
	{
		String res = "";
		char ch[] = s1.toCharArray();
		for (int i = 0;i<ch.length ;i++ ) 
		{
			int count = 0;
			while(i<ch.length && ch[i]!=' ')
			{
				res = res + ch[i];
				count++;
				i++;
			}	
			res = res+count+" ";
		}
		print(res);
	}

	public static void print(String s1)
	{
		System.out.println("Converter string = "+s1);	
	}

	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the string");

		String s1 = sc1.nextLine();

		operation(s1);
		//count till space
	}
}
