package com.StringsDemo;

import java.util.Scanner;

public class StringCOunt {
	public static String CountOfWord(String s1) {
		String res = "";
		char ch[] = s1.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int sum = 0;
			while(i<ch.length&&ch[i]!=' ') {
				if(ch[i]>=48 && ch[i] <= 57) {
					sum = sum + ch[i] - 48;
				}
				else if (ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122 ) {
					res = res + ch[i];
				}
				i++;
			}
			res = res + sum + " ";
		}
		return res;		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a string");
		String s1 = sc.nextLine();
		String rev = CountOfWord(s1);
		System.out.println("the modified string is" + rev);
	}

}
