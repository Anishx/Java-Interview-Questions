package com.StringsDemo;

import java.util.Scanner;

public class ConvertWord {
	static String [] one = {"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve",
			"thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
	static String [] two = {"","","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};

	public static void concat(int num,String s1) {
		if(num > 19) {
			System.out.print(two[num/10]+" "+ one[num%10]);
		}
		else {
			System.out.print(one[num]);
		}
		if(num > 0)
		{
			System.out.print(s1);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string");
		int num =sc.nextInt();
		concat(num/10000000," crores ");
		concat((num/100000)%100," lakhs ");
		concat((num/1000)%100," thousand ");
		concat((num/100)%10," hundred ");
		concat((num)%100,"");

	}

}
