package com.StringsDemo;

import java.util.Scanner;

public class CountOfWord {
	public static int countWord(String s1) {
		int count = 1;
		char ch[] = s1.toCharArray();
		if(ch[0] == ' ')
		{
			count = 0;
		}
		for (int i = 0; i < ch.length; i++) {
			if(i < ch.length-1 && ch[i] == ' ' && ch[i+1] != ' ')
				count++;
		}
		return count;
	} 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		String s1 =sc.nextLine();
		int c1 = countWord(s1);
		System.out.println("the number of words in "+ s1 + " = ");
		System.out.println(c1);
	}

}
