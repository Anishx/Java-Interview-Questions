// class Exor1
// {
// 	public static void main(String[] args)
// 	{
// 		int a=3;
// 		int b=5;
// 		System.out.println("a&b="+(a&b));
// 		System.out.println("a|b="+(a|b));
// 		System.out.println("a^b="+(a^b));
// 	}
// }

import java.util.Scanner;

public class Exor1 {

    private static void fun(String left,int right)
    {
	    	System.out.printf("%-15s%03d%n", left, right);	
    }
    public static void main(String[] args) 
    {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String text =sc.next();
                int number=sc.nextInt();
	            fun(text,number);
            }
            System.out.println("================================");

    }
}
