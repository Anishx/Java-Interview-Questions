/*
check if the given two strings are ANAGRAMS or not 

Definition:
If a String 2 is constructed of the same characters of String 1 where character positions are different between String 1 and String 2 then, String 2 is a Anagram of String 1 

Example:
MOTHER IN LAW

AND

HITLER WOMAN are Anagrams of each other...

*/

import java.util.Scanner;

class Anagram
{
	public static String removespace(String s1)
	{
		String res = " ";
		char ch[] = s1.toCharArray();	
		for (int i = 0 ;i<ch.length ;i++ ) 
		{
			if (ch[i]!=' ') 
				res = res+ch[i];
		}
		return res;
	}

	//to upper case
	public static String cased(String s1)
	{
		String res = " ";
		char ch[] = s1.toCharArray();
		for (int i = 0 ;i<ch.length ;i++ ) 
		{
			int x;
			if(ch[i]>=97 && ch[i]<=123)
			{
				ch[i] = (char)(ch[i]-32);
			}	
			res = res+ch[i];
		}
		return res;
	}

	public static String sort(String s1)
	{
		String res = " ";
		char ch[] = s1.toCharArray();

		for (int i = 0 ;i<ch.length ;i++ ) 
		{
			for (int j= i+1 ;j<ch.length ;j++ ) 
			{
				if(ch[i]<ch[j])
				{
					char c1 = ch[i];
					ch[i]   = ch[j];
					ch[j]   = c1;
				}
			}
			res = res + ch[i];
		}
		return res;
	}

	public static boolean compareit(String s1,String s2)
	{
		int x=0;
		for (int i = 0;i<s1.length() ;i++ ) 
		{
			if(s1.charAt(i)==s2.charAt(i))
				x=0;
			else
				x=1;
		}	
		if(x==0)
			return true;
		return false;
	}
	public static void main(String[] args)
	{
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the 2 strings");

		String s1 = sc1.nextLine();
		String s2 = sc1.nextLine();

		String res1 = removespace(s1);
		String res2 = removespace(s2);

		System.out.println("The Strings without space: "+res1+", THe string 2 = "+res2);
		System.out.println("");

		if (res1.length()!= res2.length()) 
		{
			System.out.println("String is not an Anagram");
			System.out.println("");
		}
		else
		{
			//casing
			res1 = cased(res1);
			res2 = cased(res2);
			
			System.out.println("The Strings with Same case String1: "+res1+" and The string 2 = "+res2);

			//sorting
			res1 = sort(res1);
			res2 = sort(res2);
			System.out.println("The Strings Sorted -> String1: "+res1+" and The string 2 = "+res2);

			boolean resy = compareit(res1,res2);
			if (resy == true) 
			{
				System.out.println("");
				System.out.println("THEY ARE ANAGRAMS");
			}
			else
				System.out.println("Not Anagram");
		}

	}
}