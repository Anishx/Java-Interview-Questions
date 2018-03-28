/*
find the nth maximum number of the given array 

sorting in ascending order

10 	5	24	52	1
--- --- --- --- ---
0	1	2	3	4	

Swap numbers without temp 
a = 10
b = 5

a = a + b
b = a - b
a = a - b

a = a * b 
b = a / b
a = a / b

Using Bitwise Operators 

*/
import java.util.Scanner;
class NthMaxNumber 
{
	public static int[] nmax(int[] ar)
	{
		for (int i = 0;i<ar.length ;i++ ) 
		{
			for (int j = i+1 ;j<ar.length ;j++ ) 
			{
				if(ar[i]>ar[j])
				{
					ar[i] = ar[i] ^ ar[j] ;
					ar[j] = ar[i] ^ ar[j] ;
					ar[i] = ar[i] ^ ar[j] ;
				}
			}		
		}
		return ar;
	}
	public static void main(String[] args)
	{

		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the size : ");
		int size = s.nextInt();

		System.out.println("Enter the Values: ");
		int[] ar = new int[size];

		for (int i = 0;i<ar.length ;i++ ) 
		{
			ar[i]= s.nextInt();	
		}

		int[] ar1 = nmax(ar);

		System.out.println("The elements are:");
		for (int i = 0;i<ar1.length ;i++ ) 
		{
			System.out.println(ar1[i]);	
		}
		
		
		System.out.println("Enter the number:");
		int n = s.nextInt();

		System.out.println("The nmax Elements are ");
		int index = ar1.length-n;

		System.out.println("The"+n+"the max number is "+ar1[index]);
	}
}