/*
String - object -> immutable -> once created cannot be modified

no inbuilt-> reverse

its there in stringbuilder and string buffer classes 

*/
import java.util.Scanner;

class Reverse
{
	public static String tochar(String a)
	{
		String b = "";
		int len = a.length();
		for (int i = len-1 ;i>=0 ;i-- ) 
		{
			b = b + a.charAt(i);	
		}
		return b;
	}

	public static String tochararray(String a)
	{
		String res = "";
		char[] ch  = a.toCharArray();
		for (int i = 0;i<ch.length ;i++ ) 
		{
			res = ch[i]+res;		
		}	
		return res;
	}

	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc1 = new Scanner(System.in);
		String a = sc1.next();
		String res1 = tochar(a);
		String res  = tochararray(a);

		System.out.println("Using charAt the reverse string is :"+res1);

		System.out.println("Using toCharArray the reverse string is:"+res);
	}
	//can be done as char array as well ... 
}